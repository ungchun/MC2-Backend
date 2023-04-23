package ada.mc2.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "animals")
public class Animal {
    public Animal() {
    }

    public Animal(String animal_name) {
        this.animal_name = animal_name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int animal_id;
    private String animal_name;
}