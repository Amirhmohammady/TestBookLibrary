package com.LibBookCo.BookLibrary.controller;

import com.LibBookCo.BookLibrary.model.TOs.BookTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Amir on 12/29/2018.
 */
public class ResultOBJ {
    private boolean sucsses, isexecuted = false;
    public List<List<String>> htmlout;// = new ArrayList<List<String>>(10);

    public boolean isSucsses() {
        return sucsses;
    }

    public void setSucsses(boolean sucsses) {
        this.sucsses = sucsses;
    }

    public boolean isexecuted() {
        return isexecuted;
    }

    public void setIsexecuted(boolean isexecuted) {
        this.isexecuted = isexecuted;
    }
}
