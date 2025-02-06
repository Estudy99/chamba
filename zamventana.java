import javax.swing.*;

public class zamventana {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Mi Ventana");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(null);

        JLabel etiqueta_anuncio = new JLabel("¡Hola, Mundo!");
        JLabel etiqueta_2 = new JLabel("¡Prueba!");
        JLabel etiqueta_3 = new JLabel("¡Prueba encima 1!");
        JLabel etiqueta_4 = new JLabel("¡Prueba encima 2!");
        JButton button = new JButton("Enviar");
        JLabel nombre_usuario = new JLabel("Nombre Usuario:");
        JTextField textField = new JTextField(20);

        // Ajuste de posiciones
        etiqueta_anuncio.setBounds(30, 50, 120, 30);
        etiqueta_2.setBounds(300, 50, 100, 30);
        etiqueta_3.setBounds(30, 90, 150, 30);
        etiqueta_4.setBounds(300, 90, 150, 30);
        button.setBounds(30, 130, 100, 30); // Se movió más abajo
        nombre_usuario.setBounds(50, 180, 120, 30);
        textField.setBounds(200, 180, 200, 30);

        // Agregar componentes a la ventana
        frame.add(etiqueta_anuncio);
        frame.add(etiqueta_2);
        frame.add(etiqueta_3);
        frame.add(etiqueta_4);
        frame.add(button);
        frame.add(nombre_usuario);
        frame.add(textField); // Ahora sí se agrega el campo de texto

        frame.setVisible(true);
    }
}