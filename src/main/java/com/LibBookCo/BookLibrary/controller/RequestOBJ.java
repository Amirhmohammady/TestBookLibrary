package com.LibBookCo.BookLibrary.controller;

import com.LibBookCo.BookLibrary.model.TOs.BookTO;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
import java.util.Set;

/**
 * Created by Amir on 12/28/2018.
 */
public class RequestOBJ {
    private String page;
    private BookTO bookTO;
    private String method;

    RequestOBJ(HttpServletRequest request) {
        try {
            page = request.getRequestURI();
            page = page.substring(page.indexOf('/', page.indexOf('/') + 1) + 1);
            if (page.equals("")) page = "Admin.jsp";
            bookTO = new BookTO();
            bookTO.setName(request.getParameter("book_name"));
            bookTO.setAuthor(request.getParameter("author"));
            bookTO.setISBN(request.getParameter("isbn"));
            method = request.getParameter("method");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public String getMethod() {
        return method;
    }

    public BookTO getBookTO() {
        return bookTO;
    }

    public String getPage() {
        return page;
    }
}
