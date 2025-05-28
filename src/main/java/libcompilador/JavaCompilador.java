package libcompilador;

public class JavaCompilador {

    public native String compilar(String codigo);

    public JavaCompilador(){
        try {
            System.loadLibrary("comp");
            System.out.println("Biblioteca cargada exitosamente!");
        } catch (Exception e) {
            System.err.println("Carga de la biblioteca fallida: "+e.getMessage());
        }
    }

}
//Java_libcompilador_JavaCompilador_compilar