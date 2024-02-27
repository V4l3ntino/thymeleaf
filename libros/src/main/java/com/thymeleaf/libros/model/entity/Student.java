package com.thymeleaf.libros.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "Clientes")
@Setter
@Getter
@RequiredArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "first_name", nullable = false)
    @NonNull private String firstName;
    @Column(name = "last_name")
    @NonNull private String lastName;
    @Column(name = "email")
    @NonNull private String email;

    @OneToMany(mappedBy = "student")
    List<Productos> listaProductos;
}
