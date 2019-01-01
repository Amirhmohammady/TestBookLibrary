package com.LibBookCo.BookLibrary.controller.xmlreader;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * Created by Amir on 12/23/2018.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Position {
    @XmlAttribute(name = "id")
    private int id;
    @XmlElement(name = "out")
    private List<Out> outs;

    public int getId() {
        return id;
    }

    public List<Out> getOuts() {
        return outs;
    }
}
