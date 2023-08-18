package ProyectoATLbootcamp.Proyecto_RedGimnasios.controllers;

import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.Suscription;
import ProyectoATLbootcamp.Proyecto_RedGimnasios.services.SuscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SuscriptionController {

    @Autowired
    SuscriptionService suscriptionService;

    @GetMapping("/api/gimnasio/subscriptions")
    public List<Suscription> getAllSuscriptions(){
        return suscriptionService.getAllSuscriptions();
    }

    @GetMapping("/api/gimnasio/subscriptions/{userID}")
    public Suscription getSuscription(@PathVariable Long userID){
        return suscriptionService.getSuscription(userID);
    }

    @PostMapping("/api/gimnasio/subscriptions")
    public void addSuscription(@RequestBody Suscription suscription){
        suscriptionService.addSuscription(suscription);
    }

    @PutMapping("/api/gimnasio/subscriptions")
    public void updateSuscription(@RequestBody Suscription suscription){
        suscriptionService.addSuscription(suscription);
    }

    @DeleteMapping("/api/gimnasio/subscriptions/{userID}")
    public void deleteSuscription(@PathVariable Long userID){
        suscriptionService.deleteByUserId(userID);
    }

    @PutMapping("/api/gimnasio/subscriptions/{userID}/false")
    public void desactiveSuscription(@PathVariable Long userID){
        suscriptionService.desactiveByUserId(userID);
    }

    @PutMapping("/api/gimnasio/subscriptions/{userID}/true")
    public void activeSuscription(@PathVariable Long userID){
        suscriptionService.activeByUserId(userID);
    }







}
