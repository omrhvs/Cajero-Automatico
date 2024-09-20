package paqueteinicial;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class VentanaInicial extends javax.swing.JFrame
{
    private StringBuilder codigoIngresado = new StringBuilder();
    private StringBuilder montoIngresado = new StringBuilder();
    private StringBuilder montoRetirado = new StringBuilder();
    
    private CardLayout cardLayout = new CardLayout();
    private Map<Component, String> nombresDePaneles = new HashMap<>();
    
    private double saldoInicial = 0;
    private NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance();
    private String saldoActual;
    
    private LocalDateTime tiempo = LocalDateTime.now();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy | HH:mm");
    private String fechaActual = tiempo.format(formatter);
    
    private final Point[] clickInicial = new Point[1];
    
    private boolean depositoo = false;
    private boolean retiroo = false;
    
    private int intentosActuales = 0;
    
    public VentanaInicial()
    {
        setIconImage(getIcono());
        setUndecorated(true);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        
        ListenersVentana.reposicionarVentanaListener(this);
        
        FlatLightLaf.setup();
        
        try 
        {
            UIManager.setLookAndFeel(new FlatLightLaf());
        }
        catch (UnsupportedLookAndFeelException e) 
        {
            e.printStackTrace();
        }
        
        initComponents();
        salir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        etSalir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        consultar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        etConsultar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        retirar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        etRetirar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        depositar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        etDepositar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        iconoVolverCons.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        etVolverCon.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        iconoConfirmarSalir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        etConfirmarSalir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        iconoCancelarSalir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        etCancelarSalir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        uno.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        dos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        tres.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        cuatro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        cinco.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        seis.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        ocho.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        nueve.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        cero.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        cancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        limpiar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        borrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        confirmar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        dinero.setVisible(false);
        
        cuadroNIP.setEditable(false);
        cuadroNIP.setFocusable(false);
        cuadroMontoDeposito.setEditable(false);
        cuadroMontoDeposito.setFocusable(false);
        cuadroMontoRetiro.setEditable(false);
        cuadroMontoRetiro.setFocusable(false);
        
        fechaLogIn.setText(fechaActual);
        cuadroNIP.setEchoChar('*');
        
        this.saldoActual = formatoMoneda.format(saldoInicial);
        saldo.setText(saldoActual);
    }
    
    public static Image getIcono()
    {
        return Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("resources/logo.png"));
    }
    
    private void ocultarDinero()
    {
        dinero.setVisible(false);
    }

    Timer timer = new Timer(2000, new ActionListener() 
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            ocultarDinero();
            timer.stop();
        }
    });
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cajero = new javax.swing.JPanel();
        seccionCentral = new javax.swing.JPanel();
        monitor = new javax.swing.JPanel();
        logIn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cuadroNIP = new javax.swing.JPasswordField();
        mensajeNipIncorrecto = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        fechaLogIn = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        cuentaBloqueada = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        fechaBloqueo = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        confirmarCancelar = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        fechaConfirmarSalir = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        iconoConfirmarSalir = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        etConfirmarSalir = new javax.swing.JLabel();
        iconoCancelarSalir = new javax.swing.JLabel();
        etCancelarSalir = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        fechaMenu = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        consultar = new javax.swing.JLabel();
        salir = new javax.swing.JLabel();
        depositar = new javax.swing.JLabel();
        retirar = new javax.swing.JLabel();
        etSalir = new javax.swing.JLabel();
        etConsultar = new javax.swing.JLabel();
        etRetirar = new javax.swing.JLabel();
        etDepositar = new javax.swing.JLabel();
        consulta = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        fechaConsulta = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        iconoVolverCons = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        saldo = new javax.swing.JLabel();
        etVolverCon = new javax.swing.JLabel();
        deposito = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        fechaDepositar = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        iconoVolverDep = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        etVolverDep = new javax.swing.JLabel();
        cuadroMontoDeposito = new javax.swing.JTextField();
        depositarDinero = new javax.swing.JButton();
        retiro = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        fechaRetirar = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        iconoVolverRet = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        etVolverRet = new javax.swing.JLabel();
        cuadroMontoRetiro = new javax.swing.JTextField();
        retirarDinero = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        panelReposadera = new javax.swing.JPanel();
        teclado = new javax.swing.JPanel();
        uno = new javax.swing.JButton();
        dos = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        cuatro = new javax.swing.JButton();
        cero = new javax.swing.JButton();
        siete = new javax.swing.JButton();
        ocho = new javax.swing.JButton();
        nueve = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        confirmar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        dinero = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Santander ATM");

        cajero.setBackground(new java.awt.Color(82, 81, 81));

        seccionCentral.setBackground(new java.awt.Color(236, 0, 0));

        monitor.setBackground(new java.awt.Color(255, 255, 255));
        monitor.setLayout(new java.awt.CardLayout());

        logIn.setBackground(new java.awt.Color(255, 255, 255));
        logIn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.black, java.awt.Color.darkGray));

        jLabel1.setFont(new java.awt.Font("DM Serif Display", 0, 36)); // NOI18N
        jLabel1.setText("Digite su");

        jLabel2.setFont(new java.awt.Font("DM Serif Display", 2, 36)); // NOI18N
        jLabel2.setText("NIP");

        cuadroNIP.setFont(new java.awt.Font("Montserrat", 0, 36)); // NOI18N
        cuadroNIP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 0, 0)));

        mensajeNipIncorrecto.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        mensajeNipIncorrecto.setForeground(new java.awt.Color(255, 51, 51));

        jPanel4.setBackground(new java.awt.Color(236, 0, 0));

        jLabel24.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Bienvenido a su");

        jLabel25.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Sucursal Tultitlán");

        fechaLogIn.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        fechaLogIn.setForeground(new java.awt.Color(255, 255, 255));
        fechaLogIn.setText("23 Noviembre 2023 | 13:02");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fechaLogIn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel25))
                    .addComponent(fechaLogIn))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/santander.png"))); // NOI18N

        jLabel22.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel22.setText("Cajero: 27030510");

        jLabel23.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel23.setText("TULTITLÁN");

        jLabel29.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel29.setText("CCTOSS TLN 1500 XE");

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(236, 0, 0));
        jLabel3.setText("Siempre hay");

        jLabel14.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(236, 0, 0));
        jLabel14.setText("una sucursal");

        jLabel21.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(236, 0, 0));
        jLabel21.setText("cerca de ti.");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel29)
                    .addComponent(jLabel27)
                    .addComponent(jLabel3)
                    .addComponent(jLabel14)
                    .addComponent(jLabel21)
                    .addComponent(jLabel23))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addGap(93, 93, 93)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addGap(142, 142, 142)
                .addComponent(jLabel27)
                .addGap(31, 31, 31))
        );

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/nip.png"))); // NOI18N

        javax.swing.GroupLayout logInLayout = new javax.swing.GroupLayout(logIn);
        logIn.setLayout(logInLayout);
        logInLayout.setHorizontalGroup(
            logInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logInLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(logInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(logInLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(logInLayout.createSequentialGroup()
                        .addGroup(logInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(logInLayout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(logInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(logInLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2))
                                    .addGroup(logInLayout.createSequentialGroup()
                                        .addGap(87, 87, 87)
                                        .addComponent(jLabel28))))
                            .addGroup(logInLayout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addComponent(cuadroNIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(140, Short.MAX_VALUE))
                    .addGroup(logInLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(mensajeNipIncorrecto)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        logInLayout.setVerticalGroup(
            logInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logInLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addGroup(logInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addComponent(cuadroNIP, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mensajeNipIncorrecto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
        );

        monitor.add(logIn, "card2");

        cuentaBloqueada.setBackground(new java.awt.Color(255, 255, 255));
        cuentaBloqueada.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.darkGray));

        jLabel66.setFont(new java.awt.Font("DM Serif Display", 0, 24)); // NOI18N
        jLabel66.setText("Información");

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/santander.png"))); // NOI18N

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel68)
                .addGap(16, 16, 16))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel68)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel26.setBackground(new java.awt.Color(236, 0, 0));

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/atm.png"))); // NOI18N

        jLabel70.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("Cajero: 27030510");

        jLabel71.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("TULTITLÁN");

        jLabel72.setFont(new java.awt.Font("Montserrat", 1, 10)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("Teléfono de emergencia");

        jLabel73.setFont(new java.awt.Font("Montserrat", 1, 10)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("55 5249 5767");

        fechaBloqueo.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        fechaBloqueo.setForeground(new java.awt.Color(255, 255, 255));
        fechaBloqueo.setText("23 Noviembre 2023 | 13:02");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel69)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel70)
                    .addComponent(jLabel71))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fechaBloqueo)
                    .addComponent(jLabel72)
                    .addComponent(jLabel73))
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel70)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel71))
                    .addComponent(jLabel69))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addComponent(jLabel72)
                .addGap(0, 0, 0)
                .addComponent(jLabel73)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fechaBloqueo))
        );

        jPanel27.setBackground(new java.awt.Color(236, 0, 0));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        jLabel75.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(236, 0, 0));
        jLabel75.setText("TARJETA REPORTADA COMO ROBADA, SERÁ");

        jLabel76.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel76.setText("STOLEN CARD");

        jLabel77.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(236, 0, 0));
        jLabel77.setText("RETENIDA POR ESTE CAJERO.");

        javax.swing.GroupLayout cuentaBloqueadaLayout = new javax.swing.GroupLayout(cuentaBloqueada);
        cuentaBloqueada.setLayout(cuentaBloqueadaLayout);
        cuentaBloqueadaLayout.setHorizontalGroup(
            cuentaBloqueadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cuentaBloqueadaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cuentaBloqueadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cuentaBloqueadaLayout.createSequentialGroup()
                        .addComponent(jLabel75)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cuentaBloqueadaLayout.createSequentialGroup()
                        .addComponent(jLabel76)
                        .addGap(230, 230, 230))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cuentaBloqueadaLayout.createSequentialGroup()
                        .addComponent(jLabel77)
                        .addGap(140, 140, 140))))
            .addGroup(cuentaBloqueadaLayout.createSequentialGroup()
                .addGroup(cuentaBloqueadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cuentaBloqueadaLayout.createSequentialGroup()
                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel66))
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cuentaBloqueadaLayout.setVerticalGroup(
            cuentaBloqueadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cuentaBloqueadaLayout.createSequentialGroup()
                .addGroup(cuentaBloqueadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(cuentaBloqueadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel66, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jLabel75)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel77)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addComponent(jLabel76)
                .addGap(20, 20, 20))
        );

        monitor.add(cuentaBloqueada, "card2");

        confirmarCancelar.setBackground(new java.awt.Color(255, 255, 255));
        confirmarCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.darkGray));

        jLabel54.setFont(new java.awt.Font("DM Serif Display", 0, 24)); // NOI18N
        jLabel54.setText("Confirmar");

        jLabel55.setFont(new java.awt.Font("DM Serif Display", 2, 24)); // NOI18N
        jLabel55.setText("Salir");

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/santander.png"))); // NOI18N

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel56)
                .addGap(16, 16, 16))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel56)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel21.setBackground(new java.awt.Color(236, 0, 0));

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/atm.png"))); // NOI18N

        jLabel58.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Cajero: 27030510");

        jLabel59.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("TULTITLÁN");

        jLabel60.setFont(new java.awt.Font("Montserrat", 1, 10)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("Teléfono de emergencia");

        jLabel61.setFont(new java.awt.Font("Montserrat", 1, 10)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("55 5249 5767");

        fechaConfirmarSalir.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        fechaConfirmarSalir.setForeground(new java.awt.Color(255, 255, 255));
        fechaConfirmarSalir.setText("23 Noviembre 2023 | 13:02");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel58)
                    .addComponent(jLabel59))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fechaConfirmarSalir)
                    .addComponent(jLabel60)
                    .addComponent(jLabel61))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel59))
                    .addComponent(jLabel57))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addComponent(jLabel60)
                .addGap(0, 0, 0)
                .addComponent(jLabel61)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fechaConfirmarSalir))
        );

        jPanel22.setBackground(new java.awt.Color(236, 0, 0));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        jPanel23.setBackground(new java.awt.Color(236, 0, 0));

        jLabel62.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("Seleccione la opción deseada.");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel62)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel62)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        iconoConfirmarSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/confirmar.png"))); // NOI18N
        iconoConfirmarSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoConfirmarSalirMouseClicked(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel63.setText("¿Esta seguro que desea salir?");

        etConfirmarSalir.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        etConfirmarSalir.setText("Confirmar");
        etConfirmarSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etConfirmarSalirMouseClicked(evt);
            }
        });

        iconoCancelarSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/volver.png"))); // NOI18N
        iconoCancelarSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoCancelarSalirMouseClicked(evt);
            }
        });

        etCancelarSalir.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        etCancelarSalir.setText("Cancelar");
        etCancelarSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etCancelarSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout confirmarCancelarLayout = new javax.swing.GroupLayout(confirmarCancelar);
        confirmarCancelar.setLayout(confirmarCancelarLayout);
        confirmarCancelarLayout.setHorizontalGroup(
            confirmarCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmarCancelarLayout.createSequentialGroup()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, confirmarCancelarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel63)
                .addGap(143, 143, 143))
            .addGroup(confirmarCancelarLayout.createSequentialGroup()
                .addGroup(confirmarCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(confirmarCancelarLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel55))
                    .addGroup(confirmarCancelarLayout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addGroup(confirmarCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iconoConfirmarSalir)
                            .addComponent(etConfirmarSalir))
                        .addGap(33, 33, 33)
                        .addGroup(confirmarCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(iconoCancelarSalir)
                            .addComponent(etCancelarSalir))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        confirmarCancelarLayout.setVerticalGroup(
            confirmarCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(confirmarCancelarLayout.createSequentialGroup()
                .addGroup(confirmarCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(confirmarCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(confirmarCancelarLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(confirmarCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, confirmarCancelarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel54)
                                .addComponent(jLabel55))
                            .addComponent(jPanel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addComponent(jLabel63)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(iconoConfirmarSalir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etConfirmarSalir))
                    .addGroup(confirmarCancelarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(iconoCancelarSalir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etCancelarSalir)))
                .addGap(78, 78, 78))
        );

        monitor.add(confirmarCancelar, "card2");

        menu.setBackground(new java.awt.Color(255, 255, 255));
        menu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.darkGray));

        jLabel4.setFont(new java.awt.Font("DM Serif Display", 0, 24)); // NOI18N
        jLabel4.setText("Omar");

        jLabel5.setFont(new java.awt.Font("DM Serif Display", 2, 24)); // NOI18N
        jLabel5.setText("Hernández");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/santander.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(236, 0, 0));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/atm.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Cajero: 27030510");

        jLabel17.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("TULTITLÁN");

        jLabel18.setFont(new java.awt.Font("Montserrat", 1, 10)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Teléfono de emergencia");

        jLabel19.setFont(new java.awt.Font("Montserrat", 1, 10)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("55 5249 5767");

        fechaMenu.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        fechaMenu.setForeground(new java.awt.Color(255, 255, 255));
        fechaMenu.setText("23 Noviembre 2023 | 13:02");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fechaMenu)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17))
                    .addComponent(jLabel16))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel18)
                .addGap(0, 0, 0)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fechaMenu))
        );

        jPanel6.setBackground(new java.awt.Color(236, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(236, 0, 0));

        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Seleccione la opción deseada.");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/consultar.png"))); // NOI18N
        consultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultarMouseClicked(evt);
            }
        });

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/salir.png"))); // NOI18N
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });

        depositar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/retirar.png"))); // NOI18N
        depositar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depositarMouseClicked(evt);
            }
        });

        retirar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/depositar.png"))); // NOI18N
        retirar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                retirarMouseClicked(evt);
            }
        });

        etSalir.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        etSalir.setText("Salir");
        etSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etSalirMouseClicked(evt);
            }
        });

        etConsultar.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        etConsultar.setText("Consultar");
        etConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etConsultarMouseClicked(evt);
            }
        });

        etRetirar.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        etRetirar.setText("Retirar");
        etRetirar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etRetirarMouseClicked(evt);
            }
        });

        etDepositar.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        etDepositar.setText("Depositar");
        etDepositar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etDepositarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addComponent(salir)
                        .addGap(0, 0, 0)
                        .addComponent(consultar)
                        .addGap(0, 0, 0)
                        .addComponent(retirar)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(depositar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addGap(5, 5, 5))
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(etSalir)
                .addGap(82, 82, 82)
                .addComponent(etConsultar)
                .addGap(67, 67, 67)
                .addComponent(etRetirar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etDepositar)
                .addGap(43, 43, 43))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5))
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(consultar)
                    .addComponent(salir)
                    .addComponent(depositar)
                    .addComponent(retirar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etRetirar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etDepositar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );

        monitor.add(menu, "card2");

        consulta.setBackground(new java.awt.Color(255, 255, 255));
        consulta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.darkGray));

        jLabel8.setFont(new java.awt.Font("DM Serif Display", 0, 24)); // NOI18N
        jLabel8.setText("Consultar");

        jLabel9.setFont(new java.awt.Font("DM Serif Display", 2, 24)); // NOI18N
        jLabel9.setText("Saldo");

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/santander.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(16, 16, 16))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(236, 0, 0));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/atm.png"))); // NOI18N

        jLabel30.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Cajero: 27030510");

        jLabel31.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("TULTITLÁN");

        jLabel32.setFont(new java.awt.Font("Montserrat", 1, 10)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Teléfono de emergencia");

        jLabel33.setFont(new java.awt.Font("Montserrat", 1, 10)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("55 5249 5767");

        fechaConsulta.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        fechaConsulta.setForeground(new java.awt.Color(255, 255, 255));
        fechaConsulta.setText("23 Noviembre 2023 | 13:02");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fechaConsulta)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31))
                    .addComponent(jLabel26))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel32)
                .addGap(0, 0, 0)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fechaConsulta))
        );

        jPanel10.setBackground(new java.awt.Color(236, 0, 0));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(236, 0, 0));

        jLabel10.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Seleccione la opción deseada.");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        iconoVolverCons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/volver.png"))); // NOI18N
        iconoVolverCons.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoVolverConsMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel11.setText("Tu saldo es:");

        saldo.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        saldo.setText("%saldo%");

        etVolverCon.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        etVolverCon.setText("Volver");
        etVolverCon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etVolverConMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout consultaLayout = new javax.swing.GroupLayout(consulta);
        consulta.setLayout(consultaLayout);
        consultaLayout.setHorizontalGroup(
            consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultaLayout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(consultaLayout.createSequentialGroup()
                .addGroup(consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(consultaLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9))
                    .addGroup(consultaLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saldo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultaLayout.createSequentialGroup()
                        .addComponent(etVolverCon)
                        .addGap(248, 248, 248))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultaLayout.createSequentialGroup()
                        .addComponent(iconoVolverCons)
                        .addGap(240, 240, 240))))
        );
        consultaLayout.setVerticalGroup(
            consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(consultaLayout.createSequentialGroup()
                .addGroup(consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9))
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(saldo))
                .addGap(25, 25, 25)
                .addComponent(iconoVolverCons)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etVolverCon)
                .addGap(78, 78, 78))
        );

        monitor.add(consulta, "card2");

        deposito.setBackground(new java.awt.Color(255, 255, 255));
        deposito.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.darkGray));

        jLabel34.setFont(new java.awt.Font("DM Serif Display", 0, 24)); // NOI18N
        jLabel34.setText("Depositar");

        jLabel35.setFont(new java.awt.Font("DM Serif Display", 2, 24)); // NOI18N
        jLabel35.setText("Dinero");

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/santander.png"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addGap(16, 16, 16))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel36)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(236, 0, 0));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/atm.png"))); // NOI18N

        jLabel38.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Cajero: 27030510");

        jLabel39.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("TULTITLÁN");

        jLabel40.setFont(new java.awt.Font("Montserrat", 1, 10)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Teléfono de emergencia");

        jLabel41.setFont(new java.awt.Font("Montserrat", 1, 10)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("55 5249 5767");

        fechaDepositar.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        fechaDepositar.setForeground(new java.awt.Color(255, 255, 255));
        fechaDepositar.setText("23 Noviembre 2023 | 13:02");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fechaDepositar)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel39))
                    .addComponent(jLabel37))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel40)
                .addGap(0, 0, 0)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fechaDepositar))
        );

        jPanel14.setBackground(new java.awt.Color(236, 0, 0));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        jPanel15.setBackground(new java.awt.Color(236, 0, 0));

        jLabel42.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Seleccione la opción deseada.");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel42)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        iconoVolverDep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/volver.png"))); // NOI18N
        iconoVolverDep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoVolverDepMouseClicked(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel43.setText("Ingrese el monto a depositar.");

        etVolverDep.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        etVolverDep.setText("Volver");
        etVolverDep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etVolverDepMouseClicked(evt);
            }
        });

        cuadroMontoDeposito.setFont(new java.awt.Font("Montserrat", 0, 36)); // NOI18N
        cuadroMontoDeposito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 0, 0)));

        depositarDinero.setBackground(new java.awt.Color(236, 0, 0));
        depositarDinero.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        depositarDinero.setForeground(new java.awt.Color(255, 255, 255));
        depositarDinero.setText("Depositar");
        depositarDinero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depositarDineroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                depositarDineroMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout depositoLayout = new javax.swing.GroupLayout(deposito);
        deposito.setLayout(depositoLayout);
        depositoLayout.setHorizontalGroup(
            depositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depositoLayout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(depositoLayout.createSequentialGroup()
                .addGroup(depositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(depositoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35))
                    .addGroup(depositoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(depositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(depositoLayout.createSequentialGroup()
                                .addComponent(etVolverDep)
                                .addGap(8, 8, 8))
                            .addComponent(iconoVolverDep))
                        .addGap(77, 77, 77)
                        .addGroup(depositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(depositoLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(depositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(depositarDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cuadroMontoDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        depositoLayout.setVerticalGroup(
            depositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depositoLayout.createSequentialGroup()
                .addGroup(depositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(depositoLayout.createSequentialGroup()
                        .addGroup(depositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addGroup(depositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, depositoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel34)
                                .addComponent(jLabel35))
                            .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(162, 162, 162)
                        .addComponent(iconoVolverDep)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, depositoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel43)
                        .addGap(18, 18, 18)
                        .addComponent(cuadroMontoDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(depositarDinero)
                        .addGap(65, 65, 65)))
                .addComponent(etVolverDep)
                .addContainerGap())
        );

        monitor.add(deposito, "card2");

        retiro.setBackground(new java.awt.Color(255, 255, 255));
        retiro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.black, java.awt.Color.darkGray));

        jLabel44.setFont(new java.awt.Font("DM Serif Display", 0, 24)); // NOI18N
        jLabel44.setText("Retirar");

        jLabel45.setFont(new java.awt.Font("DM Serif Display", 2, 24)); // NOI18N
        jLabel45.setText("Dinero");

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/santander.png"))); // NOI18N

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel46)
                .addGap(16, 16, 16))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel46)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(236, 0, 0));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/atm.png"))); // NOI18N

        jLabel48.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Cajero: 27030510");

        jLabel49.setFont(new java.awt.Font("Montserrat", 0, 10)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("TULTITLÁN");

        jLabel50.setFont(new java.awt.Font("Montserrat", 1, 10)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Teléfono de emergencia");

        jLabel51.setFont(new java.awt.Font("Montserrat", 1, 10)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("55 5249 5767");

        fechaRetirar.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        fechaRetirar.setForeground(new java.awt.Color(255, 255, 255));
        fechaRetirar.setText("23 Noviembre 2023 | 13:02");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel48)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fechaRetirar)
                    .addComponent(jLabel50)
                    .addComponent(jLabel51))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel49))
                    .addComponent(jLabel47))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addComponent(jLabel50)
                .addGap(0, 0, 0)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fechaRetirar))
        );

        jPanel18.setBackground(new java.awt.Color(236, 0, 0));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        jPanel19.setBackground(new java.awt.Color(236, 0, 0));

        jLabel52.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Seleccione la opción deseada.");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel52)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel52)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        iconoVolverRet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/volver.png"))); // NOI18N
        iconoVolverRet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconoVolverRetMouseClicked(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel53.setText("Ingrese el monto a retirar.");

        etVolverRet.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        etVolverRet.setText("Volver");
        etVolverRet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etVolverRetMouseClicked(evt);
            }
        });

        cuadroMontoRetiro.setFont(new java.awt.Font("Montserrat", 0, 36)); // NOI18N
        cuadroMontoRetiro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(236, 0, 0)));
        cuadroMontoRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadroMontoRetiroActionPerformed(evt);
            }
        });

        retirarDinero.setBackground(new java.awt.Color(236, 0, 0));
        retirarDinero.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        retirarDinero.setForeground(new java.awt.Color(255, 255, 255));
        retirarDinero.setText("Retirar");
        retirarDinero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                retirarDineroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                retirarDineroMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout retiroLayout = new javax.swing.GroupLayout(retiro);
        retiro.setLayout(retiroLayout);
        retiroLayout.setHorizontalGroup(
            retiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(retiroLayout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(retiroLayout.createSequentialGroup()
                .addGroup(retiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(retiroLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(etVolverRet)
                        .addGap(139, 139, 139)
                        .addComponent(retirarDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(retiroLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel45))
                    .addGroup(retiroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(iconoVolverRet))
                    .addGroup(retiroLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(retiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(retiroLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(cuadroMontoRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel53))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        retiroLayout.setVerticalGroup(
            retiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(retiroLayout.createSequentialGroup()
                .addGroup(retiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(retiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, retiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel44)
                        .addComponent(jLabel45))
                    .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jLabel53)
                .addGap(18, 18, 18)
                .addComponent(cuadroMontoRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(retiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(retiroLayout.createSequentialGroup()
                        .addComponent(retirarDinero)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, retiroLayout.createSequentialGroup()
                        .addComponent(iconoVolverRet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(etVolverRet)
                .addContainerGap())
        );

        monitor.add(retiro, "card2");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/isotipowhite.png"))); // NOI18N

        panelReposadera.setBackground(new java.awt.Color(28, 28, 28));
        panelReposadera.setForeground(new java.awt.Color(28, 28, 28));

        teclado.setBackground(new java.awt.Color(28, 28, 28));

        uno.setBackground(new java.awt.Color(243, 243, 243));
        uno.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        uno.setText("1");
        uno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.black, java.awt.Color.darkGray));
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });

        dos.setBackground(new java.awt.Color(243, 243, 243));
        dos.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        dos.setText("2");
        dos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.black, java.awt.Color.darkGray));
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });

        tres.setBackground(new java.awt.Color(243, 243, 243));
        tres.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        tres.setText("3");
        tres.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.black, java.awt.Color.darkGray));
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });

        seis.setBackground(new java.awt.Color(243, 243, 243));
        seis.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        seis.setText("6");
        seis.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.black, java.awt.Color.darkGray));
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });

        cinco.setBackground(new java.awt.Color(243, 243, 243));
        cinco.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        cinco.setText("5");
        cinco.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.black, java.awt.Color.darkGray));
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });

        cuatro.setBackground(new java.awt.Color(243, 243, 243));
        cuatro.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        cuatro.setText("4");
        cuatro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.black, java.awt.Color.darkGray));
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });

        cero.setBackground(new java.awt.Color(243, 243, 243));
        cero.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        cero.setText("0");
        cero.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.black, java.awt.Color.darkGray));
        cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroActionPerformed(evt);
            }
        });

        siete.setBackground(new java.awt.Color(243, 243, 243));
        siete.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        siete.setText("7");
        siete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.black, java.awt.Color.darkGray));
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });

        ocho.setBackground(new java.awt.Color(243, 243, 243));
        ocho.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        ocho.setText("8");
        ocho.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.black, java.awt.Color.darkGray));
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });

        nueve.setBackground(new java.awt.Color(243, 243, 243));
        nueve.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        nueve.setText("9");
        nueve.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.black, java.awt.Color.darkGray));
        nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueveActionPerformed(evt);
            }
        });

        cancelar.setBackground(new java.awt.Color(243, 243, 243));
        cancelar.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.black, java.awt.Color.darkGray));
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        limpiar.setBackground(new java.awt.Color(243, 243, 243));
        limpiar.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        limpiar.setText("Limpiar");
        limpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.black, java.awt.Color.darkGray));
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        confirmar.setBackground(new java.awt.Color(243, 243, 243));
        confirmar.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        confirmar.setText("Confirmar");
        confirmar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.black, java.awt.Color.darkGray));
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        borrar.setBackground(new java.awt.Color(243, 243, 243));
        borrar.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        borrar.setText("<");
        borrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.black, java.awt.Color.darkGray));
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tecladoLayout = new javax.swing.GroupLayout(teclado);
        teclado.setLayout(tecladoLayout);
        tecladoLayout.setHorizontalGroup(
            tecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tecladoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(tecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tecladoLayout.createSequentialGroup()
                        .addComponent(cero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(tecladoLayout.createSequentialGroup()
                        .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tecladoLayout.createSequentialGroup()
                        .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tecladoLayout.createSequentialGroup()
                        .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(tecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(confirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        tecladoLayout.setVerticalGroup(
            tecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tecladoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(tecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tecladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dinero.setBackground(new java.awt.Color(28, 28, 28));

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/dinero.png"))); // NOI18N

        javax.swing.GroupLayout dineroLayout = new javax.swing.GroupLayout(dinero);
        dinero.setLayout(dineroLayout);
        dineroLayout.setHorizontalGroup(
            dineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dineroLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel64)
                .addContainerGap())
        );
        dineroLayout.setVerticalGroup(
            dineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dineroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 237, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        jLabel65.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("Tome su dinero");

        javax.swing.GroupLayout panelReposaderaLayout = new javax.swing.GroupLayout(panelReposadera);
        panelReposadera.setLayout(panelReposaderaLayout);
        panelReposaderaLayout.setHorizontalGroup(
            panelReposaderaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReposaderaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(teclado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelReposaderaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelReposaderaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(dinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelReposaderaLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel65))
                    .addGroup(panelReposaderaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelReposaderaLayout.setVerticalGroup(
            panelReposaderaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReposaderaLayout.createSequentialGroup()
                .addGroup(panelReposaderaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelReposaderaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(teclado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelReposaderaLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel65)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout seccionCentralLayout = new javax.swing.GroupLayout(seccionCentral);
        seccionCentral.setLayout(seccionCentralLayout);
        seccionCentralLayout.setHorizontalGroup(
            seccionCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seccionCentralLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(monitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
            .addComponent(panelReposadera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seccionCentralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(268, 268, 268))
        );
        seccionCentralLayout.setVerticalGroup(
            seccionCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seccionCentralLayout.createSequentialGroup()
                .addComponent(jLabel15)
                .addGap(0, 0, 0)
                .addComponent(monitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(panelReposadera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout cajeroLayout = new javax.swing.GroupLayout(cajero);
        cajero.setLayout(cajeroLayout);
        cajeroLayout.setHorizontalGroup(
            cajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cajeroLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(seccionCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(60, 60, 60))
        );
        cajeroLayout.setVerticalGroup(
            cajeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(seccionCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cajero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cajero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        if(consulta.isVisible())
        {
            volverAlMenu(consulta);
        }
        else if(deposito.isVisible())
        {
            volverAlMenu(consulta);
        }
        else if(retiro.isVisible())
        {
            volverAlMenu(consulta);
        }
        else if(menu.isVisible() && !logIn.isVisible())
        {
            confirmarSalida();
        }
        else if(logIn.isVisible())
        {
            System.exit(0);
        }
    }//GEN-LAST:event_cancelarActionPerformed

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        ingresarDigito("1");
    }//GEN-LAST:event_unoActionPerformed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
        ingresarDigito("2");
    }//GEN-LAST:event_dosActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        ingresarDigito("3");
    }//GEN-LAST:event_tresActionPerformed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        ingresarDigito("4");
    }//GEN-LAST:event_cuatroActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        ingresarDigito("5");
    }//GEN-LAST:event_cincoActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        ingresarDigito("6");
    }//GEN-LAST:event_seisActionPerformed

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
        ingresarDigito("7");
    }//GEN-LAST:event_sieteActionPerformed

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed
        ingresarDigito("8");
    }//GEN-LAST:event_ochoActionPerformed

    private void nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueveActionPerformed
        ingresarDigito("9");
    }//GEN-LAST:event_nueveActionPerformed

    private void ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroActionPerformed
        ingresarDigito("0");
    }//GEN-LAST:event_ceroActionPerformed

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        if(logIn.isVisible())
        {
            verificarNIP();
        }
        else if(deposito.isVisible())
        {
            accionarDeposito();
        }
        else if(retiro.isVisible())
        {
            accionarRetiro();
        }
    }//GEN-LAST:event_confirmarActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        if(logIn.isVisible())
        {
            if (codigoIngresado.length() > 0) 
            {
                codigoIngresado.deleteCharAt(codigoIngresado.length() - 1);
                cuadroNIP.setText(cuadroNIP.getText().substring(0, cuadroNIP.getText().length() - 1));
            }
        }
        else if(deposito.isVisible())
        {
            if (montoIngresado.length() > 0) 
            {
                montoIngresado.deleteCharAt(montoIngresado.length() -1);
                cuadroMontoDeposito.setText(cuadroMontoDeposito.getText().substring(0, cuadroMontoDeposito.getText().length() - 1));
            }
        }
        else if(retiro.isVisible())
        {
            if (montoRetirado.length() > 0) 
            {
                montoRetirado.deleteCharAt(montoRetirado.length() -1);
                cuadroMontoRetiro.setText(cuadroMontoRetiro.getText().substring(0, cuadroMontoRetiro.getText().length() - 1));
            }
        }
    }//GEN-LAST:event_borrarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        if(logIn.isVisible())
        {
            cuadroNIP.setText("");
            codigoIngresado.setLength(0);
        }
        else if(deposito.isVisible())
        {
            cuadroMontoDeposito.setText("");
            montoIngresado.setLength(0);
        }
        else if(retiro.isVisible())
        {
            cuadroMontoRetiro.setText("");
            montoRetirado.setLength(0);
        }
    }//GEN-LAST:event_limpiarActionPerformed

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        confirmarSalida();
    }//GEN-LAST:event_salirMouseClicked
        
    private void etSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etSalirMouseClicked
        confirmarSalida();
    }//GEN-LAST:event_etSalirMouseClicked
    
    private void etConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etConsultarMouseClicked
        abrirConsulta();
    }//GEN-LAST:event_etConsultarMouseClicked

    private void depositarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositarMouseClicked
        abrirDeposito();
    }//GEN-LAST:event_depositarMouseClicked

    private void etVolverConMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etVolverConMouseClicked
        volverAlMenu(consulta);
    }//GEN-LAST:event_etVolverConMouseClicked

    private void iconoVolverConsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoVolverConsMouseClicked
        volverAlMenu(consulta);
    }//GEN-LAST:event_iconoVolverConsMouseClicked
    
    private void consultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultarMouseClicked
        abrirConsulta();
    }//GEN-LAST:event_consultarMouseClicked

    private void retirarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retirarMouseClicked
        abrirRetiro();
    }//GEN-LAST:event_retirarMouseClicked

    private void iconoVolverDepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoVolverDepMouseClicked
        volverAlMenu(deposito);
    }//GEN-LAST:event_iconoVolverDepMouseClicked

    private void etVolverDepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etVolverDepMouseClicked
        volverAlMenu(deposito);
    }//GEN-LAST:event_etVolverDepMouseClicked
    
    private void etDepositarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etDepositarMouseClicked
        abrirDeposito();
    }//GEN-LAST:event_etDepositarMouseClicked

    private void depositarDineroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositarDineroMouseClicked
        accionarDeposito();
    }//GEN-LAST:event_depositarDineroMouseClicked
    
    private void depositarDineroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositarDineroMouseEntered
        
    }//GEN-LAST:event_depositarDineroMouseEntered

    private void iconoVolverRetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoVolverRetMouseClicked
        volverAlMenu(retiro);
    }//GEN-LAST:event_iconoVolverRetMouseClicked

    private void etVolverRetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etVolverRetMouseClicked
        volverAlMenu(retiro);
    }//GEN-LAST:event_etVolverRetMouseClicked

    private void retirarDineroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retirarDineroMouseClicked
        accionarRetiro();
    }//GEN-LAST:event_retirarDineroMouseClicked

    private void retirarDineroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retirarDineroMouseEntered

    }//GEN-LAST:event_retirarDineroMouseEntered

    private void cuadroMontoRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadroMontoRetiroActionPerformed
        
    }//GEN-LAST:event_cuadroMontoRetiroActionPerformed

    private void iconoConfirmarSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoConfirmarSalirMouseClicked
        salir();
    }//GEN-LAST:event_iconoConfirmarSalirMouseClicked

    private void etConfirmarSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etConfirmarSalirMouseClicked
        salir();
    }//GEN-LAST:event_etConfirmarSalirMouseClicked

    private void iconoCancelarSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconoCancelarSalirMouseClicked
        volverAlMenu(confirmarCancelar);
    }//GEN-LAST:event_iconoCancelarSalirMouseClicked

    private void etCancelarSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etCancelarSalirMouseClicked
        volverAlMenu(confirmarCancelar);
    }//GEN-LAST:event_etCancelarSalirMouseClicked

    private void etRetirarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etRetirarMouseClicked
        abrirRetiro();
    }//GEN-LAST:event_etRetirarMouseClicked
   
    private void abrirRetiro()
    {
        fechaRetirar.setText(fechaActual);
        menu.setVisible(false);
        retiro.setVisible(true);
    }
    
    private void abrirDeposito()
    {
        fechaDepositar.setText(fechaActual);
        menu.setVisible(false);
        deposito.setVisible(true);
    }
    
    private void abrirConsulta()
    {
        fechaConsulta.setText(fechaActual);
        menu.setVisible(false);
        consulta.setVisible(true);
    }
    
    private void abrirBloqueo()
    {
        fechaBloqueo.setText(fechaActual);
        logIn.setVisible(false);
        cuentaBloqueada.setVisible(true);
    }
    
    private void verificarNIP()
    {
        String nipCorrecto = "1234";
            if (codigoIngresado.toString().equals(nipCorrecto)) 
            {
                fechaMenu.setText(fechaActual);
                logIn.setVisible(false);
                menu.setVisible(true);
            } 
            else 
            {
                intentosActuales++;
                mensajeNipIncorrecto.setText("NIP Incorrecto. (" + intentosActuales + "/3)");
            }            
            
            if(intentosActuales == 3)
            {
                abrirBloqueo();
            }
            cuadroNIP.setText("");
            codigoIngresado.setLength(0);
    }
    
    private void confirmarSalida()
    {
        fechaConfirmarSalir.setText(fechaActual);
        menu.setVisible(false);
        confirmarCancelar.setVisible(true);
    }
    
    private void salir()
    {
        fechaLogIn.setText(fechaActual);
        confirmarCancelar.setVisible(false);
        logIn.setVisible(true);
        JOptionPane.showMessageDialog(this, "¡Hasta pronto!");
    }
    
    private void accionarDeposito()
    {
        String montoDepositadoString = cuadroMontoDeposito.getText();
        try
        {
            double valorDepositado = Double.parseDouble(montoDepositadoString);
            depositarDinero(valorDepositado);
            dinero.setVisible(true);
            timer.start();
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(this, "Ingrese un numero valido.");
        }
    }
    
    private void volverAlMenu(JPanel procedencia)
    {
        procedencia.setVisible(false);
        menu.setVisible(true);
    }
    
    private void accionarRetiro()
    {
        String montoRetiradoString = cuadroMontoRetiro.getText();
        try
        {
            double valorRetirado = Double.parseDouble(montoRetiradoString);
            
            if(saldoInicial < valorRetirado)
            {
                JOptionPane.showMessageDialog(this, "No dispone fondos suficientes.");
            }
            else
            {
                retirarDinero(valorRetirado);
                dinero.setVisible(true);
                timer.start();
            }
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(this, "Ingrese un numero valido.");
        }
    }
    
    private void retirarDinero(double montoDeposito)
    {
        saldoInicial -= montoDeposito;
        saldoActual = formatoMoneda.format(saldoInicial);
        dinero.setVisible(true);
        
        retiro.setVisible(false);
        menu.setVisible(true);
        dinero.setVisible(false);
        saldo.setText(saldoActual);
        cuadroMontoRetiro.setText("");
        montoRetirado.setLength(0);
    }
    
    private void depositarDinero(double montoDeposito)
    {
        saldoInicial += montoDeposito;
        saldoActual = formatoMoneda.format(saldoInicial);
        dinero.setVisible(true);
        
        deposito.setVisible(false);
        menu.setVisible(true);
        dinero.setVisible(false);
        saldo.setText(saldoActual);
        cuadroMontoDeposito.setText("");
        montoIngresado.setLength(0);
    }
    
    private void ingresarDigito(String valor)
    {
        if(logIn.isVisible())
        {
            codigoIngresado.append(valor);
            cuadroNIP.setText(cuadroNIP.getText() + valor);
        }
        else if(deposito.isVisible() && !logIn.isVisible() && !menu.isVisible() && !consulta.isVisible())
        {
            montoIngresado.append(valor);
            cuadroMontoDeposito.setText(cuadroMontoDeposito.getText() + valor);
        }
        else if(retiro.isVisible() && !deposito.isVisible() && !logIn.isVisible() && !menu.isVisible() && !consulta.isVisible())
        {
            montoRetirado.append(valor);
            cuadroMontoRetiro.setText(cuadroMontoRetiro.getText() + valor);
        }
    }
    
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new VentanaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar;
    private javax.swing.JPanel cajero;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton cero;
    private javax.swing.JButton cinco;
    private javax.swing.JButton confirmar;
    private javax.swing.JPanel confirmarCancelar;
    private javax.swing.JPanel consulta;
    private javax.swing.JLabel consultar;
    private javax.swing.JTextField cuadroMontoDeposito;
    private javax.swing.JTextField cuadroMontoRetiro;
    private javax.swing.JPasswordField cuadroNIP;
    private javax.swing.JButton cuatro;
    private javax.swing.JPanel cuentaBloqueada;
    private javax.swing.JLabel depositar;
    private javax.swing.JButton depositarDinero;
    private javax.swing.JPanel deposito;
    private javax.swing.JPanel dinero;
    private javax.swing.JButton dos;
    private javax.swing.JLabel etCancelarSalir;
    private javax.swing.JLabel etConfirmarSalir;
    private javax.swing.JLabel etConsultar;
    private javax.swing.JLabel etDepositar;
    private javax.swing.JLabel etRetirar;
    private javax.swing.JLabel etSalir;
    private javax.swing.JLabel etVolverCon;
    private javax.swing.JLabel etVolverDep;
    private javax.swing.JLabel etVolverRet;
    private javax.swing.JLabel fechaBloqueo;
    private javax.swing.JLabel fechaConfirmarSalir;
    private javax.swing.JLabel fechaConsulta;
    private javax.swing.JLabel fechaDepositar;
    private javax.swing.JLabel fechaLogIn;
    private javax.swing.JLabel fechaMenu;
    private javax.swing.JLabel fechaRetirar;
    private javax.swing.JLabel iconoCancelarSalir;
    private javax.swing.JLabel iconoConfirmarSalir;
    private javax.swing.JLabel iconoVolverCons;
    private javax.swing.JLabel iconoVolverDep;
    private javax.swing.JLabel iconoVolverRet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton limpiar;
    private javax.swing.JPanel logIn;
    private javax.swing.JLabel mensajeNipIncorrecto;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel monitor;
    private javax.swing.JButton nueve;
    private javax.swing.JButton ocho;
    private javax.swing.JPanel panelReposadera;
    private javax.swing.JLabel retirar;
    private javax.swing.JButton retirarDinero;
    private javax.swing.JPanel retiro;
    private javax.swing.JLabel saldo;
    private javax.swing.JLabel salir;
    private javax.swing.JPanel seccionCentral;
    private javax.swing.JButton seis;
    private javax.swing.JButton siete;
    private javax.swing.JPanel teclado;
    private javax.swing.JButton tres;
    private javax.swing.JButton uno;
    // End of variables declaration//GEN-END:variables
}
