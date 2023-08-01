package ProyectoATLbootcamp.Proyecto_RedGimnasios.models;

import jakarta.persistence.*;
import lombok.Data;
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

        @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
        @JoinColumn(name = "id_suscription_type")
        private SuscriptionType suscription_type;

        //Faltaría la relación id_address
}
