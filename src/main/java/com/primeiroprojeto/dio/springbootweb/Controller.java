package com.primeiroprojeto.dio.springbootweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    
    @GetMapping("/")
    public String mensagem() {
        return "<h1>Meu Primeiro projeto Spring Boot Web</h1>" +
        "<label>Digite seu nome: </label><input type='text'>" +
        "<br><br><label>Digite sua senha: </label><input type='password'>" +
        "<br><input type='submit' value='Enviar'><br>";
    }
}
