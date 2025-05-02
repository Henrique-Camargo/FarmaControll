package dev.FarmaControll.farmaControll.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import dev.FarmaControll.farmaControll.model.enums.Category;
import dev.FarmaControll.farmaControll.model.enums.Manufacturer;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "tb_medicament")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Medicament implements Serializable {
    private static final Long seriaVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Manufacturer manufacturer;
    private Category category;
    private LocalDate localDate;
    private Double quantity;
    private String lote;


}
