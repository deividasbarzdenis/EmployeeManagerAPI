package lt.debarz.employeemanager.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Employee implements Serializable {
//Serializable helps transform Employee class to different types of stream because this class
// is going to be saved in a database, and then it's going to be sent to the front as json and its helps
// with all this process

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable =false, updatable=false)
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phone;
    private String imageUrl;
    @Column(nullable =false, updatable=false)
    private String employeeCode;

}
