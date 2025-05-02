package dev.FarmaControll.farmaControll.service;

import dev.FarmaControll.farmaControll.exception.MedicamentsNotFound;
import dev.FarmaControll.farmaControll.model.Medicament;
import dev.FarmaControll.farmaControll.repository.MedicamentRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicamentService {

    @Autowired
    private MedicamentRepository medicamentRepository;

    public List<Medicament> findByName(String name){
        return medicamentRepository.findByNameContainingIgnoreCase(name);
    }

    public List<Medicament> findAll(){
        return medicamentRepository.findAll();
    }

    public Medicament findById(Long id){
        return medicamentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Medicament Not Found"));
    }

    public Medicament register(Medicament medicament){
        return medicamentRepository.save(medicament);
    }

    public Medicament update(Long id, Medicament medicamentUpdated){
        Medicament medicamentExisting = medicamentRepository.findById(id)
                .orElseThrow(() -> new MedicamentsNotFound("Medicament Not Found"));
        BeanUtils.copyProperties(medicamentUpdated, medicamentExisting, "id");
        return medicamentRepository.save(medicamentExisting);
    }

    public void delete(Long id){
        medicamentRepository.deleteById(id);
    }

}
