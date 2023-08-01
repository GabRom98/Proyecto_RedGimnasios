package ProyectoATLbootcamp.Proyecto_RedGimnasios.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "gyms")

public class Gym {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;

        @Column(name = "name")
        private String name;

        @JsonIgnore
        @ManyToMany
        @JoinTable(name = "users_gyms",
                joinColumns = @JoinColumn(name = "id_gym"),
                inverseJoinColumns = @JoinColumn(name = "id_user")
        )
        private List<User> users;
}
