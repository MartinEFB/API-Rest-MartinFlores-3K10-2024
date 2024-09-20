package com.example.inicial1.entities;

import lombok.*;
import org.hibernate.envers.Audited;
import jakarta.persistence.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
@Table(name = "autor")
@Audited
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellidop")
    private String apellido;
    @Column(name = "bibliografia")
    private String bibliografia;


}
