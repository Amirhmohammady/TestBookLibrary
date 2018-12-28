package com.LibBookCo.BookLibrary.controller;

import com.LibBookCo.BookLibrary.model.TOs.BookTO;
import com.LibBookCo.BookLibrary.model.bl.BookManager;

import java.util.List;

/**
 * Created by Amir on 12/29/2018.
 */
public class RequestExecutor {
    long addresult;
    List<BookTO> searchresult;
    public RequestExecutor(RequestOBJ requestOBJ) {
        switch (requestOBJ.getMethod()) {
            case "add":
                addToDatabase(requestOBJ.getBookTO());
                break;
            case "search":
                searchFromDatabase(requestOBJ.getBookTO());
                break;
        }
    }
    private long addToDatabase(BookTO bookTO){
        return addresult;
    }
    private List<BookTO> searchFromDatabase(BookTO bookTO){
        return searchresult;
    }
}
