package com.LibBookCo.BookLibrary.controller.xmlreader;

import java.io.File;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.*;

/**
 * Created by Amir on 12/30/2018.
 */
@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD)
public class XMLPropertyGetter {
    static XMLPropertyGetter pagestruct;
    static String pageXML;

    public static void setPageXML(String pageXML2) {
        pageXML = pageXML2;
    }

    public static XMLPropertyGetter getStruct() throws Exception {
        if (pagestruct == null) {
            JAXBContext jc = JAXBContext.newInstance(XMLPropertyGetter.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            File fl =new File(pageXML);
            pagestruct = (XMLPropertyGetter) unmarshaller.unmarshal(fl);
            //Marshaller marshaller = jc.createMarshaller();
            //marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            //marshaller.marshal(root, System.out);
        }
        return pagestruct;
    }

    @XmlElement(name = "page")
    private List<Page> pages;

    public Page getPage(String pagename) {
        for (Page page : pages) {
            if (page.getName().equals(pagename)) return page;
        }
        return null;
    }

}
