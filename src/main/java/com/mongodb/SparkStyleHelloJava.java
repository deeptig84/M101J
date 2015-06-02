package com.mongodb;

import spark.*;

/**
 * Created by dipti on 5/31/2015.
 */
public class SparkStyleHelloJava {
    public static void main(String[] args) {
    	
        Spark.get("/", new Route() {

			public Object handle(final Request request, final spark.Response response)
					throws Exception {
				// TODO Auto-generated method stub
				return "Spark style hello";
			}
        }

        );

    }
}
