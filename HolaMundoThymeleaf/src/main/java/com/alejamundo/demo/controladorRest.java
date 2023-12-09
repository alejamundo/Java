package com.alejamundo.demo;

import com.alejamundo.demo.domain.Persona;

import java.util.Arrays;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class controladorRest {

    @Value("${indice.hola}")
    private String hola;

    @GetMapping("/")
    public String comienzo(Model model) {
        String hola2 = "Hola mundo con sprint boot ";

        Persona p1 = new Persona();
        p1.setNombre("Alejandra");
        p1.setApellido("Orrego");
        p1.setEdad(29);
        p1.setTelString("3218792516");
        p1.setEmail("Alejandra@gmail.com");
        p1.setProfesion("Ingeniera");
        
        Persona p2 = new Persona();
        p2.setNombre("Linda");
        p2.setApellido("Orrego");
        p2.setEdad(29);
        p2.setTelString("3218792516");
        p2.setEmail("linda@gmail.com");
        p2.setProfesion("manager bussiness");
        
        
        List<Persona> personas = Arrays.asList(p1,p2);
        
        log.info("Estoy ejecutando el controlador Sprint MVC");
        model.addAttribute("hola", hola);
        model.addAttribute("hola2", hola2);
        model.addAttribute("p1",p1);
        model.addAttribute("personas",personas);
        return "indice";
    }

}
