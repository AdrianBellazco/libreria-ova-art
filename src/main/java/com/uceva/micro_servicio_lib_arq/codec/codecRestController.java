package com.uceva.micro_servicio_lib_arq.codec;

import libcodec.JavaCodec;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/art")
public class codecRestController {
    private JavaCodec miJavaCodeC;

    public codecRestController() {
        this.miJavaCodeC = new JavaCodec();
    }

    @PostMapping("/code")
    public String codec(@RequestBody String codigo) {
        return miJavaCodeC.codigo(codigo);
    }

}