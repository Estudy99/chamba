import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

// Clase principal
public class MotomatesApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VentanaInicio());
    }
}

// Clase tipo Carro1 pero para Motocicletas
class Motocicleta {
    private String marca;
    private String modelo;
    private String apodo;
    private int año;
    private String placas;

    public Motocicleta(String marca, String modelo, String apodo, int año, String placas) {
        this.marca = marca;
        this.modelo = modelo;
        this.apodo = apodo;
        this.año = año;
        this.placas = placas;
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Apodo: " + apodo);
        System.out.println("Año: " + año);
        System.out.println("Placas: " + placas);
    }

    public String obtenerResumen() {
        return "Moto registrada:\n" +
                "Año: " + año + "\n" +
                "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Apodo: " + apodo + "\n" +
                "Placas: " + placas;
    }
}

// Pantalla de inicio usando setBounds como ivanventana.java
class VentanaInicio extends JFrame {
    public VentanaInicio() {
        setTitle("Motomates - Inicio");
        setSize(400, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel etiqueta_anuncio = new JLabel("COMIENZA A RODAR.");
        etiqueta_anuncio.setFont(new Font("Arial", Font.BOLD, 20));
        etiqueta_anuncio.setForeground(Color.WHITE);
        etiqueta_anuncio.setBounds(90, 30, 250, 30);

        JLabel subtitulo = new JLabel("Regístrate/Inicia sesión");
        subtitulo.setForeground(Color.WHITE);
        subtitulo.setBounds(120, 60, 200, 20);

        JTextField textField_usuario = new JTextField("Email o número de teléfono*");
        textField_usuario.setBounds(50, 100, 300, 30);

        JPasswordField campo_contrasena = new JPasswordField("Contraseña*");
        campo_contrasena.setBounds(50, 140, 300, 30);

        JButton boton_ingresar = new JButton("Continuar");
        boton_ingresar.setBounds(125, 190, 150, 35);
        boton_ingresar.setBackground(new Color(173, 216, 230));
        boton_ingresar.setBorder(new RoundedBorder(15));
        boton_ingresar.setFocusPainted(false);
        boton_ingresar.addActionListener(e -> {
            dispose();
            new VentanaMenu();
        });

        // Texto "Acceso rápido con"
        JLabel etiqueta_rapido = new JLabel("Acceso rápido con:");
        etiqueta_rapido.setForeground(Color.WHITE);
        etiqueta_rapido.setBounds(125, 250, 200, 30);

        // Íconos de acceso horizontal
        JLabel iconoX = new JLabel(escalarIcono("x_icon.png", 35, 35));
        iconoX.setBounds(60, 290, 40, 40);

        JLabel iconoFacebook = new JLabel(escalarIcono("facebook_icon.png", 35, 35));
        iconoFacebook.setBounds(120, 290, 40, 40);

        JLabel iconoGoogle = new JLabel(escalarIcono("google_icon.png", 35, 35));
        iconoGoogle.setBounds(180, 290, 40, 40);

        JLabel iconoApple = new JLabel(escalarIcono("apple_icon.png", 35, 35));
        iconoApple.setBounds(240, 290, 40, 40);

        JLabel etiqueta_fondo = new JLabel(new ImageIcon("fondo_login.jpg"));
        etiqueta_fondo.setBounds(0, 0, 400, 600);
        etiqueta_fondo.setLayout(null);

        etiqueta_fondo.add(etiqueta_anuncio);
        etiqueta_fondo.add(subtitulo);
        etiqueta_fondo.add(textField_usuario);
        etiqueta_fondo.add(campo_contrasena);
        etiqueta_fondo.add(boton_ingresar);
        etiqueta_fondo.add(etiqueta_rapido);
        etiqueta_fondo.add(iconoX);
        etiqueta_fondo.add(iconoFacebook);
        etiqueta_fondo.add(iconoGoogle);
        etiqueta_fondo.add(iconoApple);

        setContentPane(etiqueta_fondo);
        setVisible(true);
    }

    private ImageIcon escalarIcono(String ruta, int ancho, int alto) {
        ImageIcon iconoOriginal = new ImageIcon(ruta);
        Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
        return new ImageIcon(imagenEscalada);
    }
}

// Ventana del menú y sección de motocicleta
class VentanaMenu extends JFrame {
    public VentanaMenu() {
        setTitle("Motomates - Menú");
        setSize(400, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(new Color(0x0A1932));

        JLabel etiqueta_menu = new JLabel("Menú principal");
        etiqueta_menu.setForeground(Color.WHITE);
        etiqueta_menu.setFont(new Font("Arial", Font.BOLD, 20));
        etiqueta_menu.setBounds(120, 20, 200, 30);
        add(etiqueta_menu);

        JButton boton_miMoto = new JButton("Mi motocicleta");
        boton_miMoto.setBounds(100, 70, 200, 40);
        estiloBoton(boton_miMoto);
        boton_miMoto.addActionListener(e -> {
            dispose();
            new VentanaMoto();
        });

        JButton boton_soporte = new JButton("Soporte");
        boton_soporte.setBounds(100, 120, 200, 40);
        estiloBoton(boton_soporte);

        JButton boton_localizacion = new JButton("Localización");
        boton_localizacion.setBounds(100, 170, 200, 40);
        estiloBoton(boton_localizacion);

        JButton boton_nosotros = new JButton("Sobre nosotros");
        boton_nosotros.setBounds(100, 220, 200, 40);
        estiloBoton(boton_nosotros);

        JButton boton_estilo = new JButton("Mi estilo");
        boton_estilo.setBounds(100, 270, 200, 40);
        estiloBoton(boton_estilo);

        JButton boton_privacidad = new JButton("Aviso de privacidad");
        boton_privacidad.setBounds(100, 320, 200, 40);
        estiloBoton(boton_privacidad);

        JButton boton_salir = new JButton("⬅ Cerrar sesión");
        boton_salir.setBounds(100, 390, 200, 35);
        estiloBoton(boton_salir);
        boton_salir.addActionListener(e -> {
            dispose();
            new VentanaInicio();
        });

        add(boton_miMoto);
        add(boton_soporte);
        add(boton_localizacion);
        add(boton_nosotros);
        add(boton_estilo);
        add(boton_privacidad);
        add(boton_salir);

        setVisible(true);
    }

    private void estiloBoton(JButton boton) {
        boton.setBackground(new Color(173, 216, 230));
        boton.setForeground(Color.BLACK);
        boton.setFont(new Font("Arial", Font.BOLD, 14));
        boton.setFocusPainted(false);
        boton.setBorder(new RoundedBorder(15));
    }
}

// Ventana de ingreso de información de la moto
class VentanaMoto extends JFrame {
    public VentanaMoto() {
        setTitle("Motomates - Mi motocicleta");
        setSize(400, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(new Color(0x0A1932));

        JLabel etiqueta_formulario = new JLabel("Ingresa los datos de tu moto");
        etiqueta_formulario.setForeground(Color.WHITE);
        etiqueta_formulario.setBounds(90, 20, 250, 30);
        add(etiqueta_formulario);

        JLabel etiqueta_anio = new JLabel("Año:");
        JLabel etiqueta_marca = new JLabel("Marca:");
        JLabel etiqueta_modelo = new JLabel("Modelo:");
        JLabel etiqueta_apodo = new JLabel("Apodo:");
        JLabel etiqueta_placas = new JLabel("Placas:");
        JTextField campo_anio = new JTextField();
        JTextField campo_marca = new JTextField();
        JTextField campo_modelo = new JTextField();
        JTextField campo_apodo = new JTextField();
        JTextField campo_placas = new JTextField();

        etiqueta_anio.setBounds(50, 70, 80, 25);
        campo_anio.setBounds(150, 70, 200, 25);
        etiqueta_marca.setBounds(50, 110, 80, 25);
        campo_marca.setBounds(150, 110, 200, 25);
        etiqueta_modelo.setBounds(50, 150, 80, 25);
        campo_modelo.setBounds(150, 150, 200, 25);
        etiqueta_apodo.setBounds(50, 190, 80, 25);
        campo_apodo.setBounds(150, 190, 200, 25);
        etiqueta_placas.setBounds(50, 230, 80, 25);
        campo_placas.setBounds(150, 230, 200, 25);

        etiqueta_anio.setForeground(Color.WHITE);
        etiqueta_marca.setForeground(Color.WHITE);
        etiqueta_modelo.setForeground(Color.WHITE);
        etiqueta_apodo.setForeground(Color.WHITE);
        etiqueta_placas.setForeground(Color.WHITE);

        add(etiqueta_anio); add(campo_anio);
        add(etiqueta_marca); add(campo_marca);
        add(etiqueta_modelo); add(campo_modelo);
        add(etiqueta_apodo); add(campo_apodo);
        add(etiqueta_placas); add(campo_placas);

        JButton boton_guardar = new JButton("Guardar");
        boton_guardar.setBounds(125, 280, 150, 30);
        boton_guardar.setBackground(new Color(173, 216, 230));
        boton_guardar.setBorder(new RoundedBorder(15));
        boton_guardar.addActionListener(e -> {
            try {
                int anioMoto = Integer.parseInt(campo_anio.getText());
                Motocicleta miMoto = new Motocicleta(
                        campo_marca.getText(),
                        campo_modelo.getText(),
                        campo_apodo.getText(),
                        anioMoto,
                        campo_placas.getText()
                );
                miMoto.mostrarInfo();
                JOptionPane.showMessageDialog(this, miMoto.obtenerResumen());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Verifica los datos ingresados");
            }
        });

        JButton boton_volver = new JButton("⬅ Volver al menú");
        boton_volver.setBounds(125, 330, 150, 30);
        boton_volver.setBackground(new Color(173, 216, 230));
        boton_volver.setBorder(new RoundedBorder(15));
        boton_volver.addActionListener(e -> {
            dispose();
            new VentanaMenu();
        });

        add(boton_guardar);
        add(boton_volver);

        setVisible(true);
    }
}

// Clase borde redondeado para botones
class RoundedBorder extends AbstractBorder {
    private int radius;

    public RoundedBorder(int radius) {
        this.radius = radius;
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(this.radius + 5, this.radius + 5, this.radius + 5, this.radius + 5);
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.setColor(Color.BLACK);
        g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
    }
}