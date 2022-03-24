package backend.serviceimage.User;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-service")
public class UserClient {
    
    @GetMapping("/users/{imageId}")
    List<User> findUserByImageId(@PathVariable String imageId);

}
