package co.edu.iudigital.helpmeuid.repository;

import co.edu.iudigital.helpmeuid.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends CrudRepository<Usuario,Long> {

    public Usuario findByUsername(String username);

}
