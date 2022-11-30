package co.edu.iudigital.helpmeuid.service.impl;

import co.edu.iudigital.helpmeuid.dto.UsuarioDTO;
import co.edu.iudigital.helpmeuid.model.Usuario;
import co.edu.iudigital.helpmeuid.repository.IUsuarioRepository;
import co.edu.iudigital.helpmeuid.service.iface.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    private final IUsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioServiceImpl(IUsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public List<UsuarioDTO> findAll() {
        List<Usuario> usuarios = (List<Usuario>) usuarioRepository.findAll();
        // TODO: Refactoring a un mapper en paquete util
        return usuarios.stream().map(u ->
                UsuarioDTO.builder()
                        .id(u.getId())
                        .username(u.getUsername())
                        .nombre(u.getNombre())
                        .apellido(u.getApellido())
                        .password(u.getPassword())
                        .fechaNacimiento(u.getFechaNacimiento())
                        .enabled(u.getEnabled())
                        .redSocial(u.getRedSocial())
                        .image(u.getImage())
                        .build()
        ).collect(Collectors.toList());
    }

    @Override
    public UsuarioDTO findById(Long id) {
        return null;
    }

    @Override
    public UsuarioDTO save(UsuarioDTO usuarioDTO) {
        return null;
    }

    @Override
    public UsuarioDTO findByUsername(String username) {
        return null;
    }
}
