package pe.cmacica.labs.labs02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.cmacica.labs.labs02.Service.CuentaService;

@Controller
@RequestMapping("/cuenta")
public class CuentaController {

    @Autowired
    private CuentaService cuentaService;


    @GetMapping("/")
    public HttpEntity<String> getNumeroCuenta()
    {
        //return ResponseEntity.ok("Mi Cuneta es 10801232100007656");
        return ResponseEntity.ok(cuentaService.getAccount(0));
    }
}
