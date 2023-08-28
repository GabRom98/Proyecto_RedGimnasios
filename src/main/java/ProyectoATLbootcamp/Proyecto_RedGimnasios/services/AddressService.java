package ProyectoATLbootcamp.Proyecto_RedGimnasios.services;

import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.Address;
import ProyectoATLbootcamp.Proyecto_RedGimnasios.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    AddressRepository addressRepository;

    public Address getAddress(Long id){ return addressRepository.findById(id).orElse(null);}

    public List<Address> getAllAddress() {return  (List<Address>) addressRepository.findAll();}

    public void addAddress(Address address) { addressRepository.save(address);}

    public void deleteAddress(Long id) { addressRepository.deleteById(id);}

}
