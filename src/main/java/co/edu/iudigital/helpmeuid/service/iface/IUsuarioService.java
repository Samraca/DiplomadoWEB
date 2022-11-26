package co.edu.iudigital.helpmeuid.service.iface;

import co.edu.iudigital.helpmeuid.dto.UsuarioDTO;

import java.util.List;

public interface IUsuarioService {

    List<UsuarioDTO> findAll(); //TODO: Lanzar excepciones personalizadas

    UsuarioDTO findById(Long id); //TODO: Lanzar excepciones personalizadas

    UsuarioDTO save (UsuarioDTO usuarioDTO); //TODO: Lanzar excepciones personalizadas

    UsuarioDTO findByUsername(String name); //TODO: Lanzar excepciones personalizadas

}
