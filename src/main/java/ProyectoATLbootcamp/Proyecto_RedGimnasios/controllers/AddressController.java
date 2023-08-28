package ProyectoATLbootcamp.Proyecto_RedGimnasios.controllers;

import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.Address;
import ProyectoATLbootcamp.Proyecto_RedGimnasios.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @GetMapping("/api/gimnasio/address({id}")
    public Address getAddress(@PathVariable Long id){
        return addressService.getAddress(id);
    }

    @GetMapping("/api/gimnasio/address")
    public List<Address> getAllAddress(){
        return addressService.getAllAddress();
    }

    @PostMapping("api/gimnasio/address")
    public void addAddress (@RequestBody Address address){ addressService.addAddress(address);}

    @PostMapping("api/gimnasio/address/{id}")
    public void deleteAddress (@PathVariable Long id) {addressService.deleteAddress(id);}

}
