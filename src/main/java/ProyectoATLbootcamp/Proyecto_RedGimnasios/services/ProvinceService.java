package ProyectoATLbootcamp.Proyecto_RedGimnasios.services;

import ProyectoATLbootcamp.Proyecto_RedGimnasios.models.Province;
import ProyectoATLbootcamp.Proyecto_RedGimnasios.repository.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceService {

    @Autowired
    ProvinceRepository provinceRepository;

    public Province getProvince(Long id) {
        return provinceRepository.findById(id).orElse(null);
    }

    public List<Province> getAllProvinces() {
        return (List<Province>) provinceRepository.findAll();
    }

    public void addProvince(Province province) {
        provinceRepository.save(province);
    }

    public void deleteProvince(Long id) {
        provinceRepository.deleteById(id);
    }
}
