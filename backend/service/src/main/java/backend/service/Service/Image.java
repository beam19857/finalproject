package backend.service.Service;
import lombok.*;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.FetchType;


import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
@Table(name="Image")

public class Image {

    @Id
    @SequenceGenerator(name="Image_seq",sequenceName="Image_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="Image_seq") 
    @Column(name = "Image_ID", unique = true, nullable = true)
    private @NonNull Long id; 
    
    @Getter @Setter
    private String image ;

    @Getter @Setter
    private String address ;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = User.class)
    @JoinColumn(name = "USER_ID", insertable = true)
    private User user;

}
