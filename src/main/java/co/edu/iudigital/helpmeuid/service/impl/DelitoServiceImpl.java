package co.edu.iudigital.helpmeuid.service.impl;

import co.edu.iudigital.helpmeuid.dto.DelitoDTO;
import co.edu.iudigital.helpmeuid.model.Delito;
import co.edu.iudigital.helpmeuid.repository.IDelitoRepository;
import co.edu.iudigital.helpmeuid.service.iface.IDelitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DelitoServiceImpl implements IDelitoService {

    private final IDelitoRepository delitoRepository;

    @Autowired
    public DelitoServiceImpl(IDelitoRepository delitoRepository){
        this.delitoRepository = delitoRepository;
    }

    @Override
    public List<DelitoDTO> findAll(){
        List<Delito> delitos = delitoRepository.findAll();
        List<DelitoDTO> delitoDTOS = new ArrayList<>();

        delitos.stream().forEach(d -> {
            DelitoDTO delitoDTO = new
            delitoDTOS.add()
        });

        return delitoDTOS;
    }

    @Override
    public DelitoDTO findById(Long id){
        return null;
    }

    @Override
    public DelitoDTO save(DelitoDTO delitoDTO){
        return null;
    }

    @Override
    public void delete(Long id){

    }

}
