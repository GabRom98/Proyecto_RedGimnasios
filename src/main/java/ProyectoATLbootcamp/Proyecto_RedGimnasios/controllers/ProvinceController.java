package ProyectoATLbootcamp.Proyecto_RedGimnasios.controllers;

import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.Activity;
import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.Province;
import ProyectoATLbootcamp.Proyecto_RedGimnasios.services.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProvinceController {

    @Autowired
    ProvinceService provinceService;

    @GetMapping("/api/gimnasio/province/{id}")
    public Province getProvince(@PathVariable Long id) {

        return provinceService.getProvince(id);
    }

    @GetMapping("/api/gimnasio/province")
    public List<Province> getAllProvince() {

        return provinceService.getAllProvinces();
    }

    @PostMapping("/api/gimnasio/province")
    public void addProvince (@RequestBody Province province) {
        provinceService.addProvince(province);
    }

    @DeleteMapping("/api/gimnasio/province/{id}")
    public void deleteProvince (@PathVariable Long id) {
        provinceService.deleteProvince(id);
    }

}
