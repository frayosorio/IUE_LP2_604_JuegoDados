import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;

public class FrmJuego extends JFrame {

    // metodo constructor
    public FrmJuego() {
        setTitle("Juego de Dados");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        String archivoIamgenes = "imagenes/4.jpg";
        ImageIcon imgDado = new ImageIcon(getClass().getResource(archivoIamgenes));

        JLabel lblDado1 = new JLabel(imgDado);
        lblDado1.setIcon(imgDado);

        lblDado1.setBounds(10, 10, imgDado.getIconWidth(), imgDado.getIconHeight());
        add(lblDado1);

        JLabel lblDado2 = new JLabel(imgDado);
        lblDado2.setIcon(imgDado);

        lblDado2.setBounds(20 + imgDado.getIconWidth(), 10, imgDado.getIconWidth(), imgDado.getIconHeight());
        add(lblDado2);

        JLabel lblTituloLanzamientos = new JLabel("Lanzamientos");
        lblTituloLanzamientos.setHorizontalAlignment(JLabel.CENTER);
        lblTituloLanzamientos.setBounds(30 + imgDado.getIconWidth() * 2, 10, 100, 25);
        add(lblTituloLanzamientos);

        JLabel lblLanzamientos = new JLabel("0");
        lblLanzamientos.setFont(new Font("Impact", Font.BOLD, 72));
        lblLanzamientos.setBackground(new Color(0, 0, 0));
        lblLanzamientos.setForeground(new Color(0, 255, 0));
        lblLanzamientos.setOpaque(true);
        lblLanzamientos.setHorizontalAlignment(JLabel.RIGHT);
        lblLanzamientos.setBounds(30 + imgDado.getIconWidth() * 2, 40, 100, 100);
        add(lblLanzamientos);

        JLabel lblTituloCenas = new JLabel("Cenas");
        lblTituloCenas.setHorizontalAlignment(JLabel.CENTER);
        lblTituloCenas.setBounds(140 + imgDado.getIconWidth() * 2, 10, 100, 25);
        add(lblTituloCenas);

        JLabel lblCenas = new JLabel("0");
        lblCenas.setFont(new Font("Impact", Font.BOLD, 72));
        lblCenas.setBackground(new Color(0, 0, 0));
        lblCenas.setForeground(new Color(0, 255, 0));
        lblCenas.setOpaque(true);
        lblCenas.setHorizontalAlignment(JLabel.RIGHT);
        lblCenas.setBounds(140 + imgDado.getIconWidth() * 2, 40, 100, 100);
        add(lblCenas);

        JButton btnIniciar = new JButton("Iniciar");
        btnIniciar.setBounds(10, 20 + imgDado.getIconHeight(), 100, 25);
        add(btnIniciar);

        JButton btnLanzar = new JButton("Lanzar");
        btnLanzar.setBounds(10, 50 + imgDado.getIconHeight(), 100, 25);
        add(btnLanzar);

        btnIniciar.addActionListener(e -> {
            iniciar();
        });

        btnLanzar.addActionListener(e -> {
            lanzar();
        });
    }

    private void iniciar() {
        JOptionPane.showMessageDialog(null, "Hizo clic en INICIAR");
    }

    private void lanzar() {
        JOptionPane.showMessageDialog(null, "Hizo clic en LANZAR");
    }

}
