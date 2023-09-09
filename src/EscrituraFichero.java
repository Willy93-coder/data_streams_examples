import java.io.FileWriter;
import java.io.IOException;

public class EscrituraFichero {

    public static void main(String[] args) {
        Escritura escribirCrearFichero = new Escritura();
        try {
            escribirCrearFichero.escribirArchivo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Escritura {
    public void escribirArchivo() throws IOException {
        String texto = ". Esta es una segunda frase.";
        FileWriter escritura = new FileWriter("./prueba_escritura_java.txt", true);

        for (int i = 0; i < texto.length(); i++) {
            escritura.write(texto.charAt(i));
        }

        escritura.close();
    }
}