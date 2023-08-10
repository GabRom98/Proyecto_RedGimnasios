package ProyectoATLbootcamp.Proyecto_RedGimnasios.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "activity")
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
}
