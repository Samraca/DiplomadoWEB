package co.edu.iudigital.helpmeuid.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table
@Getter
@Setter
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Caso implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "fecha_hora", nullable = false)
    LocalDateTime fechaHora;

    @Column
    Float latitud;

    @Column
    Float longitud;

    @Column
    Float altitud;

    @Column
    Boolean visible;

    @Column
    String descripcion;

    @Column(name = "url_map")
    String urlMap;

    @Column(name = "rmi_url")
    String rmiUrl;

    @ManyToOne
    @JoinColumn(name = "delitos_id")
    Delito delito;

    @ManyToOne
    @JoinColumn(name = "usuarios_id")
    Usuario usuario;

    public void prePersist(){
        if(Objects.isNull(fechaHora)){
            fechaHora = LocalDateTime.now();
        }
    }

}
