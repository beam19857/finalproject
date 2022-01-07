package backend.image.Image;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ImageRepository extends MongoRepository<Image, String> {
    List<Image> findByUserId(String userId);
}