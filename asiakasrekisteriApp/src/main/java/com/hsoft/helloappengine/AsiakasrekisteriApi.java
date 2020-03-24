package com.hsoft.helloappengine;

import static spark.Spark.get;
import spark.servlet.SparkApplication;

public class AsiakasrekisteriApi implements SparkApplication {

    @Override
    public void init() {
        get("/", (request, response) -> "Hello World");
           
        get("/hello/:name", (request, response) -> "Hello " + request.params(":name"));
    }
}