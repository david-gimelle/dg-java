package com.davidgimelle.tutorial.resteasyjquerygetjson.element;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author gimelled
 */
@XmlRootElement(name = "world")
public class World {

    private String message;

    @XmlElement
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
