package com.uceva.micro_servicio_lib_arq.codec;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uceva.micro_servicio_lib_arq.ejemploc.lib.JavaCodeC;

@RestController
@RequestMapping("/api/art")
public class codecRestController {
     private JavaCodeC miJavaCodeC;

     public codecRestController(){
        this.miJavaCodeC = new JavaCodeC();
     }

     @PostMapping("/code/{codigo}")
     public String codec(@PathVariable String codigo){
        return miJavaCodeC.codigo(codigo);
     }
}
