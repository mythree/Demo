package com.sampleproject.connection.demo.model;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;


import java.lang.String;


public class Travel  {


    private String origin;
    private String desination;


    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDesination(String desination) {
        this.desination = desination;
    }
    public String getOrigin() {
        return origin;
    }

    public String getDesination() {
        return desination;
    }

    @Override
    public String toString() {
        return "Travel{" +
                "origin='" + origin + '\'' +
                ", desination='" + desination + '\'' +
                '}';
    }

    public Travel(String origin, String desination) {
        this.origin = origin;
        this.desination = desination;
    }

}
