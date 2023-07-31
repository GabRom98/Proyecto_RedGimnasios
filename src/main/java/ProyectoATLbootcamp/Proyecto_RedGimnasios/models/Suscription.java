package ProyectoATLbootcamp.Proyecto_RedGimnasios.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "suscriptions")
public class Suscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "start_suscription", nullable = false)
    private Date start_suscription;

    @Column(name = "end_suscription",nullable = false)
    private Date end_suscription;

    @Column(name = "is_active", nullable = false)
    private Boolean is_active;

    //Faltan relaciones id_suscription_type - id_user
}