package backend.service.Service;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.FetchType;


import javax.persistence.Table;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@Entity
@Table(name="User")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private @NonNull Long id;  
    
    @Column(name = "username")
    private String username ; 

    @Column(name = "password")
    private String password ;

    @Column(name = "email")
    private String email ;

    @OneToMany(fetch = FetchType.EAGER)
    private Collection<Image> image;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Collection<Image> getImage() {
        return this.image;
    }

    public void setImage(Collection<Image> image) {
        this.image = image;
    }


}
