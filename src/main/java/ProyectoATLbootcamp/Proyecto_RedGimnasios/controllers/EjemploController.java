package ProyectoATLbootcamp.Proyecto_RedGimnasios.controllers;

import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.ModelEjemplo;
import ProyectoATLbootcamp.Proyecto_RedGimnasios.services.ejemploService.EjemploService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EjemploController {
    @Autowired
    private EjemploService  ejemploService;
    @GetMapping("/api/gimnasio")
    public List<ModelEjemplo> getAll() {
        return ejemploService.getAll();
    }

    @PostMapping("/api/gimnasio")
    public String agregar(@RequestBody ModelEjemplo ejemplo) {
        return ejemploService.agregar(ejemplo);
    }

}
