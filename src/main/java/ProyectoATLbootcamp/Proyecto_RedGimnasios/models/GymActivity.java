package ProyectoATLbootcamp.Proyecto_RedGimnasios.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "gym_activity")
public class GymActivity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_activity", nullable = false)
    private Activity idActivity;

    @ManyToOne
    @JoinColumn(name = "id_gym", nullable = false)
    private Gym idGym;

}