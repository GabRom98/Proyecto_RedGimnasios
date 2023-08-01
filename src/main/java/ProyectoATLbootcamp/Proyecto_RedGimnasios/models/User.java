package ProyectoATLbootcamp.Proyecto_RedGimnasios.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "dni", unique = true)
    private String dni;

    @Column(name = "birthdate")
    private Date birthdate;

    @Column(name = "is_active")
    private boolean is_active;

    @Column(name = "password")
    private String password;

    @JsonIgnore
    @ManyToMany(mappedBy = "users")
    private List<Gym> gyms;


    @JsonIgnore
    @ManyToMany(mappedBy = "users")
    private List<Role> roles;

}
