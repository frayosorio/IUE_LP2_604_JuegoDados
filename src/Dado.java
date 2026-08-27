import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Dado {

    private int numero;
    private Random r = new Random();

    public void lanzar() {
        // r.nextInt(6) genera numeros al azar entre 0 y 5
        numero = r.nextInt(6) + 1;
    }

    public void mostrar(JLabel lblDado) {
        // cargar la imagen de la cara que corresponda al numero generado al azar
        String rutaImagen = "imagenes/" + numero + ".jpg";
        ImageIcon imgDado = new ImageIcon(getClass().getResource(rutaImagen));

        // cambiar la imagen del JLABEL
        lblDado.setIcon(imgDado);
    }

    public int getNumero() {
        return numero;
    }

}
