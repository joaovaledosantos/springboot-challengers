package br.com.springger.challengers.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/desafio")
public class DesafioController {

    @PostMapping(value = "cor-uniforme-brasil")
    public String camisa(){
        return "";


    }
    @GetMapping(value = "numero-aleatorio")
    public Integer numeroAleatorio(){
        return new Random().nextInt();

    }
}
