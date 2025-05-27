package com.uceva.micro_servicio_lib_arq.ejemploc.lib;

public class JavaCodeC {

    public native String codigo(String codigo);
    
    public JavaCodeC(){
        try {
            System.loadLibrary("codec");
            System.out.println("Biblioteca cargada exitosamente!");
        } catch (Exception e) {
            System.err.println("Carga de la biblioteca fallida: "+e.getMessage());
        }
    }
}
