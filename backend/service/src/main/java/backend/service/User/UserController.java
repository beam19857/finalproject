package backend.service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> findAllUser() {
        return userService.findAllUser();
    }

    @GetMapping("/{id}")
    public User findUser(@PathVariable String id) {
        
        return userService.findUserById(id);
    }

    @PostMapping("/adduser")
    public User addUser(@RequestBody User user) {
        System.out.println("adduser");
        System.out.println("this is user = "+ user);
        System.out.println("test");
        return userService.addNewUser(user);
    }

    @PutMapping("/{id}")
    public User editUser(@PathVariable String id, @RequestBody User user) {
        return userService.updateUserById(id, user);
    }

    @DeleteMapping
    public void deleteUser(@PathVariable String id) {
        userService.deleteUserById(id);
    }

    @GetMapping("/image/{imageId}")
    public List<User> findUserByImageId(@PathVariable String imageId) {
        return userService.findUserByImageId(imageId);
    }
}
