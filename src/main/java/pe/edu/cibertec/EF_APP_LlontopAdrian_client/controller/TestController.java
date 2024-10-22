package pe.edu.cibertec.EF_APP_LlontopAdrian_client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class TestController {

    @GetMapping("/publico")
    public String publicApi(){
        return "Bienvenido USER";
    }

    @GetMapping("/privado")
    public String privateApi(){
        return "Bienvenido ADMIN";
    }

}
