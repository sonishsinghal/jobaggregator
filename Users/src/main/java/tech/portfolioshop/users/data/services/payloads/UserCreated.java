package tech.portfolioshop.users.data.services.payloads;

import org.json.JSONObject;
import tech.portfolioshop.users.data.services.KafkaTopics;

public class UserCreated extends Payload{
    private String name;
    private String email;
    private String userId;
    private String phone;

    public UserCreated(String name, String email, String userId, String phone) {
        super(KafkaTopics.USER_CREATED);
        this.name = name;
        this.email = email;
        this.userId = userId;
        this.phone = phone;
    }

    public String serialize(){
        JSONObject obj = new JSONObject();
        obj.put("name", name);
        obj.put("email", email);
        obj.put("userId", userId);
        obj.put("phone", phone);
        return obj.toString();
    }
    public void deserialize(String json){
        JSONObject obj = new JSONObject(json);
        name = obj.getString("name");
        email = obj.getString("name");
        userId = obj.getString("userId");
        phone = obj.getString("phone");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
