package libcodec;

public class JavaCodec {

    public native String codigo(String codigo);

    public JavaCodec(){
        try {
            System.loadLibrary("codec");
            System.out.println("Biblioteca cargada exitosamente!");
        } catch (Exception e) {
            System.err.println("Carga de la biblioteca fallida: "+e.getMessage());
        }
    }

}