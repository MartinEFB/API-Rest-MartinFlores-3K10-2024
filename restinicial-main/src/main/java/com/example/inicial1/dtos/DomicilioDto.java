package com.example.inicial1.dtos;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Builder
public class DomicilioDto {
    private Long id;
    private String calle;
    private int numero;
}
