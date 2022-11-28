package j20_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Data

class User{
    private String username;
    private String password;
    private String email;
    private String name;
}

public class JSON2 {
    public static void main(String[] args) {
        //Gson으로 변환할 수 있는 객체의 종류
        //JsonObject, Object, Map - toJson 으로 객체 변경가능

        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
        Gson gson = new Gson();

        String userJson = null;
        String studentJson = null;
        String productJson = null;


        //Object(객체) -> Json 으로 변환
        User user = new User("junil", "1234", "skji1218@gmail.com", "김준일");
        System.out.println(gson.toJson(user));
        System.out.println(gsonBuilder.toJson(user));
        userJson = gsonBuilder.toJson(user);

        //JsonObject(객체) -> Json 으로 변환
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("studentCode", "20220001");
        jsonObject.addProperty("studentName", "김준이");
        jsonObject.addProperty("studentYear", "2");
        studentJson = gsonBuilder.toJson(jsonObject);


        //Map -> JSON
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("productCode", "p-20220001");
        map.put("productName", "삼성 노트북");
        System.out.println(gsonBuilder.toJson(map));
        productJson = gsonBuilder.toJson(map);


        //Json -> JsonObject
        JsonObject jsonObj = convertJsonToJsonObject(userJson);
        System.out.println(jsonObj);

        jsonObj = convertJsonToJsonObject(studentJson);
        System.out.println(jsonObj);

        jsonObj = convertJsonToJsonObject(productJson);
        System.out.println(jsonObj);

        User userObj = convertJsonToUser(userJson);
        System.out.println(userObj);

    }

    public static Map convertJsonToMap(String json) {
        Gson gson = new Gson();

        return gson.fromJson(json, Map.class); //json 을 바꾸고 싶은걸로 바꾼다 여기서는  Map.class
    }

    public static JsonObject convertJsonToJsonObject(String json){
        Gson gson = new Gson();

        return gson.fromJson(json, JsonObject.class);
    }

    public static User convertJsonToUser(String json){
        Gson gson = new Gson();

        return gson.fromJson(json, User.class);
    }


}
