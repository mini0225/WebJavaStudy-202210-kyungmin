package j20_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class JSON1 {

    public static void main(String[] args) {


        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("username", "min");
        jsonObject.addProperty("password", "1234");
        jsonObject.addProperty("email", "light-min@naver.com");
        jsonObject.addProperty("name", "김경민");
        jsonObject.addProperty("age", "32");

        System.out.println(jsonObject);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(jsonObject);
        System.out.println(json);
    }
}
