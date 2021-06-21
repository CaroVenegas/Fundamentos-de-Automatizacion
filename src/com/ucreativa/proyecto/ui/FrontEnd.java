package com.ucreativa.proyecto.ui;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class FrontEnd extends JFrame {

    public FrontEnd(String titulo) {
        super(titulo);
    }

    public void build() {
        this.construccionPantalla();
        this.crearComponentes();
        super.setVisible(true);
    }

    private void construccionPantalla() {
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(400, 200);
        super.setLayout(new GridLayout(5, 2));
    }

    private void agregarComponente(Component componente) {
        super.getContentPane().add(componente);
    }

    private void crearComponentes() {

        JLabel lblNombre = new JLabel("Nombre");
        JLabel lblMarca = new JLabel("Marca");
        JLabel lblDate = new JLabel("Date");


        JTextField txtNombre = new JTextField();
        JTextField txtMarca = new JTextField();
        JTextField txtDate = new JTextField();

            }
        });

        JButton salvar = new JButton("Salvar");
        salvar.addActionListener(new AbstractAction() {
            @Override

            public void actionPerformed(ActionEvent e) {
                ServicioiInventario service = new ServicioInventario(new FileRepository());
                try {
                    service.save(txtNombre.getText(),
                             txtMarca.getText());
                             txtDate.getText());

                    txtNombre.setText("");
                    txtMarca.setText("");
                    txtDate.setText("");

                    String reporte = String.join("\n", service.get());
                    JOptionPane.showMessageDialog(((JButton) e.getSource()).getParent(), reporte);
                } catch (ErrorEnEdadException error) {
                    JOptionPane.showMessageDialog(((JButton) e.getSource()).getParent(),
                            error.getMessage());
                }
            }
        });
        this.agregarComponente(lblNombre);
        this.agregarComponente(txtNombre);
        this.agregarComponente(lblMarca);
        this.agregarComponente(txtMarca);
        this.agregarComponente(lblDate);
        this.agregarComponente(txtDate);

    }


}