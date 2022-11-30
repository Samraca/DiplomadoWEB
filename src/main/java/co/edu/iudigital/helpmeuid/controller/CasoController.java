package co.edu.iudigital.helpmeuid.controller;

import co.edu.iudigital.helpmeuid.dto.CasoDTO;
import co.edu.iudigital.helpmeuid.service.iface.ICasoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/casos")
public class CasoController {
    @Autowired
    private ICasoService casoService;

    @GetMapping
    public List<CasoDTO> index(){
        return casoService.findAll();
    }
}
