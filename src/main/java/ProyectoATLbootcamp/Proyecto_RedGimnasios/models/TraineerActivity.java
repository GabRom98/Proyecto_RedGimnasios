package ProyectoATLbootcamp.Proyecto_RedGimnasios.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;

@Data
@Entity
@Table(name = "traineer_activity")
public class TraineerActivity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "day")
    private char day;

    @Column(name = "start_time")
    private LocalTime start_time;

    @Column(name = "end_time")
    private LocalTime end_time;

}