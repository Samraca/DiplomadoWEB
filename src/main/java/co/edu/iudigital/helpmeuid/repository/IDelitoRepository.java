package co.edu.iudigital.helpmeuid.repository;

import co.edu.iudigital.helpmeuid.model.Delito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDelitoRepository
        extends JpaRepository<Delito, Long> {
}
