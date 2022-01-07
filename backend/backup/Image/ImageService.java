package backend.image.Image;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageService {
    @Autowired
    private ImageRepository imageRepository;

    public List<Image> findAllImage() {
        return imageRepository.findAll();
    }

    public Image findImageById(String id) {
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
