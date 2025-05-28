package com.uceva.micro_servicio_lib_arq.codec;

import org.springframework.web.bind.annotation.*;

import libcompilador.JavaCompilador;

@RestController
@RequestMapping("/api/art")
public class codecRestController {
    private JavaCompilador miJavaCodeC;

    public codecRestController() {
        this.miJavaCodeC = new JavaCompilador();
    }

    @PostMapping("/code")
    public String codec(@RequestBody String codigo) {
        return miJavaCodeC.compilar(codigo);
    }
}