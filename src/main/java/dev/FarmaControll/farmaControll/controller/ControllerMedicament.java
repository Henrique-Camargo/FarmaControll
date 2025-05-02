package dev.FarmaControll.farmaControll.controller;

import dev.FarmaControll.farmaControll.model.Medicament;
import dev.FarmaControll.farmaControll.service.MedicamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicament")
public class ControllerMedicament {

    @Autowired
    private MedicamentService medicamentService;

    @PostMapping
    public ResponseEntity<Medicament> create(@RequestBody Medicament medicament){
        Medicament medicamentCreated = medicamentService.register(medicament);
        return new ResponseEntity<>(medicamentCreated, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Medicament>> findAll(){
        List<Medicament> medicament = medicamentService.findAll();
        return new ResponseEntity<>(medicament, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medicament> findById(@PathVariable Long id){
        Medicament medicament = medicamentService.findById(id);
        return new ResponseEntity<>(medicament, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Medicament> update(@PathVariable Long id, @RequestBody Medicament medicamentUpdated){
        Medicament medicament = medicamentService.update(id, medicamentUpdated);
        return new ResponseEntity<>(medicament, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Medicament> delete(@PathVariable Long id){
        medicamentService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
