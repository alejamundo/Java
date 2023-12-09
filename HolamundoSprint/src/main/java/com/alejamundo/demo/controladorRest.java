
package com.alejamundo.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class controladorRest {
    
    @GetMapping("/")
    public String comienzo(){
        log.info("Estoy ejecutando el controlador rest");
        return "Hola mundo";
    }
    
}
