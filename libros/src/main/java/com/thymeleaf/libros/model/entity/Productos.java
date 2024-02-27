package com.thymeleaf.libros.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Productos")
public class Productos {
    @Id
    private Integer id;
    @Column(name = "Nombre_producto")
    private String name;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
}
