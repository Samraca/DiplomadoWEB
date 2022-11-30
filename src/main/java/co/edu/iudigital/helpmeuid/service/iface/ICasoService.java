package co.edu.iudigital.helpmeuid.service.iface;

import co.edu.iudigital.helpmeuid.dto.CasoDTO;

import java.util.List;

public interface ICasoService {

    //Consultar todos los casos
    List<CasoDTO> findAll(); //TODO: Lanzar excepciones personalizadas

    //Crear un caso
    CasoDTO save(CasoDTO casoDTO); //TODO: Lanzar excepciones personalizadas

    //activar/inactivar un caso
    Boolean visible(Boolean visible, Long id); //TODO: Lanzar excepciones personalizadas

    //consultar caso por id
    CasoDTO findById(Long id); //TODO: Lanzar excepciones personalizadas
}
