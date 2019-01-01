package com.LibBookCo.BookLibrary.controller.commandexecutor;


import com.LibBookCo.BookLibrary.model.TOs.BookTO;
import com.LibBookCo.BookLibrary.model.bl.BookManager;

import java.util.List;

/**
 * Created by Amir on 12/24/2018.
 */
public class CommandExecutor {
    MethodOBJ searchresult, issearchsucces, addbook, isaddsucces, removebook, isremoved;
    BookTO bookTO;
    List<String> result;
    BookManager bookManager;

    public CommandExecutor(BookTO bookTO) {
        searchresult = new MethodOBJ();
        issearchsucces = new MethodOBJ();
        addbook = new MethodOBJ();
        isaddsucces = new MethodOBJ();
        removebook = new MethodOBJ();
        isremoved = new MethodOBJ();
        this.bookTO = bookTO;
        bookManager = new BookManager();
    }

    public List<String> execute(String methodname) {
        return null;
    }

    public List<String> isAddSucces() {
        if (addbook.isdone == 3) addBook();
        if (isaddsucces.isdone == 3) {
            if (addbook.output.size() > 0) isaddsucces.output.add("Successfully Added Book.");
            else isaddsucces.output.add("Can not Add Book.");
            isaddsucces.isdone = 1;
        }
        return isaddsucces.output;
    }

    public List<String> addBook() {
        if (addbook.isdone == 3) {
            bookManager.update(bookTO);
            addbook.output.add(bookTO.getName());
        }
        return addbook.output;
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
