package co.edu.iudigital.helpmeuid.service.iface;

import co.edu.iudigital.helpmeuid.dto.DelitoDTO;

import java.util.List;

public interface IDelitoService {

    //Listar todos los delitos
    List<DelitoDTO> findAll(); //TODO: Lanzar excepciones personalizadas

    //listar un delito por id
    DelitoDTO findById(Long id); //TODO: Lanzar excepciones personalizadas

    // guardar un delito
    DelitoDTO save(DelitoDTO delitoDTO); //TODO: Lanzar excepciones personalizadas

    //borrar un delito por id
    void delete(Long id); //TODO: Lanzar excepciones personalizadas

}
