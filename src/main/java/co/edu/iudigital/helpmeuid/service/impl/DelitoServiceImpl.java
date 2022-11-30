package co.edu.iudigital.helpmeuid.service.impl;

import co.edu.iudigital.helpmeuid.dto.DelitoDTO;
import co.edu.iudigital.helpmeuid.model.Delito;
import co.edu.iudigital.helpmeuid.repository.IDelitoRepository;
import co.edu.iudigital.helpmeuid.service.iface.IDelitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DelitoServiceImpl implements IDelitoService {
    private final IDelitoRepository delitoRepository;

    @Autowired
    public DelitoServiceImpl(IDelitoRepository delitoRepository){
        this.delitoRepository = delitoRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public List<DelitoDTO> findAll() {
        List<Delito> delitos = delitoRepository.findAll();
        return delitos.stream().map(d ->
                DelitoDTO.builder()
                        .id(d.getId())
                        .nombre(d.getNombre())
                        .descripcion(d.getDescripcion())
                        .build()
        ).collect(Collectors.toList());
    }

    @Override
    public DelitoDTO findById(Long id) {
        return null;
    }

    @Override
    public DelitoDTO save(DelitoDTO delitoDTO) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
