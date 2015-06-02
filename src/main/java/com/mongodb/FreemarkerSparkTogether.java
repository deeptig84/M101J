package com.mongodb;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import spark.Request;
import spark.Route;
import spark.Spark;

public class FreemarkerSparkTogether {

	public static void main(String[] args) {

        final Configuration configuration = new Configuration();
        configuration.setClassForTemplateLoading(FreemarkerSparkTogether.class, "/");
		    	
		        Spark.get("/", new Route() {

					public Object handle(final Request request, final spark.Response response)
							throws Exception {
						StringWriter sw = new StringWriter();
						// TODO Auto-generated method stub
						try {
				            Template temp = configuration.getTemplate("Hello.html" );
				            
				            Map<String, Object> hellomap = new HashMap<String, Object>();
				            hellomap.put("name", "sagar");
				            temp.process(hellomap, sw);
				           
				        } catch (Exception excpetion) {
				        	halt(500);
				            excpetion.printStackTrace();
				        }
						
						return sw;
					}
		        }

		        );

		    

	}

	protected static void halt(int i) {
		// TODO Auto-generated method stub
		
	}

}
