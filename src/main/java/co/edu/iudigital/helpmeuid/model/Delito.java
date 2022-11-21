package co.edu.iudigital.helpmeuid.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Delitos")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Delito implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "nombre", nullable = false)
    String nombre;

    @Column
    String descripcion;

    @ManyToOne
    @JoinColumn(name = "usuarios_id")
    Usuario usuario;

}
