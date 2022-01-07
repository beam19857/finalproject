package backend.serviceimage.Image;


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
@RequestMapping("/images")
public class ImageController {
    @Autowired
    private ImageService imageService;

    @GetMapping
    public List<Image> findAllImage() {
        return imageService.findAllImage();
    }

    @GetMapping("/{id}")
    public Image findImage(@PathVariable String id) {
        return imageService.findImageById(id);
    }

    @PostMapping
    public Image addImage(@RequestBody Image image) {
        return imageService.addNewImage(image);
    }

    @PutMapping("/{id}")
    public Image editImage(@PathVariable String id, @RequestBody Image image) {
        return imageService.updateImageById(id, image);
    }

    @DeleteMapping
    public void deleteImage(@PathVariable String id) {
        imageService.deleteImageById(id);
    }

    @GetMapping("/user/{userId}")
    public List<Image> findImageByUserId(@PathVariable String userId) {
        return imageService.findImageByUserId(userId);
    }
}