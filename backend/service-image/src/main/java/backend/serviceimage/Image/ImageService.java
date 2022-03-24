package backend.serviceimage.Image;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import backend.serviceimage.User.UserClient;

@Service
public class ImageService {
    @Autowired
    private ImageRepository imageRepository;
    @Autowired
    private UserClient userClient;
     
    public List<Image> findAllImage() {
        return imageRepository.findAll();
    }

    public Image findImageById(String id) {
        Optional<Image> image = imageRepository.findById(id);
        image.ifPresent(o -> {
            o.setUser(userClient.findUserByImageId(o.getId()));
        });
        return imageRepository.findById(id).orElse(null);
    }

    public Image addNewImage(Image image) {
        return imageRepository.save(image);
    }

    public void deleteImageById(String id) {
        imageRepository.deleteById(id);
    }

    public Image updateImageById(String id, Image image) {
        imageRepository.findById(id).ifPresent(e -> image.setId(e.getId()));
        return imageRepository.save(image);
    }

    public List<Image> findImageByUserId(String userId) {
        return imageRepository.findByUserId(userId);
    }
}
