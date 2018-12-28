package com.LibBookCo.BookLibrary.controller.requestcontroller;

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
        page = request.getRequestURI();
        page = page.substring(page.indexOf('/') + 1, page.length());
        System.out.println();
        Map<String, String> map = (Map<String, String>) request.getParameterMap();
        bookTO = new BookTO();
        bookTO.setName(map.get("book_name"));
        System.out.println(map.get("book_name"));
        bookTO.setAuthor(map.get("author"));
        System.out.println(map.get("author"));
        bookTO.setISBN(map.get("isbn"));
        System.out.println(map.get("isbn"));
        method = map.get("method");
        System.out.println(method);
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
