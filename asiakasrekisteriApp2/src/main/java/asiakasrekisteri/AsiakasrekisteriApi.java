package asiakasrekisteri;

import static spark.Spark.get;
import spark.servlet.SparkApplication;
import com.google.gson.*;

public class AsiakasrekisteriApi implements SparkApplication {

    private Asiakas mockAsiakas;

    public AsiakasrekisteriApi(){
        super();
        mockAsiakas = new Asiakas("1001", 1, "Henkku", "Mikkola", "010163-0123A", "Mies");
    }

    @Override
    public void init() {
        get("/", (request, response) -> "Hello World");
           
        get("/hello/:name", (request, response) -> "Hello " + request.params(":name"));

        Gson gson = new Gson();
        String json = gson.toJson(mockAsiakas); 
        get("/customer/:id", (request, response) -> {
            response.type("application/json");
            return json;
        });
    }
}