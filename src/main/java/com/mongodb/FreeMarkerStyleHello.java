package com.mongodb;

import freemarker.template.Configuration;
import freemarker.template.Template;
import java.io.StringWriter ;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dipti on 5/31/2015.
 */
public class FreeMarkerStyleHello {

    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.setClassForTemplateLoading(FreeMarkerStyleHello.class, "/");
        try {
            Template temp = configuration.getTemplate("Hello.html" );
            StringWriter sw = new StringWriter();
            Map<String, Object> hellomap = new HashMap<String, Object>();
            hellomap.put("name", "sagar");
            temp.process(hellomap, sw);
            System.out.println(sw);
        } catch (Exception excpetion) {
            excpetion.printStackTrace();
        }
    }
}
