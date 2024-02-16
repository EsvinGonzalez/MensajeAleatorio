import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MensajeAleatorio {

    private static final String[] mostrar ={ "Hoy tendras un exelente dia", "Este año se lograran todos tus objetivos", 
    "Tendras mucha suerte hoy","Piensa siempre positivo", "Encontraras tu camino solo no dejes de luchar "};


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> crearInterfaz());
    }

    private static void crearInterfaz() {
        JFrame frame = new JFrame("Mensaje Aleatorio");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null);
        JButton botonObtenerMensaje = new JButton("Mostrar Mensaje");
        JLabel etiquetaMensaje = new JLabel("Presiona el boton para mostrar un mensaje.");

        botonObtenerMensaje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarMensajeAleatorio(etiquetaMensaje);
            }
        });

        JPanel panel = new JPanel();
        panel.add(botonObtenerMensaje);
        panel.add(etiquetaMensaje);

        frame.add(panel);
        frame.setVisible(true);
    }

    private static void mostrarMensajeAleatorio(JLabel etiquetaMensaje) {
        Random random = new Random();
        int indiceMensaje = random.nextInt(mostrar.length);
        etiquetaMensaje.setText(mostrar[indiceMensaje]);
    }
    
}
