package ProyectoATLbootcamp.Proyecto_RedGimnasios.services.ejemploService;

import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.ModelEjemplo;

import java.util.List;

public interface EjemploInterface {
    List<ModelEjemplo> getAll();

    String agregar(ModelEjemplo modelEjemplo);
}
