package co.edu.iudigital.helpmeuid.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

import static lombok.AccessLevel.PRIVATE;

@Getter
@Setter
@FieldDefaults(level = PRIVATE)
@Builder
public class CasoDTO {

    Long id;
    LocalDateTime fechaHora;
    Float latitud;
    Float longitud;
    Float altitud;
    Boolean visible;
    String descripcion;
    String urlMap;
    String rmiUrl;
}
