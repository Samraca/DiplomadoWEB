package co.edu.iudigital.helpmeuid.controller;

import co.edu.iudigital.helpmeuid.dto.DelitoDTO;
import co.edu.iudigital.helpmeuid.service.iface.IDelitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/delitos")
public class DelitoController {

    @Autowired
    private IDelitoService delitoService;

    @GetMapping
    public ResponseEntity<List<DelitoDTO>> index(){
        return ResponseEntity
                .ok()
                .body(delitoService.findAll());
    }
}
