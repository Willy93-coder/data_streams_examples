import java.io.FileReader;
import java.io.IOException;

public class AccesoLecturaFichero {
    public static void main(String[] args) {
        LeerFichero acceso_externo = new LeerFichero();

        try {
            acceso_externo.leeDatos();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class LeerFichero {
    public void leeDatos() throws IOException {
        FileReader entrada = new FileReader("./prueba.txt");
        int caracter = entrada.read();

        while (caracter > -1) {
            System.out.print((char) caracter);
            caracter = entrada.read();
        }
        entrada.close();
    }
}