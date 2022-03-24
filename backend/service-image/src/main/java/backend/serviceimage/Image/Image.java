package backend.serviceimage.Image;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import org.apache.catalina.User;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Image {
    @Id
    private String id;
    private String image;
    private String address;
    private String user;

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<User> getUserId() {
        return this.userId;
    }

    public void setUserId(List<User> userId) {
        this.userId = userId;
    }

    private List<User> userId;

    public Image() {
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<User> getUsers() {
        return this.userId;
    }

    public void setUsers(List<User> users) {
        this.userId = users;
    }
}