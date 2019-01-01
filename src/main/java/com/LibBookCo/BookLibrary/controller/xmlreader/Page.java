package com.LibBookCo.BookLibrary.controller.xmlreader;

/**
 * Created by Amir on 12/23/2018.
 */

import java.util.List;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Page {

    @XmlAttribute(name = "name")
    private String name;
    @XmlElement(name = "positionsNum")
    private int positionsNum;
    @XmlElement(name = "method")
    private List<Method> methods;

    public String getName() {
        return name;
    }

    public int getPositionsNum() {
        return positionsNum;
    }

    public Method getMethod(String methodname) {
        for(Method method:methods){
            if (method.getName().equals(methodname))return method;
        }
        return null;
    }
}


