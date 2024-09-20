package com.example.inicial1.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class AutorDto {

    private Long id;
    private String nombre;
    private String apellido;
    private String bibliografia;

}
