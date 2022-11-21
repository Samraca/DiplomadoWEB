package co.edu.iudigital.helpmeuid.repository;

import co.edu.iudigital.helpmeuid.model.Caso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ICasoRepository extends JpaRepository<Caso, Long> {

    @Query("UPDATE Caso c SET c.visible=?1 WHERE c.id=?2")
    public Boolean setVisible(Boolean visible, Long id);
}
