package co.edu.iudigital.helpmeuid.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="roles")
@Getter
@Setter
public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", length = 45, nullable = false)
    private String nombre;

    private String descripcion;

    @ManyToMany(mappedBy = "roles")
    List<Usuario> usuarios;
}
