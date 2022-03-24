package backend.service.Service;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findById(long id);
    List<User> findByImage(long image);
    
}
