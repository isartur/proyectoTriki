//vercion git
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

public class Ejemplo2 extends JFrame implements ActionListener {

    static int jugada = 1;
    static int A = 0, B = 0, C = 0, D = 0, E = 0, F = 0, G = 0, H = 0, a = 0, b = 0, c = 0, d = 0, i = 0, f = 0, g = 0, h = 0;
    private JButton boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9, boton10;

    public Ejemplo2() {

        //Layout absoluto
        setLayout(null);

        //Tamaño de la ventana
        setBounds(1000, 250, 350, 450);

        //Título
        setTitle("Ejemplo 2: Botones");

        //No redimensionable
        setResizable(false);

        //Cerrar proceso al cerrar la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Botones
        boton1 = new JButton("");
        boton1.setBounds(30, 50, 90, 90);
        add(boton1);
        boton1.setBackground(Color.white);
        boton1.addActionListener(this);
        boton2 = new JButton("");
        boton2.setBounds(121, 50, 90, 90);
        add(boton2);
        boton2.setBackground(Color.white);
        boton2.addActionListener(this);
        boton3 = new JButton("");
        boton3.setBounds(212, 50, 90, 90);
        add(boton3);
        boton3.setBackground(Color.white);
        boton3.addActionListener(this);
        boton4 = new JButton("");
        boton4.setBounds(30, 141, 90, 90);
        add(boton4);
        boton4.setBackground(Color.white);
        boton4.addActionListener(this);
        boton5 = new JButton("");
        boton5.setBounds(121, 141, 90, 90);
        add(boton5);
        boton5.setBackground(Color.white);
        boton5.addActionListener(this);
        boton6 = new JButton("");
        boton6.setBounds(212, 141, 90, 90);
        add(boton6);
        boton6.setBackground(Color.white);
        boton6.addActionListener(this);
        boton7 = new JButton("");
        boton7.setBounds(30, 232, 90, 90);
        add(boton7);
        boton7.setBackground(Color.white);
        boton7.addActionListener(this);
        boton8 = new JButton("");
        boton8.setBounds(121, 232, 90, 90);
        add(boton8);
        boton8.setBackground(Color.white);
        boton8.addActionListener(this);
        boton9 = new JButton("");
        boton9.setBounds(212, 232, 90, 90);
        add(boton9);
        boton9.setBackground(Color.white);
        boton9.addActionListener(this);
        boton10 = new JButton(" LIMPIAR TABLERO");
        boton10.setBounds(30, 330, 272, 35);
        add(boton10);
        boton10.setBackground(Color.white);
        boton10.addActionListener(this);

        //Muestro JFrame (lo último para que lo pinte todo correctamanete)
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String jugador1 = "X";
        String jugador2 = "O";

        if (jugada < 9) {

            if (jugada % 2 != 0) {

                if (e.getSource() == boton1) {
                    setTitle("jugador 1");
                    boton1.setText(jugador1);
                    boton1.setBackground(Color.green);
                    boton1.setEnabled(false);
                    A++;
                    D++;
                    G++;
                } else if (e.getSource() == boton2) {
                    setTitle("jugador 1");
                    boton2.setText(jugador1);
                    boton2.setBackground(Color.green);
                    boton2.setEnabled(false);
                    A++;
                    E++;
                } else if (e.getSource() == boton3) {
                    setTitle("jugador 1");
                    boton3.setText(jugador1);
                    boton3.setBackground(Color.green);
                    boton3.setEnabled(false);
                    A++;
                    F++;
                    H++;
                } else if (e.getSource() == boton4) {
                    setTitle("jugador 1");
                    boton4.setText(jugador1);
                    boton4.setBackground(Color.green);
                    boton4.setEnabled(false);
                    B++;
                    D++;
                } else if (e.getSource() == boton5) {
                    setTitle("jugador 1");
                    boton5.setText(jugador1);
                    boton5.setBackground(Color.green);
                    boton5.setEnabled(false);
                    B++;
                    E++;
                    G++;
                    H++;
                } else if (e.getSource() == boton6) {
                    setTitle("jugador 1");
                    boton6.setText(jugador1);
                    boton6.setBackground(Color.green);
                    boton6.setEnabled(false);
                    B++;
                    F++;
                } else if (e.getSource() == boton7) {
                    setTitle("jugador 1");
                    boton7.setText(jugador1);
                    boton7.setBackground(Color.green);
                    boton7.setEnabled(false);
                    C++;
                    D++;
                    H++;
                } else if (e.getSource() == boton8) {
                    setTitle("jugador 1");
                    boton8.setText(jugador1);
                    boton8.setBackground(Color.green);
                    boton8.setEnabled(false);
                    C++;
                    E++;
                } else if (e.getSource() == boton9) {
                    setTitle("jugador 1");
                    boton9.setText(jugador1);
                    boton9.setBackground(Color.green);
                    boton9.setEnabled(false);
                    C++;
                    F++;
                    G++;
                }
                if (A == 3) {
                    boton1.setBackground(Color.blue);
                    boton2.setBackground(Color.blue);
                    boton3.setBackground(Color.blue);
                    boton4.setBackground(Color.white);boton4.setText("");boton4.setEnabled(false);
                    boton5.setBackground(Color.white);boton5.setText("");boton5.setEnabled(false);
                    boton6.setBackground(Color.white);boton6.setText("");boton6.setEnabled(false);
                    boton7.setBackground(Color.white);boton7.setText("");boton7.setEnabled(false);
                    boton8.setBackground(Color.white);boton8.setText("");boton8.setEnabled(false);
                    boton9.setBackground(Color.white);boton9.setText("");boton9.setEnabled(false);
                    A = 0; B = 0; C = 0; D = 0; E = 0; F = 0; G = 0; H = 0;
                    jugada =7;
                } else if (B == 3) {
                    boton4.setBackground(Color.blue);
                    boton5.setBackground(Color.blue);
                    boton6.setBackground(Color.blue);
                    boton1.setBackground(Color.white);boton1.setText("");boton1.setEnabled(false);
                    boton2.setBackground(Color.white);boton2.setText("");boton2.setEnabled(false);
                    boton3.setBackground(Color.white);boton3.setText("");boton3.setEnabled(false);
                    boton7.setBackground(Color.white);boton7.setText("");boton7.setEnabled(false);
                    boton8.setBackground(Color.white);boton8.setText("");boton8.setEnabled(false);
                    boton9.setBackground(Color.white);boton9.setText("");boton9.setEnabled(false);
                    A = 0; B = 0; C = 0; D = 0; E = 0; F = 0; G = 0; H = 0;
                }else if (C == 3) {
                    boton7.setBackground(Color.blue);
                    boton8.setBackground(Color.blue);
                    boton9.setBackground(Color.blue);
                    boton1.setBackground(Color.white);boton1.setText("");boton1.setEnabled(false);
                    boton2.setBackground(Color.white);boton2.setText("");boton2.setEnabled(false);
                    boton3.setBackground(Color.white);boton3.setText("");boton3.setEnabled(false);
                    boton4.setBackground(Color.white);boton4.setText("");boton4.setEnabled(false);
                    boton5.setBackground(Color.white);boton5.setText("");boton5.setEnabled(false);
                    boton6.setBackground(Color.white);boton6.setText("");boton6.setEnabled(false);
                    A = 0; B = 0; C = 0; D = 0; E = 0; F = 0; G = 0; H = 0;
                }else if (D == 3) {
                    boton1.setBackground(Color.blue);
                    boton4.setBackground(Color.blue);
                    boton7.setBackground(Color.blue);
                    boton2.setBackground(Color.white);boton2.setText("");boton2.setEnabled(false);
                    boton3.setBackground(Color.white);boton3.setText("");boton3.setEnabled(false);
                    boton5.setBackground(Color.white);boton5.setText("");boton5.setEnabled(false);
                    boton6.setBackground(Color.white);boton6.setText("");boton6.setEnabled(false);
                    boton8.setBackground(Color.white);boton8.setText("");boton8.setEnabled(false);
                    boton9.setBackground(Color.white);boton9.setText("");boton9.setEnabled(false);
                    A = 0; B = 0; C = 0; D = 0; E = 0; F = 0; G = 0; H = 0;
                }else if (E == 3) {
                    boton2.setBackground(Color.blue);
                    boton5.setBackground(Color.blue);
                    boton8.setBackground(Color.blue);
                    boton1.setBackground(Color.white);boton1.setText("");boton1.setEnabled(false);
                    boton3.setBackground(Color.white);boton3.setText("");boton3.setEnabled(false);
                    boton4.setBackground(Color.white);boton4.setText("");boton4.setEnabled(false);
                    boton6.setBackground(Color.white);boton6.setText("");boton6.setEnabled(false);
                    boton7.setBackground(Color.white);boton7.setText("");boton7.setEnabled(false);
                    boton9.setBackground(Color.white);boton9.setText("");boton9.setEnabled(false);
                    A = 0; B = 0; C = 0; D = 0; E = 0; F = 0; G = 0; H = 0;
                }else if (F == 3) {
                    boton3.setBackground(Color.blue);
                    boton6.setBackground(Color.blue);
                    boton9.setBackground(Color.blue);
                    boton1.setBackground(Color.white);boton1.setText("");boton1.setEnabled(false);
                    boton2.setBackground(Color.white);boton2.setText("");boton2.setEnabled(false);
                    boton4.setBackground(Color.white);boton4.setText("");boton4.setEnabled(false);
                    boton5.setBackground(Color.white);boton5.setText("");boton5.setEnabled(false);
                    boton7.setBackground(Color.white);boton7.setText("");boton7.setEnabled(false);
                    boton8.setBackground(Color.white);boton8.setText("");boton8.setEnabled(false);
                    A = 0; B = 0; C = 0; D = 0; E = 0; F = 0; G = 0; H = 0;
                }else if (G == 3) {
                    boton1.setBackground(Color.blue);
                    boton5.setBackground(Color.blue);
                    boton9.setBackground(Color.blue);
                    boton2.setBackground(Color.white);boton2.setText("");boton2.setEnabled(false);
                    boton3.setBackground(Color.white);boton3.setText("");boton3.setEnabled(false);
                    boton4.setBackground(Color.white);boton4.setText("");boton4.setEnabled(false);
                    boton6.setBackground(Color.white);boton6.setText("");boton6.setEnabled(false);
                    boton7.setBackground(Color.white);boton7.setText("");boton7.setEnabled(false);
                    boton8.setBackground(Color.white);boton8.setText("");boton8.setEnabled(false);
                    A = 0; B = 0; C = 0; D = 0; E = 0; F = 0; G = 0; H = 0;
                }else if (H == 3) {
                    boton3.setBackground(Color.blue);
                    boton5.setBackground(Color.blue);
                    boton7.setBackground(Color.blue);
                    boton1.setBackground(Color.white);boton1.setText("");boton1.setEnabled(false);
                    boton2.setBackground(Color.white);boton2.setText("");boton2.setEnabled(false);
                    boton4.setBackground(Color.white);boton4.setText("");boton4.setEnabled(false);
                    boton6.setBackground(Color.white);boton6.setText("");boton6.setEnabled(false);
                    boton8.setBackground(Color.white);boton8.setText("");boton8.setEnabled(false);
                    boton9.setBackground(Color.white);boton9.setText("");boton9.setEnabled(false);
                    A = 0; B = 0; C = 0; D = 0; E = 0; F = 0; G = 0; H = 0;
                
            }
            }
            if (jugada % 2 == 0) {

                if (e.getSource() == boton1) {
                    setTitle("jugador 2");
                    boton1.setText(jugador2);
                    boton1.setBackground(Color.yellow);
                    boton1.setEnabled(false);
                    a++;
                    d++;
                    g++;
                } else if (e.getSource() == boton2) {
                    setTitle("jugador 2");
                    boton2.setText(jugador2);
                    boton2.setBackground(Color.yellow);
                    boton2.setEnabled(false);
                    a++;
                    i++;
                } else if (e.getSource() == boton3) {
                    setTitle("jugador 2");
                    boton3.setText(jugador2);
                    boton3.setBackground(Color.yellow);
                    boton3.setEnabled(false);
                    a++;
                    f++;
                    h++;
                } else if (e.getSource() == boton4) {
                    setTitle("jugador 2");
                    boton4.setText(jugador2);
                    boton4.setBackground(Color.yellow);
                    boton4.setEnabled(false);
                    b++;
                    d++;
                } else if (e.getSource() == boton5) {
                    setTitle("jugador 2");
                    boton5.setText(jugador2);
                    boton5.setBackground(Color.yellow);
                    boton5.setEnabled(false);
                    b++;
                    i++;
                    g++;
                    h++;
                } else if (e.getSource() == boton6) {
                    setTitle("jugador 2");
                    boton6.setText(jugador2);
                    boton6.setBackground(Color.yellow);
                    boton6.setEnabled(false);
                    b++;
                    f++;
                } else if (e.getSource() == boton7) {
                    setTitle("jugador 2");
                    boton7.setText(jugador2);
                    boton7.setBackground(Color.yellow);
                    boton7.setEnabled(false);
                    c++;
                    d++;
                    h++;
                } else if (e.getSource() == boton8) {
                    setTitle("jugador 2");
                    boton8.setText(jugador2);
                    boton8.setBackground(Color.yellow);
                    boton8.setEnabled(false);
                    c++;
                    i++;
                } else if (e.getSource() == boton9) {
                    setTitle("jugador 2");
                    boton9.setText(jugador2);
                    boton9.setBackground(Color.yellow);
                    boton9.setEnabled(false);
                    c++;
                    f++;
                    g++;
                }

                if (a == 3) {
                    boton1.setBackground(Color.blue);
                    boton2.setBackground(Color.blue);
                    boton3.setBackground(Color.blue);
                    boton4.setBackground(Color.white);boton4.setText("");boton4.setEnabled(false);
                    boton5.setBackground(Color.white);boton5.setText("");boton1.setEnabled(false);
                    boton6.setBackground(Color.white);boton6.setText("");boton1.setEnabled(false);
                    boton7.setBackground(Color.white);boton7.setText("");boton1.setEnabled(false);
                    boton8.setBackground(Color.white);boton8.setText("");boton1.setEnabled(false);
                    boton9.setBackground(Color.white);boton9.setText("");boton1.setEnabled(false);
                    a = 0; b = 0; c = 0; d = 0; i = 0; f = 0; g = 0; h = 0;
                } else if (b == 3) {
                    boton4.setBackground(Color.blue);
                    boton5.setBackground(Color.blue);
                    boton6.setBackground(Color.blue);
                    boton1.setBackground(Color.white);boton1.setText("");boton1.setEnabled(false);
                    boton2.setBackground(Color.white);boton2.setText("");boton2.setEnabled(false);
                    boton3.setBackground(Color.white);boton3.setText("");boton3.setEnabled(false);
                    boton7.setBackground(Color.white);boton7.setText("");boton7.setEnabled(false);
                    boton8.setBackground(Color.white);boton8.setText("");boton8.setEnabled(false);
                    boton9.setBackground(Color.white);boton9.setText("");boton9.setEnabled(false);
                    a = 0; b = 0; c = 0; d = 0; i = 0; f = 0; g = 0; h = 0;
                }else if (c == 3) {
                    boton7.setBackground(Color.blue);
                    boton8.setBackground(Color.blue);
                    boton9.setBackground(Color.blue);
                    boton1.setBackground(Color.white);boton1.setText("");boton1.setEnabled(false);
                    boton2.setBackground(Color.white);boton2.setText("");boton2.setEnabled(false);
                    boton3.setBackground(Color.white);boton3.setText("");boton3.setEnabled(false);
                    boton4.setBackground(Color.white);boton4.setText("");boton4.setEnabled(false);
                    boton5.setBackground(Color.white);boton5.setText("");boton5.setEnabled(false);
                    boton6.setBackground(Color.white);boton6.setText("");boton6.setEnabled(false);
                    a = 0; b = 0; c = 0; d = 0; i = 0; f = 0; g = 0; h = 0;
                }else if (d == 3) {
                    boton1.setBackground(Color.blue);
                    boton4.setBackground(Color.blue);
                    boton7.setBackground(Color.blue);
                    boton2.setBackground(Color.white);boton2.setText("");boton2.setEnabled(false);
                    boton3.setBackground(Color.white);boton3.setText("");boton3.setEnabled(false);
                    boton5.setBackground(Color.white);boton5.setText("");boton5.setEnabled(false);
                    boton6.setBackground(Color.white);boton6.setText("");boton6.setEnabled(false);
                    boton8.setBackground(Color.white);boton8.setText("");boton8.setEnabled(false);
                    boton9.setBackground(Color.white);boton9.setText("");boton9.setEnabled(false);
                    a = 0; b = 0; c = 0; d = 0; i = 0; f = 0; g = 0; h = 0;
                }else if (i == 3) {
                    boton2.setBackground(Color.blue);
                    boton5.setBackground(Color.blue);
                    boton8.setBackground(Color.blue);
                    boton1.setBackground(Color.white);boton1.setText("");boton1.setEnabled(false);
                    boton3.setBackground(Color.white);boton3.setText("");boton3.setEnabled(false);
                    boton4.setBackground(Color.white);boton4.setText("");boton4.setEnabled(false);
                    boton6.setBackground(Color.white);boton6.setText("");boton6.setEnabled(false);
                    boton7.setBackground(Color.white);boton7.setText("");boton7.setEnabled(false);
                    boton9.setBackground(Color.white);boton9.setText("");boton9.setEnabled(false);
                    a = 0; b = 0; c = 0; d = 0; i = 0; f = 0; g = 0; h = 0;
                }else if (f == 3) {
                    boton3.setBackground(Color.blue);
                    boton6.setBackground(Color.blue);
                    boton9.setBackground(Color.blue);
                    boton1.setBackground(Color.white);boton1.setText("");boton1.setEnabled(false);
                    boton2.setBackground(Color.white);boton2.setText("");boton2.setEnabled(false);
                    boton4.setBackground(Color.white);boton4.setText("");boton4.setEnabled(false);
                    boton5.setBackground(Color.white);boton5.setText("");boton5.setEnabled(false);
                    boton7.setBackground(Color.white);boton7.setText("");boton7.setEnabled(false);
                    boton8.setBackground(Color.white);boton8.setText("");boton8.setEnabled(false);
                    a = 0; b = 0; c = 0; d = 0; i = 0; f = 0; g = 0; h = 0;
                }else if (g == 3) {
                    boton1.setBackground(Color.blue);
                    boton5.setBackground(Color.blue);
                    boton9.setBackground(Color.blue);
                    boton2.setBackground(Color.white);boton2.setText("");boton2.setEnabled(false);
                    boton3.setBackground(Color.white);boton3.setText("");boton3.setEnabled(false);
                    boton4.setBackground(Color.white);boton4.setText("");boton4.setEnabled(false);
                    boton6.setBackground(Color.white);boton6.setText("");boton6.setEnabled(false);
                    boton7.setBackground(Color.white);boton7.setText("");boton7.setEnabled(false);
                    boton8.setBackground(Color.white);boton8.setText("");boton8.setEnabled(false);
                    a = 0; b = 0; c = 0; d = 0; i = 0; f = 0; g = 0; h = 0;
                }else if (h == 3) {
                    boton3.setBackground(Color.blue);
                    boton5.setBackground(Color.blue);
                    boton7.setBackground(Color.blue);
                    boton1.setBackground(Color.white);boton1.setText("");boton1.setEnabled(false);
                    boton2.setBackground(Color.white);boton2.setText("");boton2.setEnabled(false);
                    boton4.setBackground(Color.white);boton4.setText("");boton4.setEnabled(false);
                    boton6.setBackground(Color.white);boton6.setText("");boton6.setEnabled(false);
                    boton8.setBackground(Color.white);boton8.setText("");boton8.setEnabled(false);
                    boton9.setBackground(Color.white);boton9.setText("");boton9.setEnabled(false);
                    a = 0; b = 0; c = 0; d = 0; i = 0; f = 0; g = 0; h = 0;
                
            }
        }
    }
    if (jugada== 9 || e.getSource() == boton10) {
        jugada = 0;
        boton1.setEnabled(true);
        boton1.setText("");
        boton1.setBackground(Color.white);
        boton2.setEnabled(true);
        boton2.setText("");
        boton2.setBackground(Color.white);
        boton3.setEnabled(true);
        boton3.setText("");
        boton3.setBackground(Color.white);
        boton4.setEnabled(true);
        boton4.setText("");
        boton4.setBackground(Color.white);
        boton5.setEnabled(true);
        boton5.setText("");
        boton5.setBackground(Color.white);
        boton6.setEnabled(true);
        boton6.setText("");
        boton6.setBackground(Color.white);
        boton7.setEnabled(true);
        boton7.setText("");
        boton7.setBackground(Color.white);
        boton8.setEnabled(true);
        boton8.setText("");
        boton8.setBackground(Color.white);
        boton9.setEnabled(true);
        boton9.setText("");
        boton9.setBackground(Color.white);
        A = 0; B = 0; C = 0; D = 0; E = 0; F = 0; G = 0; H = 0; a = 0; b = 0; c = 0; d = 0; i = 0; f = 0; g = 0; h = 0;
    }
    jugada++;

    }

    public static void main(String[] args) {

        new Ejemplo2();

    }

   

}
