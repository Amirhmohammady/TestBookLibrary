package com.LibBookCo.BookLibrary.controller;

import com.LibBookCo.BookLibrary.controller.commandexecutor.CommandExecutor;
import com.LibBookCo.BookLibrary.controller.xmlreader.Out;
import com.LibBookCo.BookLibrary.controller.xmlreader.XMLPropertyGetter;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Amir on 12/29/2018.
 */
public class RequestExecutor {
    private CommandExecutor commandExecutor;
    private ResultOBJ resultOBJ;
    private RequestOBJ requestOBJ;
    public int accessLevel = 0, positionsNum = 0;
    public XMLPropertyGetter xmlPropertyGetter;

    public RequestExecutor(RequestOBJ requestOBJ, ResultOBJ resultOBJ) {
        this.resultOBJ = resultOBJ;
        this.requestOBJ = requestOBJ;
        commandExecutor = new CommandExecutor(requestOBJ.getBookTO());
        if (requestOBJ.getMethod() != null) {
            try {
                xmlPropertyGetter = new XMLPropertyGetter();
                XMLPropertyGetter.setPageXML("D:/Developer/apache-tomcat-9.0.0.M20-windows-x86/webapps/BookLibrary/WEB-INF/classes/page.xml");
                xmlPropertyGetter = XMLPropertyGetter.getStruct();
                positionsNum = xmlPropertyGetter.getPage(requestOBJ.getPage()).getPositionsNum();
                getMemmotyForResult(positionsNum);
                accessLevel = xmlPropertyGetter.getPage(requestOBJ.getPage()).getMethod(requestOBJ.getMethod()).getAccess();
                List<Out> outs;
                for (int z1 = 1; z1 <= positionsNum; z1++) {
                    outs = xmlPropertyGetter.getPage(requestOBJ.getPage()).getMethod(requestOBJ.getMethod()).getPosition(z1).getOuts();
                    doOutPut(outs, z1);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    void getMemmotyForResult(int positionsNum) {
        resultOBJ.htmlout = new ArrayList<List<String>>(positionsNum);
        for (int z1 = 0; z1 < positionsNum; z1++)
            resultOBJ.htmlout.add(new ArrayList<String>());
    }

    void doOutPut(List<Out> outs, int position) {
        for (Out out : outs) {
            List<String> temp = new ArrayList<>();
            temp.add("1");
            temp.add("2");
            resultOBJ.htmlout.get(0).addAll(temp);
            if (out.getType().equals("string")) resultOBJ.htmlout.get(position - 1).add(out.getValue());
            else if (out.getType().equals("methodopt"))
                resultOBJ.htmlout.get(position - 1).addAll(methodopt(out.getValue()));
        }
    }

    List<String> methodopt(String methodname) {
        try {
            List<String> result;
            Method method = commandExecutor.getClass().getDeclaredMethod(methodname);
            result = (List<String>) method.invoke(commandExecutor);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
