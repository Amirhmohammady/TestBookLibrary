package com.LibBookCo.BookLibrary.controller;


import javax.servlet.http.HttpServletRequest;

/**
 * Created by Amir on 12/28/2018.
 */
public class RequestController {
    RequestExecutor requestExecutor;

    public RequestController(HttpServletRequest request) {
        RequestOBJ requestOBJ = new RequestOBJ(request);
        requestExecutor = new RequestExecutor(requestOBJ);
    }

    public long getAddResult() {
        return requestExecutor.getAddResult();
    }


}
