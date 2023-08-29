package ProyectoATLbootcamp.Proyecto_RedGimnasios.controllers;

import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.SuscriptionType;
import ProyectoATLbootcamp.Proyecto_RedGimnasios.services.SuscriptionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SuscriptionTypeController {

    @Autowired
    SuscriptionTypeService suscriptionTypeService;

    @GetMapping("/api/gimnasio/suscriptiontype/{id}")
    public SuscriptionType getSuscriptionType(@PathVariable Long id) {return suscriptionTypeService.getSuscriptionType(id);}

    @GetMapping("/api/gimnasio/suscriptionstypes")
    public List<SuscriptionType> getAllSuscriptionsTypes() {return suscriptionTypeService.getAllSuscriptionsTypes();}

    @PostMapping("/api/gimnasio/suscriptiontype")
    public void addSuscriptionType (@RequestBody SuscriptionType suscriptiontype) {suscriptionTypeService.addSuscriptionType(suscriptiontype);}

    @PutMapping("/api/gimnasio/suscriptiontype/{id}")
    public SuscriptionType updateSuscriptionType(@PathVariable Long id, @RequestBody SuscriptionType suscriptiontype){
        return suscriptionTypeService.updateSuscriptionType(id,suscriptiontype);
    }
    @DeleteMapping("/api/gimnasio/suscriptiontype/{id}")
    public void deleteSuscriptionType (@PathVariable Long id) {
        suscriptionTypeService.deleteSuscriptionType(id);
    }

}
