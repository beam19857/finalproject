package backend.service.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    // @Autowired
    // private UserRepository userRepository;

    // public List<User> findAllUser() {
    //     return userRepository.findAll();
    // }

    // public User findUserById(String id) {
    //     return userRepository.findById(id).orElse(null);
    // }

    // public User addNewUser(User user) {
    //     System.out.println(user);
    //     return userRepository.save(user);
    // }

    // public void deleteUserById(String id) {
    //     userRepository.deleteById(id);
    // }

    // public User updateUserById(String id, User user) {
    //     userRepository.findById(id).ifPresent(e -> user.setId(e.getId()));
    //     return userRepository.save(user);
    // }

    // public List<User> findUserByImageId(String imageId) {
    //     return userRepository.findByImageId(imageId);
    // }
}
