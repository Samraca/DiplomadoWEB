package co.edu.iudigital.helpmeuid.service.iface;

import co.edu.iudigital.helpmeuid.dto.DelitoDTO;

import java.util.List;

public interface IDelitoService {

    // listar todos los delitos
    public List<DelitoDTO> findAll();//TODO: Lanzar Excepcion personalizadas

    // listar un delito por ID
    public DelitoDTO findById(Long id);//TODO: Lanzar Excepcion personalizadas

    // guardar un delito
    public DelitoDTO save(DelitoDTO delitoDTO);//TODO: Lanzar Excepcion personalizadas

    // borrar un delito por ID
    public void delete(Long id);//TODO: Lanzar Excepcion personalizadas
}