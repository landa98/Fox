package unam.fi.poo.graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import VentanaCaptura;

@SuppressWarnings("serial")

public class VentanaPrincipal extends JFrame implements ActionListener{
	// Paneles auxiliares
	JPanel panelPrincipal;
	JPanel panelCaptura;
	JPanel panelSuperior;
	JPanel panelCentro;
	JPanel panelInferior;
	JPanel panelInferiorSuperior;
	JPanel panelInferiorInferior;
	// Creación del layout
	GridBagLayout layout = new GridBagLayout();
	GridBagConstraints constraints = new GridBagConstraints();

	public VentanaPrincipal() {
		super();
		this.crearVentanaPrincipal();
		this.crearPanelPrincipal();
		this.crearPanelCaptura();
		this.setContentPane(this.panelPrincipal);
		this.setVisible(true);
	}

	public void crearVentanaPrincipal() {
		this.setTitle("SCD");
		this.setSize(400, 350);
		this.setResizable(false);
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public void crearPanelPrincipal(){

		panelPrincipal = new JPanel(new FlowLayout());
		panelPrincipal.setLayout(layout);

		JRadioButton alta = new JRadioButton("Alta");
		alta.setSelected(true);
		JRadioButton baja = new JRadioButton("Baja");
		JRadioButton cambio = new JRadioButton("Cambio");
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(alta);
		grupo.add(baja);
		grupo.add(cambio);
		constraints.weighty = 0.5;
		constraints.anchor = GridBagConstraints.LINE_START;
		constraints.gridx = 0;
		constraints.gridy = 0;
		alta.addActionListener(this);
		baja.addActionListener(this);
		cambio.addActionListener(this);

		panelPrincipal.add(alta, constraints);
		constraints.gridy = 1;
		panelPrincipal.add(baja, constraints);
		constraints.gridy = 2;
		panelPrincipal.add(cambio, constraints);

		JButton aceptar = new JButton("Aceptar");
		constraints.gridx = 3;
		constraints.gridy = 3;
		constraints.weighty = 1;
		constraints.anchor = GridBagConstraints.LINE_END;
		aceptar.addActionListener(this);

		this.panelPrincipal.add(aceptar, constraints);
	}

	public void crearPanelCaptura(){
		System.out.println("Todo bien hasta aquí");
		panelCaptura = new JPanel(new FlowLayout());
		panelCaptura.setLayout(new BorderLayout());

		panelSuperior = new JPanel(new FlowLayout());
		panelSuperior.setLayout(layout);

		JLabel etiquetaSuperior = new JLabel("Sistema de Captura de Datos");
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.weighty = 0;
		constraints.anchor = GridBagConstraints.PAGE_START;
		System.out.println("Todo bien hasta aquí x2");

		panelSuperior.add(etiquetaSuperior, constraints);
		panelCaptura.add(panelSuperior, BorderLayout.NORTH);

		panelCentro = new JPanel(new FlowLayout());
		panelCentro.setLayout(layout);
		JLabel etiquetaNombre = new JLabel("Nombre:", SwingConstants.CENTER);
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.anchor = GridBagConstraints.LINE_END;

		panelCentro.add(etiquetaNombre, constraints);

		JTextField cajaNombre = new JTextField(8);
		constraints.gridx = 1;
		constraints.gridy = 0;
		constraints.anchor = GridBagConstraints.CENTER;

		panelCentro.add(cajaNombre, constraints);

		JLabel etiquetaApellidoPaterno = new JLabel("Apellido Paterno:");
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.anchor = GridBagConstraints.LINE_END;
		panelCentro.add(etiquetaApellidoPaterno, constraints);
		System.out.println("Todo bien hasta aquí x3");

		JTextField cajaApellidoPaterno = new JTextField(8);
		constraints.gridx = 1;
		constraints.gridy = 1;
		constraints.anchor = GridBagConstraints.CENTER;

		panelCentro.add(cajaApellidoPaterno, constraints);

		JLabel etiquetaApellidoMaterno = new JLabel("Apellido Materno:");
		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.anchor = GridBagConstraints.LINE_END;

		panelCentro.add(etiquetaApellidoMaterno, constraints);

		JTextField cajaApellidoMaterno = new JTextField(8);
		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.anchor = GridBagConstraints.CENTER;

		panelCentro.add(cajaApellidoMaterno, constraints);

		JLabel etiquetaEdad = new JLabel("Edad:");
		constraints.gridx = 0;
		constraints.gridy = 3;
		constraints.anchor = GridBagConstraints.LINE_END;

		panelCentro.add(etiquetaEdad, constraints);

		JTextField cajaEdad = new JTextField(8);
		constraints.gridx = 1;
		constraints.gridy = 3;
		constraints.anchor = GridBagConstraints.CENTER;
		panelCentro.add(cajaEdad, constraints);

		panelCaptura.add(panelCentro, BorderLayout.CENTER);
		System.out.println("Todo bien hasta aquí x4");

		panelInferior = new JPanel(new FlowLayout());
		panelInferior.setLayout(layout);

		panelInferiorSuperior = new JPanel(new FlowLayout());
		panelInferiorSuperior.setBackground(Color.gray);
		panelInferiorSuperior.setLayout(layout);
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.weightx = 2;
		constraints.weighty = 0;

		JButton botonCancelar = new JButton("Cancelar");
		constraints.gridx = 0;
		constraints.gridy = 0;

		panelInferiorSuperior.add(botonCancelar, constraints);

		JButton botonBorrar = new JButton("Borrar");
		constraints.gridx = 1;
		constraints.gridy = 0;

		panelInferiorSuperior.add(botonBorrar, constraints);

		JButton botonAceptar = new JButton("Aceptar");
		constraints.gridx = 2;
		constraints.gridy = 0;

		panelInferiorSuperior.add(botonAceptar, constraints);


		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.weighty = 0;
		constraints.gridwidth = 3;
		constraints.ipady = -2;
		panelInferior.add(panelInferiorSuperior, constraints);

		panelInferiorInferior = new JPanel(new FlowLayout());
		panelInferiorInferior.setLayout(layout);
		System.out.println("Todo bien hasta aquí x5");

		JLabel etiquetaEstadoActual = new JLabel("¡Bienvenido al Sistema!", SwingConstants.CENTER);

		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = 3;
		constraints.gridheight = 3;
		constraints.weighty = 1;
		constraints.weightx = 1;
		constraints.anchor = GridBagConstraints.PAGE_END;
		constraints.fill = GridBagConstraints.BOTH;
		panelInferiorInferior.add(etiquetaEstadoActual, constraints);
		constraints.gridx = 0;
		constraints.gridy = 1;
		constraints.ipady = 40;
		panelInferior.add(panelInferiorInferior, constraints);
		System.out.println("Todo bien hasta aquí x6");

		// Agregar listeners a botones
		botonCancelar.addActionListener(this);
		botonBorrar.addActionListener(this);
		botonAceptar.addActionListener(this);

		System.out.println("Todo bien hasta aquí x9");
		this.panelCaptura.add(panelInferior, BorderLayout.SOUTH);
		System.out.println("Todo bien hasta aquí x7");

	}

	public void actionPerformed(ActionEvent e){
		System.out.println("Evento: "+e.getActionCommand());
		if(e.getActionCommand().equalsIgnoreCase("Aceptar")) {
			this.remove(panelPrincipal);
			this.validate();
			this.repaint();
			System.out.println("Se removió el panel principal");
			this.setContentPane(panelCaptura);
			this.validate();
			this.repaint();
			System.out.println("Se agregaron componentes de captura");
		}
		if(e.getActionCommand().equalsIgnoreCase("Cancelar")) {
			this.remove(panelCaptura);
			this.validate();
			this.repaint();
			this.setContentPane(panelPrincipal);
			this.validate();
			this.repaint();
		}
	}
}
