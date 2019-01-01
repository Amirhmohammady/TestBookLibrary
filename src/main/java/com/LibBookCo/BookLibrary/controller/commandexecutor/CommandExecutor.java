package com.LibBookCo.BookLibrary.controller.commandexecutor;


import com.LibBookCo.BookLibrary.model.TOs.BookTO;
import com.LibBookCo.BookLibrary.model.bl.BookManager;

import java.util.List;

/**
 * Created by Amir on 12/24/2018.
 */
public class CommandExecutor {
    MethodOBJ searchresult, issearchsucces, addcontact, isaddsucces, removecontact, isremoved;
    BookTO bookTO;
    List<String> result;
    BookManager bookManager;

    public CommandExecutor(BookTO bookTO) {
        searchresult = new MethodOBJ();
        issearchsucces = new MethodOBJ();
        addcontact = new MethodOBJ();
        isaddsucces = new MethodOBJ();
        removecontact = new MethodOBJ();
        isremoved = new MethodOBJ();
        this.bookTO = bookTO;
        bookManager = new BookManager();
    }

    public List<String> execute(String methodname) {
        return null;
    }

    public List<String> isAddSucces() {
        if (addcontact.isdone == 3) addContact();
        if (isaddsucces.isdone == 3) {
            if (searchresult.output.size() > 0) isaddsucces.output.add("Successfully Added Contact.");
            else isaddsucces.output.add("Can not Add Contact.");
            isaddsucces.isdone = 1;
        }
        return isaddsucces.output;
    }

    public List<String> addContact() {
        if (addcontact.isdone == 3) {
            bookManager.update(bookTO);
            addcontact.output.add(bookTO.getName());
        }
        return addcontact.output;
    }

    public List<String> isSearchSucces() {
        if (searchresult.isdone == 3) searchResult();
        return null;
    }

    public List<String> searchResult() {
        long id = new BookManager().insert(bookTO);
        if (id > 0) {
            //resultOBJ.setAddResultID(id);
            //resultOBJ.setSucsses(true);
            //resultOBJ.setOutputmethodresult(requestOBJ.getMethod());
        } //else resultOBJ.setSucsses(false);
        return null;
    }
}
