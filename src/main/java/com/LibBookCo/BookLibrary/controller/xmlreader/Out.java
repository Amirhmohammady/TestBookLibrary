package com.LibBookCo.BookLibrary.controller.xmlreader;

import javax.xml.bind.annotation.*;

/**
 * Created by Amir on 12/23/2018.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Out {

    @XmlAttribute(name = "type")
    private String type;
    @XmlValue
    private String value;

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }
}
