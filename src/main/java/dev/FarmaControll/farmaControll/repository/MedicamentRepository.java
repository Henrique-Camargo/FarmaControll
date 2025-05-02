package dev.FarmaControll.farmaControll.repository;

import dev.FarmaControll.farmaControll.model.Medicament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicamentRepository extends JpaRepository<Medicament, Long> {

    List<Medicament> findByNameContainingIgnoreCase(String name);
}
