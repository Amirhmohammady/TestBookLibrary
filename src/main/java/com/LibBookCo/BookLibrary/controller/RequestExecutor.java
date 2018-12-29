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

    private void addToDatabase(BookTO bookTO) {
        addresult = new BookManager().insert(bookTO);
    }

    private void searchFromDatabase(BookTO bookTO) {

    }

    public long getAddResult() {
        return addresult;
    }

    public List<BookTO> getSearchResult() {
        return searchresult;
    }
}
