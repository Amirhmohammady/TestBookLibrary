package com.LibBookCo.BookLibrary.controller;


import javax.servlet.http.HttpServletRequest;

/**
 * Created by Amir on 12/28/2018.
 */
public class RequestController {
    RequestExecutor requestExecutor;
    ResultOBJ resultOBJ = new ResultOBJ();

    public RequestController(HttpServletRequest request) {
        RequestOBJ requestOBJ = new RequestOBJ(request);
        requestExecutor = new RequestExecutor(requestOBJ, resultOBJ);
    }

    public ResultOBJ getResult() {
        return resultOBJ;
    }


}
