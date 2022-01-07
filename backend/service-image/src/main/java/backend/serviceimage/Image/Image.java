package backend.serviceimage.Image;


import java.util.List;

import org.apache.catalina.User;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Image {
    @Id
    private String id;
    private String image;
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