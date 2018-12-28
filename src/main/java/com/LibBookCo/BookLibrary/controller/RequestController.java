package com.LibBookCo.BookLibrary.controller;


import javax.servlet.http.HttpServletRequest;

/**
 * Created by Amir on 12/28/2018.
 */
public class RequestController {
    public RequestController(HttpServletRequest request){
        RequestOBJ requestOBJ = new RequestOBJ(request);

    }

}
