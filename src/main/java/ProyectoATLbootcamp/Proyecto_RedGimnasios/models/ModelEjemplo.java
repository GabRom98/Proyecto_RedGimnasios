package ProyectoATLbootcamp.Proyecto_RedGimnasios.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ejemplo_model_gim")
public class ModelEjemplo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre_gim")
    private String nombreGim;

    @Column(name = "direccion")
    private String direccion;
}
