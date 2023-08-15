package by.sadovnick.postoffice.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class PostOffice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
}
