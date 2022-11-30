package co.edu.iudigital.helpmeuid.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import static lombok.AccessLevel.PRIVATE;

@Getter
@Setter
@FieldDefaults(level = PRIVATE)
@Builder
public class DelitoDTO {
    Long id;
    String nombre;
    String descripcion;
}