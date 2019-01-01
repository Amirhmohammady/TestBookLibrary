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
public class Method {
    @XmlAttribute(name = "name")
    private String name;

    @XmlElement(name = "access")
    private int access;

    @XmlElement(name = "position")
    private List<Position> positions;

    public String getName() {
        return name;
    }

    public int getAccess() {
        return access;
    }

    public Position getPosition(int positionnum) {
        for (Position position:positions)
            if(position.getId()==positionnum)return position;
        return null;
    }
}
