
package com.alejamundo.demo.domain;

import lombok.Data;

@Data
public class Persona {
    public String nombre;
    private String apellido;
    private int edad;
    private String telString;
    private String email;
    private String profesion;
}
