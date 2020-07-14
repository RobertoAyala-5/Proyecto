import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.applet.*;
import java.util.Random;
import java.applet.AudioClip;

class MiVentana extends JFrame implements KeyListener, ActionListener{

	BufferedImage imagen;
	BufferedImage subImagen;
	Monito monito;
	Monito1 monito1;
	Thread enemigo1;
	Thread enemigo2;
	Thread enemigo3;
	Thread enemigo4;
	Thread enemigo5;
	Thread enemigo6;
	Thread enemigo7;
	Thread enemigo8;
	Thread enemigo9;
	Thread enemigo10;

	JTextField nombre;

	Thread colorear;

	int indiceX;
	int indice = 0;
	int t;

	JLabel pared;
	JLabel pared2;
	JPanel panel;
	JLabel fuego;
	JLabel fuego1;
	JLabel fuego2;
	JLabel fuego3;
	JLabel fuego4;
	JLabel fuego5;
	JLabel fuego6;
	JLabel fuego7;
	JLabel fuego8;
	JLabel fuego9;

	JLabel logo1;
	JLabel logo2;

	JLabel portal;
	JLabel gameover;

	JLabel puntos;
	JLabel palabraPuntos;

	JLabel troll;

	JLabel alien1;
	JLabel alien2;
	JLabel alien3;
	JLabel alien4;

	JButton restart;
	JButton start;
	JButton guardar;

	Rectangle m;
	Rectangle m1;
	Rectangle m2;
	Rectangle m3;
	Rectangle m4;
	Rectangle m5;
	Rectangle m6;
	Rectangle m7;
	Rectangle m8;
	Rectangle m9;

	Rectangle hb;
	Rectangle win;
	int tiempo = 40;

	boolean hilo1;
	boolean hilo2;
	boolean hilo3;
	boolean hilo4;
	boolean hilo5;
	boolean hilo6;
	boolean hilo7;
	boolean hilo8;
	boolean hilo9;
	boolean hilo10;

	boolean k1;
	boolean k2;
	boolean k3;
	boolean k4;
	boolean k5;
	boolean k6;
	boolean k7;
	boolean k8;
	boolean k9;
	boolean k10;

	int b1;
	int b2;
	int b3;
	int b4;
	int b5;
	int b6;
	int b7;
	int b8;
	int b9;
	int b10;

	int speed;

	int puntuacion; 

	AudioClip dog;
	AudioClip fondo;
	AudioClip tripa;
	AudioClip windown;
	AudioClip runnalien;

	public MiVentana()
	{
		panel = new JPanel();
		panel.setLayout(null);

		try{
			imagen = ImageIO.read(new File("./imagenes/48389841_204443183824787_1483351678198480896_n.png"));
			//imagen1 = ImageIO.read(new File("./imagenes/png-sprite-generator-7.png"));

		}catch(Exception e)
		{
			System.out.println("Error al cargar la imagen");
		}

		logo1 = new JLabel();
		logo1.setIcon(new ImageIcon("image.png"));
		logo1.setBounds(400,0,512,468);

		logo2 = new JLabel();
		logo2.setIcon(new ImageIcon("cooltext-357233281176604.png"));
		logo2.setBounds(0,0,450,99);

		troll = new JLabel();
		troll.setIcon(new ImageIcon("bluescreen-t.jpg"));
		troll.setBounds(0,0,1200,630);

		pared = new JLabel();
		pared.setIcon(new ImageIcon("maxresdefault.jpg"));
		pared.setBounds(0,0,1500,25);

		pared2 = new JLabel();
		pared2.setIcon(new ImageIcon("maxresdefault.jpg"));
		pared2.setBounds(0,335,1500,25);

		fuego = new JLabel();
		fuego.setIcon(new ImageIcon("56079bda3325d326dc4307a9cc8aed63-silueta-de-dibujos-animados-de-fuego.png"));
		fuego.setBounds(0,335,25,25);

		fuego1 = new JLabel();
		fuego1.setIcon(new ImageIcon("56079bda3325d326dc4307a9cc8aed63-silueta-de-dibujos-animados-de-fuego.png"));
		fuego1.setBounds(0,335,25,25);

		fuego2 = new JLabel();
		fuego2.setIcon(new ImageIcon("56079bda3325d326dc4307a9cc8aed63-silueta-de-dibujos-animados-de-fuego.png"));
		fuego2.setBounds(0,335,25,25);

		fuego3 = new JLabel();
		fuego3.setIcon(new ImageIcon("56079bda3325d326dc4307a9cc8aed63-silueta-de-dibujos-animados-de-fuego.png"));
		fuego3.setBounds(0,335,25,25);

		fuego4 = new JLabel();
		fuego4.setIcon(new ImageIcon("56079bda3325d326dc4307a9cc8aed63-silueta-de-dibujos-animados-de-fuego.png"));
		fuego4.setBounds(0,335,25,25);

		fuego5 = new JLabel();
		fuego5.setIcon(new ImageIcon("56079bda3325d326dc4307a9cc8aed63-silueta-de-dibujos-animados-de-fuego.png"));
		fuego5.setBounds(0,335,25,25);

		fuego6 = new JLabel();
		fuego6.setIcon(new ImageIcon("56079bda3325d326dc4307a9cc8aed63-silueta-de-dibujos-animados-de-fuego.png"));
		fuego6.setBounds(0,335,25,25);

		fuego7 = new JLabel();
		fuego7.setIcon(new ImageIcon("56079bda3325d326dc4307a9cc8aed63-silueta-de-dibujos-animados-de-fuego.png"));
		fuego7.setBounds(0,335,25,25);

		fuego8 = new JLabel();
		fuego8.setIcon(new ImageIcon("56079bda3325d326dc4307a9cc8aed63-silueta-de-dibujos-animados-de-fuego.png"));
		fuego8.setBounds(0,335,25,25);

		fuego9 = new JLabel();
		fuego9.setIcon(new ImageIcon("56079bda3325d326dc4307a9cc8aed63-silueta-de-dibujos-animados-de-fuego.png"));
		fuego9.setBounds(0,335,25,25);

		portal = new JLabel();
		portal.setIcon(new ImageIcon("giphy (4).gif"));
		portal.setBounds(1200,100,150,150);

		gameover = new JLabel();
		gameover.setIcon(new ImageIcon("Copia-de-GAMEOVER-3.png"));
		gameover.setBounds(0,10,938,225);

		alien1 = new JLabel();
		alien1.setBounds(900,-20,500,500);
		alien1.setIcon(new javax.swing.ImageIcon("dead-grey-alien-lOoVZkA-600-removebg-preview.png"));

		alien2 = new JLabel();
		alien2.setBounds(950,0,400,480);
		alien2.setIcon(new javax.swing.ImageIcon("giphy (1).gif"));

		alien3 = new JLabel();
		alien3.setBounds(1000,-100,272,480);
		alien3.setIcon(new javax.swing.ImageIcon("giphy.gif"));

		alien4 = new JLabel();
		alien4.setBounds(500,-50,480,464);
		alien4.setIcon(new javax.swing.ImageIcon("giphy (3).gif"));

		Font fuenteBtn = new Font("Bahnschrift", 0, 100);
		restart = new JButton("Restart");
		restart.setBounds(0,225,938,100);
		restart.setBackground(Color.WHITE);
		restart.setFont(fuenteBtn);
		restart.setForeground(Color.BLACK);

		start = new JButton("Start");
		start.setBounds(300,130,300,100);
		start.setBackground(Color.GRAY);
		start.setFont(fuenteBtn);
		start.setForeground(Color.BLACK);

		guardar = new JButton("Guardar");
		guardar.setBounds(700,51,150,30);
		guardar.setFont(new Font("Bahnschrift", 0, 20));
		guardar.setBackground(Color.WHITE);

		puntuacion = 0;

		Font fuente = new Font("Bahnschrift", 0, 200);
		puntos = new JLabel(Integer.toString(puntuacion));
		puntos.setBounds(60,0,1000,350);
		puntos.setFont(fuente);
		puntos.setForeground(Color.WHITE);

		nombre = new JTextField("Ingrese el nombre del alien muerto");
		nombre.setBounds(700,0,640,50);
		nombre.setFont(new Font("Bahnschrift", 0, 25));

		palabraPuntos = new JLabel("PUNTOS");
		palabraPuntos.setBounds(400,0,1000,350);
		palabraPuntos.setFont(fuente);
		palabraPuntos.setForeground(Color.WHITE);

		subImagen = imagen.getSubimage(0,0,48,48);
		monito = new Monito(subImagen);
	
		this.setTitle("Runnalien");
		this.setSize(900, 380);
		this.setResizable(false);
		this.getContentPane().setBackground(Color.BLACK);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel.setOpaque(false);
		panel.add(pared);
		panel.add(pared2);
		panel.add(fuego);
		panel.add(fuego1);
		panel.add(fuego2);
		panel.add(fuego3);
		panel.add(fuego4);
		panel.add(fuego5);
		panel.add(fuego6);
		panel.add(fuego7);
		panel.add(fuego8);
		panel.add(fuego9);
		panel.add(portal);
		panel.add(gameover);
		panel.add(alien1);
		panel.add(alien2);
		panel.add(alien3);
		//panel.add(alien4);
		panel.add(restart);
		panel.add(start);
		panel.add(troll);
		panel.add(puntos);
		panel.add(palabraPuntos);
		panel.add(logo1);
		panel.add(logo2);
		panel.add(nombre);
		panel.add(guardar);

		this.add(monito);
		this.setVisible(true);
		this.addKeyListener(this);

		gameover.setVisible(false);
		alien1.setVisible(false);
		alien2.setVisible(false);
		alien3.setVisible(false);
		restart.setVisible(false);
		troll.setVisible(false);

		start.setFocusable(false);

		hilo1 = false;
		hilo2 = false;
		hilo3 = false;
		hilo4 = false;
		hilo5 = false;
		hilo6 = false;
		hilo7 = false;
		hilo8 = false;
		hilo9 = false;
		hilo10 = false;

		k1 = false;
		k2 = false;
		k3 = false;
		k4 = false;
		k5 = false;
		k6 = false;
		k7 = false;
		k8 = false;
		k9 = false;
		k10 = false;

		b1 = 1;
		b2 = 1;
		b3 = 1;
		b4 = 1;
		b5 = 1;
		b6 = 1;
		b7 = 1;
		b8 = 1;
		b9 = 1;
		b10 = 1;

		speed = 5;

		this.add(panel);
		this.setVisible(true);

		monito.setLocation(-85,-25);
		start.addActionListener(this);
		restart.addActionListener(this);
		guardar.addActionListener(this);

		inicio();
		this.setVisible(true);
	}

	public void inicio()
	{
		runnalien = java.applet.Applet.newAudioClip(getClass().getResource("Runnalien.wav"));
		runnalien.play();
		start.setVisible(true);
		alien4.setVisible(true);
		troll.setVisible(false);
		gameover.setVisible(false);
		pared.setVisible(false);
		pared2.setVisible(false);
		portal.setVisible(false);
		fuego.setVisible(false);
		fuego1.setVisible(false);
		fuego2.setVisible(false);
		fuego3.setVisible(false);
		fuego4.setVisible(false);
		fuego5.setVisible(false);
		fuego6.setVisible(false);
		fuego7.setVisible(false);
		fuego8.setVisible(false);
		fuego9.setVisible(false);
		restart.setVisible(false);
		monito.setVisible(false);
		puntos.setVisible(false);
		palabraPuntos.setVisible(false);
		logo1.setVisible(true);
		logo2.setVisible(true);
		nombre.setVisible(false);
		guardar.setVisible(false);
	}

	public void actionPerformed(ActionEvent event)
	{
			if(event.getSource() == this.guardar)
			{
				String contenido_a_guardar;
				contenido_a_guardar = nombre.getText() + " " + Integer.toString(puntuacion);

				Archivo.guardarTodo(nombre.getText() + ".txt", contenido_a_guardar);
			}

			if(event.getSource() == this.restart)
			{

				dog.stop();
				MiVentana.this.setVisible(false);
				MiVentana.this.dispose();
				new MiVentana();
			}

			if(event.getSource() == this.start)
			{
				colorear();
				tripa = java.applet.Applet.newAudioClip(getClass().getResource("Tripa (online-audio-converter.com).wav"));
				tripa.loop();
				this.setSize(1500, 380);

				guardar.setVisible(false);
				start.setVisible(false);
				alien4.setVisible(false);
				troll.setVisible(false);
				gameover.setVisible(false);
				pared.setVisible(true);
				pared2.setVisible(true);
				portal.setVisible(true);
				fuego.setVisible(true);
				fuego1.setVisible(true);
				fuego2.setVisible(true);
				fuego3.setVisible(true);
				fuego4.setVisible(true);
				fuego5.setVisible(true);
				fuego6.setVisible(true);
				fuego7.setVisible(true);
				fuego8.setVisible(true);
				fuego9.setVisible(true);
				restart.setVisible(false);
				monito.setVisible(true);
				puntos.setVisible(true);
				palabraPuntos.setVisible(true);
				logo1.setVisible(false);
				logo2.setVisible(false);
				nombre.setVisible(false);
				
				dog.stop();
			}
	}
	
	public void keyPressed(KeyEvent e)
	{
		System.out.println("tiempo = " + tiempo);
		t = e.getKeyCode();
		Point pos = monito.getLocation();
		int x = (int)pos.getX();
		int y = (int)pos.getY();


		if(t==68)
		{
			x = x + speed;
			indice = (indice + 1) % 4;
			indiceX = 48 * indice;
			if (indiceX == 48*3) {
				indiceX = 48;
			}
			monito.imagen = imagen.getSubimage(indiceX,48*2,48,48);
		}

		else if(t==65)
		{

			x = x - speed;
			indice = (indice + 1) % 4;
			indiceX = 48 * indice;
			if (indiceX == 48*3) {
				indiceX = 48;
			}
			monito.imagen = imagen.getSubimage(indiceX,48,48,48);
				
		}

		else if(t==83)
		{
			y = y + speed;
			indice = (indice + 1) % 4;
			indiceX = 48 * indice;
			if (indiceX == 48*3) {
				indiceX = 48;
			}
			monito.imagen = imagen.getSubimage(indiceX,48*0,48,48);			
		}
		else if(t==87)
		{
			y = y - speed;
			indice = (indice + 1) % 4;
			indiceX = 48 * indice;
			if (indiceX == 48*3) {
				indiceX = 48;
			}
			monito.imagen = imagen.getSubimage(indiceX,48*3,48,48);
		}


		if (y < -75) 
		{
			System.out.println("colision");
			y = -75; 
		}
		if (x < -125) {
			x = -125;
		}
		if (x > 1210) {
			x = 1210;
		}

		if (y > 185) {
			y = 185;
		}

		monito.setLocation(x,y);
		System.out.println(x + " " + y);
		muerte(x,y);
		avanzar(x,y);
	}

	public void keyReleased(KeyEvent e)
	{
		//System.out.println("Tecla liberada.");
	}

	public void keyTyped(KeyEvent e)
	{
		//System.out.println("Tecla en el buffer.")

	}

	public void crearHilos()
	{
		if(k1 == true && b1 == 1)
		{
		crearHilo1(hilo1);
		b1 = 0;
		}
		if(b1 == 2){
			speed = speed + 1;
			System.out.println("Velocidad subida, ya no llores");
		}


		if(k2 == true && b2 == 1)
		{
		crearHilo2(hilo2);
		b2 = 0;
		}
		if(b2 == 2){
			speed = speed - 1;
			System.out.println("Velocidad bajada JAJAJAJAJ");
		}

		if(k3 == true && b3 == 1)
		{
		crearHilo3(hilo3);
		b3 = 0;
		}
		if(b3 == 2){
			speed = speed + 1;
			System.out.println("Velocidad subida, ya no llores");
		}

		if(k4 == true && b4 == 1)
		{
		crearHilo4(hilo4);
		b4 = 0;	
		}
		if(b4 == 2){
			speed = speed - 1;
			System.out.println("Velocidad bajada JAJAJAJAJ");
		}

		if(k5 == true && b5 == 1)
		{
		crearHilo5(hilo5);
		b5 = 0;	
		}
		if(b5 == 2){
			speed = speed*(-1);
			System.out.println("Sadaetlov salcet");
		}

		if(k6 == true && b6 == 1)
		{
		crearHilo6(hilo6);
		b6 = 0;
		}
		if(b6 == 2){
			speed = speed + 1;
			System.out.println("Velocidad subida, ya no llores");
		}


		if(k7 == true && b7 == 1)
		{
		crearHilo7(hilo7);
		b7 = 0;
		}
		if(b7 == 2){
			speed = speed - 1;
			System.out.println("Velocidad bajada JAJAJAJAJ");
		}

		if(k8 == true && b8 == 1)
		{
		crearHilo8(hilo8);
		b8 = 0;
		}
		if(b8 == 2){
			speed = speed + 1;
			System.out.println("Velocidad subida, ya no llores");
		}

		if(k9 == true && b9 == 1)
		{
		crearHilo9(hilo9);
		b9 = 0;	
		}
		if(b9 == 2){
			speed = speed - 1;
			System.out.println("Velocidad bajada JAJAJAJAJ");
		}

		if(k10 == true && b10 == 1)
		{
		crearHilo10(hilo10);
		b10 = 0;	
		}
		if(b10 == 2){
			speed = speed*(-1);
			System.out.println("Sadaetlov salcet");
		}
	}

	public void colorear()
	{
		Colorear c = new Colorear(palabraPuntos);
		colorear = new Thread(c);
		colorear.start();
	}

	public void crearHilo1(boolean hilo)
	{
		Enemigo1 e1 = new Enemigo1(fuego, 200, tiempo, hilo);
		enemigo1 = new Thread(e1);
		enemigo1.start();
	}

	public void crearHilo2(boolean hilo)
	{
		Enemigo2 e2 = new Enemigo2(fuego1, 300, tiempo, hilo);
		enemigo2 = new Thread(e2);
		enemigo2.start();
	}

	public void crearHilo3(boolean hilo)
	{
		Enemigo3 e3 = new Enemigo3(fuego2, 400, tiempo, hilo);
		enemigo3 = new Thread(e3);
		enemigo3.start();
	}

	public void crearHilo4(boolean hilo)
	{
		Enemigo4 e4 = new Enemigo4(fuego3, 500, tiempo, hilo);
		enemigo4 = new Thread(e4);
		enemigo4.start();
	}

	public void crearHilo5(boolean hilo)
	{
		Enemigo5 e5 = new Enemigo5(fuego4, 600, tiempo, hilo);
		enemigo5 = new Thread(e5);
		enemigo5.start();
	}

	public void crearHilo6(boolean hilo)
	{
		Enemigo6 e6 = new Enemigo6(fuego5, 700, tiempo, hilo);
		enemigo6 = new Thread(e6);
		enemigo6.start();
	}

	public void crearHilo7(boolean hilo)
	{
		Enemigo7 e7 = new Enemigo7(fuego6, 800, tiempo, hilo);
		enemigo7 = new Thread(e7);
		enemigo7.start();
	}

	public void crearHilo8(boolean hilo)
	{
		Enemigo8 e8 = new Enemigo8(fuego7, 900, tiempo, hilo);
		enemigo8 = new Thread(e8);
		enemigo8.start();
	}

	public void crearHilo9(boolean hilo)
	{
		Enemigo9 e9 = new Enemigo9(fuego8, 1000, tiempo, hilo);
		enemigo9 = new Thread(e9);
		enemigo9.start();
	}

	public void crearHilo10(boolean hilo)
	{
		Enemigo10 e10 = new Enemigo10(fuego9, 1100, tiempo, hilo);
		enemigo10 = new Thread(e10);
		enemigo10.start();
	}

	public void muerte(int x, int y)
	{
		Point pos1 = fuego.getLocation();
		int x1 = (int)pos1.getX();
		int y1 = (int)pos1.getY();
		m = new Rectangle(x1-115,y1-100,25,25);
		hb = new Rectangle(x,y,48,48);
		if (hb.intersects(m) || m.intersects(hb)) {
			System.out.println("colision");
			monito.setLocation(-85,-25);
			puntuacion = 0;
			pantallaGameOver();
		}

		Point pos2 = fuego1.getLocation();
		int x2 = (int)pos2.getX();
		int y2 = (int)pos2.getY();
		m1 = new Rectangle(x2-115,y2-100,25,25);
		hb = new Rectangle(x,y,48,48);
		if (hb.intersects(m1) || m1.intersects(hb)) {
			System.out.println("colision");
			monito.setLocation(-85,-25);
			puntuacion = 0;
			pantallaGameOver();
		}

		Point pos3 = fuego2.getLocation();
		int x3 = (int)pos3.getX();
		int y3 = (int)pos3.getY();
		m2 = new Rectangle(x3-115,y3-100,25,25);
		hb = new Rectangle(x,y,48,48);
		if (hb.intersects(m2) || m2.intersects(hb)) {
			System.out.println("colision");
			monito.setLocation(-85,-25);
			puntuacion = 0;
			pantallaGameOver();
		}

		Point pos4 = fuego3.getLocation();
		int x4 = (int)pos4.getX();
		int y4 = (int)pos4.getY();
		m3 = new Rectangle(x4-115,y4-100,25,25);
		hb = new Rectangle(x,y,48,48);
		if (hb.intersects(m3) || m3.intersects(hb)) {
			System.out.println("colision");
			monito.setLocation(-85,-25);
			puntuacion = 0;
			pantallaGameOver();
		}

		Point pos5 = fuego4.getLocation();
		int x5 = (int)pos5.getX();
		int y5 = (int)pos5.getY();
		m4 = new Rectangle(x5-115,y5-100,25,25);
		hb = new Rectangle(x,y,48,48);
		if (hb.intersects(m4) || m4.intersects(hb)) {
			System.out.println("colision");
			monito.setLocation(-85,-25);
			puntuacion = 0;
			pantallaGameOver();
		}

		Point pos6 = fuego5.getLocation();
		int x6 = (int)pos6.getX();
		int y6 = (int)pos6.getY();
		m5 = new Rectangle(x6-115,y6-100,25,25);
		hb = new Rectangle(x,y,48,48);
		if (hb.intersects(m5) || m5.intersects(hb)) {
			System.out.println("colision");
			monito.setLocation(-85,-25);
			puntuacion = 0;
			pantallaGameOver();
		}

		Point pos7 = fuego6.getLocation();
		int x7 = (int)pos7.getX();
		int y7 = (int)pos7.getY();
		m6 = new Rectangle(x6-115,y6-100,25,25);
		hb = new Rectangle(x,y,48,48);
		if (hb.intersects(m6) || m6.intersects(hb)) {
			System.out.println("colision");
			monito.setLocation(-85,-25);
			puntuacion = 0;
			pantallaGameOver();
		}

		Point pos8 = fuego7.getLocation();
		int x8 = (int)pos8.getX();
		int y8 = (int)pos8.getY();
		m7 = new Rectangle(x7-115,y7-100,25,25);
		hb = new Rectangle(x,y,48,48);
		if (hb.intersects(m7) || m7.intersects(hb)) {
			System.out.println("colision");
			monito.setLocation(-85,-25);
			puntuacion = 0;
			pantallaGameOver();
		}

		Point pos9 = fuego8.getLocation();
		int x9 = (int)pos9.getX();
		int y9 = (int)pos9.getY();
		m8 = new Rectangle(x8-115,y8-100,25,25);
		hb = new Rectangle(x,y,48,48);
		if (hb.intersects(m8) || m8.intersects(hb)) {
			System.out.println("colision");
			monito.setLocation(-85,-25);
			puntuacion = 0;
			pantallaGameOver();
		}

		Point pos10 = fuego9.getLocation();
		int x10 = (int)pos10.getX();
		int y10 = (int)pos10.getY();
		m9 = new Rectangle(x9-115,y9-100,25,25);
		hb = new Rectangle(x,y,48,48);
		if (hb.intersects(m9) || m9.intersects(hb)) {
			System.out.println("colision");
			monito.setLocation(-85,-25);
			puntuacion = 0;
			pantallaGameOver();
		}
	}

	public void avanzar(int x, int y)
	{
		Point pos1 = portal.getLocation();
		int x1 = (int)pos1.getX();
		int y1 = (int)pos1.getY();
		win = new Rectangle(x1-115,y1-100,150,150);
		hb = new Rectangle(x,y,48,48);
		if (hb.intersects(win)) 
		{
			puntuacion = puntuacion + 1;
			Random generator = new Random();
			int r = generator.nextInt(13) + 1;
			System.out.println(r);
			monito.setLocation(-85,-25);
			System.out.println(tiempo);
			puntos.setText(Integer.toString(puntuacion));
			switch(r)
			{
				case 1:
				speed = 30;
				System.out.println("tiempo reducido a la mitad");
				k1 = false;
				k2 = false;
				k3 = false;
				k4 = false;
				k5 = false;
				k6 = false;
				k7 = false;
				k8 = false;
				k9 = false;
				k10 = false;

				if (b1 == 0 && b2 == 0 && b3 == 0 && b4 == 0 && b5 == 0) {
					speed = speed + 3;
				}

				start.setVisible(false);
				alien4.setVisible(false);
				troll.setVisible(false);
				gameover.setVisible(false);
				pared.setVisible(true);
				pared2.setVisible(true);
				portal.setVisible(true);
				fuego.setVisible(true);
				fuego1.setVisible(true);
				fuego2.setVisible(true);
				fuego3.setVisible(true);
				fuego4.setVisible(true);
				fuego5.setVisible(true);
				fuego6.setVisible(true);
				fuego7.setVisible(true);
				fuego8.setVisible(true);
				fuego9.setVisible(true);
				restart.setVisible(false);
				monito.setVisible(true);

				break;

				case 2:
				speed = 5;
				System.out.println("tiempo restado");
				k1 = false;
				k2 = false;
				k3 = false;
				k4 = false;
				k5 = false;
				k6 = false;
				k7 = false;
				k8 = false;
				k9 = false;
				k10 = false;

				start.setVisible(false);
				alien4.setVisible(false);
				troll.setVisible(false);
				gameover.setVisible(false);
				pared.setVisible(true);
				pared2.setVisible(true);
				portal.setVisible(true);
				fuego.setVisible(true);
				fuego1.setVisible(true);
				fuego2.setVisible(true);
				fuego3.setVisible(true);
				fuego4.setVisible(true);
				fuego5.setVisible(true);
				fuego6.setVisible(true);
				fuego7.setVisible(true);
				fuego8.setVisible(true);
				fuego9.setVisible(true);

				restart.setVisible(false);
				monito.setVisible(true);
				break;

				case 3:
				hilo2 = true;
				System.out.println("enemigo2 creado");
				k1 = false;
				k2 = true;
				k3 = false;
				k4 = false;
				k5 = false;
				k6 = false;
				k7 = false;
				k8 = false;
				k9 = false;
				k10 = false;
				if (b2 == 0) {
					b2 = 2;
				}
				start.setVisible(false);
				alien4.setVisible(false);
				troll.setVisible(false);
				gameover.setVisible(false);
				pared.setVisible(true);
				pared2.setVisible(true);
				portal.setVisible(true);
				fuego.setVisible(true);
				fuego1.setVisible(true);
				fuego2.setVisible(true);
				fuego3.setVisible(true);
				fuego4.setVisible(true);
				fuego5.setVisible(true);
				fuego6.setVisible(true);
				fuego7.setVisible(true);
				fuego8.setVisible(true);
				fuego9.setVisible(true);

				restart.setVisible(false);
				monito.setVisible(true);
				crearHilos();
				break;

				case 4:
				speed = 20;
				System.out.println("tiempo aumentado");
				k1 = false;
				k2 = false;
				k3 = false;
				k4 = false;
				k5 = false;
				k6 = false;
				k7 = false;
				k8 = false;
				k9 = false;
				k10 = false;

				if (b1 == 0 && b2 == 0 && b3 == 0 && b4 == 0 && b5 == 0) {
					fuego.setVisible(true);
					fuego2.setVisible(false);
					fuego3.setVisible(false);
					fuego1.setVisible(false);
					fuego4.setVisible(true);

				}
				start.setVisible(false);
				alien4.setVisible(false);
				troll.setVisible(false);
				gameover.setVisible(false);
				pared.setVisible(true);
				pared2.setVisible(true);
				portal.setVisible(true);
				fuego.setVisible(true);
				fuego1.setVisible(true);
				fuego2.setVisible(true);
				fuego3.setVisible(true);
				fuego4.setVisible(true);
				fuego5.setVisible(true);
				fuego6.setVisible(true);
				fuego7.setVisible(true);
				fuego8.setVisible(true);
				fuego9.setVisible(true);

				restart.setVisible(false);
				monito.setVisible(true);
				break;

				case 5:
				hilo3 = true;
				System.out.println("enemigo3 creado");
				k1 = false;
				k2 = false;
				k3 = true;
				k4 = false;
				k5 = false;
				k6 = false;
				k7 = false;
				k8 = false;
				k9 = false;
				k10 = false;

				if (b3 == 0) {
					b3 = 2;
				}
				start.setVisible(false);
				alien4.setVisible(false);
				troll.setVisible(false);
				gameover.setVisible(false);
				pared.setVisible(true);
				pared2.setVisible(true);
				portal.setVisible(true);
				fuego.setVisible(true);
				fuego1.setVisible(true);
				fuego2.setVisible(true);
				fuego3.setVisible(true);
				fuego4.setVisible(true);
				fuego5.setVisible(true);
				fuego6.setVisible(true);
				fuego7.setVisible(true);
				fuego8.setVisible(true);
				fuego9.setVisible(true);

				restart.setVisible(false);
				monito.setVisible(true);
				crearHilos();
				break;

				case 6:
				hilo4 = true;
				System.out.println("enemigo4 creado");
				k1 = false;
				k2 = false;
				k3 = false;
				k4 = true;
				k5 = false;
				k6 = false;
				k7 = false;
				k8 = false;
				k9 = false;
				k10 = false;

				if (b4 == 0) {
					b4 = 2;
				}
				start.setVisible(false);
				alien4.setVisible(false);
				troll.setVisible(false);
				gameover.setVisible(false);
				pared.setVisible(true);
				pared2.setVisible(true);
				portal.setVisible(true);
				fuego.setVisible(true);
				fuego1.setVisible(true);
				fuego2.setVisible(true);
				fuego3.setVisible(true);
				fuego4.setVisible(true);
				fuego5.setVisible(true);
				fuego6.setVisible(true);
				fuego7.setVisible(true);
				fuego8.setVisible(true);
				fuego9.setVisible(true);

				restart.setVisible(false);
				monito.setVisible(true);
				crearHilos();
				break;

				case 7:
				hilo5 = true;
				System.out.println("enemigo5 creado");
				k1 = false;
				k2 = false;
				k3 = false;
				k4 = false;
				k5 = true;
				k6 = false;
				k7 = false;
				k8 = false;
				k9 = false;
				k10 = false;

				if (b5 == 0) {
					b5 = 2;
				}
				start.setVisible(false);
				alien4.setVisible(false);
				troll.setVisible(false);
				gameover.setVisible(false);
				pared.setVisible(true);
				pared2.setVisible(true);
				portal.setVisible(true);
				fuego.setVisible(true);
				fuego1.setVisible(true);
				fuego2.setVisible(true);
				fuego3.setVisible(true);
				fuego4.setVisible(true);
				fuego5.setVisible(true);
				fuego6.setVisible(true);
				fuego7.setVisible(true);
				fuego8.setVisible(true);
				fuego9.setVisible(true);

				restart.setVisible(false);
				monito.setVisible(true);
				crearHilos();
				break;

				case 8:
				hilo1 = true;
				System.out.println("enemigo1 creado");
				k1 = true;
				k2 = false;
				k3 = false;
				k4 = false;
				k5 = false;
				k6 = false;
				k7 = false;
				k8 = false;
				k9 = false;
				k10 = false;

				if (b1 == 0) {
					b1 = 2;
				}
				start.setVisible(false);
				alien4.setVisible(false);
				troll.setVisible(false);
				gameover.setVisible(false);
				pared.setVisible(true);
				pared2.setVisible(true);
				portal.setVisible(true);
				fuego.setVisible(true);
				fuego1.setVisible(true);
				fuego2.setVisible(true);
				fuego3.setVisible(true);
				fuego4.setVisible(true);
				fuego5.setVisible(true);
				fuego6.setVisible(true);
				fuego7.setVisible(true);
				fuego8.setVisible(true);
				fuego9.setVisible(true);

				restart.setVisible(false);
				monito.setVisible(true);
				crearHilos();
				break;

				case 9:
				hilo6 = true;
				System.out.println("enemigo6 creado");
				k1 = false;
				k2 = false;
				k3 = false;
				k4 = false;
				k5 = false;
				k6 = true;
				k7 = false;
				k8 = false;
				k9 = false;
				k10 = false;
				if (b6 == 0) {
					b6 = 2;
				}
				start.setVisible(false);
				alien4.setVisible(false);
				troll.setVisible(false);
				gameover.setVisible(false);
				pared.setVisible(true);
				pared2.setVisible(true);
				portal.setVisible(true);
				fuego.setVisible(true);
				fuego1.setVisible(true);
				fuego2.setVisible(true);
				fuego3.setVisible(true);
				fuego4.setVisible(true);
				fuego5.setVisible(true);
				fuego6.setVisible(true);
				fuego7.setVisible(true);
				fuego8.setVisible(true);
				fuego9.setVisible(true);

				restart.setVisible(false);
				monito.setVisible(true);
				crearHilos();
				break;

				case 10:
				hilo7 = true;
				System.out.println("enemigo6 creado");
				k1 = false;
				k2 = false;
				k3 = false;
				k4 = false;
				k5 = false;
				k6 = false;
				k7 = true;
				k8 = false;
				k9 = false;
				k10 = false;
				if (b7 == 0) {
					b7 = 2;
				}
				start.setVisible(false);
				alien4.setVisible(false);
				troll.setVisible(false);
				gameover.setVisible(false);
				pared.setVisible(true);
				pared2.setVisible(true);
				portal.setVisible(true);
				fuego.setVisible(true);
				fuego1.setVisible(true);
				fuego2.setVisible(true);
				fuego3.setVisible(true);
				fuego4.setVisible(true);
				fuego5.setVisible(true);
				fuego6.setVisible(true);
				fuego7.setVisible(true);
				fuego8.setVisible(true);
				fuego9.setVisible(true);

				restart.setVisible(false);
				monito.setVisible(true);
				crearHilos();
				break;

				case 11:
				hilo8 = true;
				System.out.println("enemigo6 creado");
				k1 = false;
				k2 = false;
				k3 = false;
				k4 = false;
				k5 = false;
				k6 = false;
				k7 = false;
				k8 = true;
				k9 = false;
				k10 = false;
				if (b8 == 0) {
					b8 = 2;
				}
				start.setVisible(false);
				alien4.setVisible(false);
				troll.setVisible(false);
				gameover.setVisible(false);
				pared.setVisible(true);
				pared2.setVisible(true);
				portal.setVisible(true);
				fuego.setVisible(true);
				fuego1.setVisible(true);
				fuego2.setVisible(true);
				fuego3.setVisible(true);
				fuego4.setVisible(true);
				fuego5.setVisible(true);
				fuego6.setVisible(true);
				fuego7.setVisible(true);
				fuego8.setVisible(true);
				fuego9.setVisible(true);

				restart.setVisible(false);
				monito.setVisible(true);
				crearHilos();
				break;

				case 12:
				hilo9 = true;
				System.out.println("enemigo6 creado");
				k1 = false;
				k2 = false;
				k3 = false;
				k4 = false;
				k5 = false;
				k6 = false;
				k7 = false;
				k8 = false;
				k9 = true;
				k10 = false;
				if (b9 == 0) {
					b9 = 2;
				}
				start.setVisible(false);
				alien4.setVisible(false);
				troll.setVisible(false);
				gameover.setVisible(false);
				pared.setVisible(true);
				pared2.setVisible(true);
				portal.setVisible(true);
				fuego.setVisible(true);
				fuego1.setVisible(true);
				fuego2.setVisible(true);
				fuego3.setVisible(true);
				fuego4.setVisible(true);
				fuego5.setVisible(true);
				fuego6.setVisible(true);
				fuego7.setVisible(true);
				fuego8.setVisible(true);
				fuego9.setVisible(true);

				restart.setVisible(false);
				monito.setVisible(true);
				crearHilos();
				break;

				case 13:
				hilo10 = true;
				System.out.println("enemigo6 creado");
				k1 = false;
				k2 = false;
				k3 = false;
				k4 = false;
				k5 = false;
				k6 = false;
				k7 = false;
				k8 = false;
				k9 = false;
				k10 = true;
				if (b10 == 0) {
					b10 = 2;
				}
				start.setVisible(false);
				alien4.setVisible(false);
				troll.setVisible(false);
				gameover.setVisible(false);
				pared.setVisible(true);
				pared2.setVisible(true);
				portal.setVisible(true);
				fuego.setVisible(true);
				fuego1.setVisible(true);
				fuego2.setVisible(true);
				fuego3.setVisible(true);
				fuego4.setVisible(true);
				fuego5.setVisible(true);
				fuego6.setVisible(true);
				fuego7.setVisible(true);
				fuego8.setVisible(true);
				fuego9.setVisible(true);

				restart.setVisible(false);
				monito.setVisible(true);
				crearHilos();
				break;
			}
		}	

	}

	public void pause(int p)
	{
			try{
			Thread.sleep(p);
			}catch(Exception e){
				System.out.println(e);
			}
	}

	public void pantallaGameOver()
	{
		puntuacion = 0;
		puntos.setText(Integer.toString(puntuacion));
		nombre.setVisible(true);

		alien4.setVisible(false);
		troll.setVisible(false);
		gameover.setVisible(true);
		pared.setVisible(false);
		pared2.setVisible(false);
		portal.setVisible(false);
		fuego.setVisible(false);
		fuego1.setVisible(false);
		fuego2.setVisible(false);
		fuego3.setVisible(false);
		fuego4.setVisible(false);
		fuego5.setVisible(false);
		fuego6.setVisible(false);
		fuego7.setVisible(false);
		fuego8.setVisible(false);
		fuego9.setVisible(false);
		restart.setVisible(true);
		monito.setVisible(false);
		puntos.setVisible(false);
		palabraPuntos.setVisible(false);
		guardar.setVisible(true);

		tripa.stop();

		dog = java.applet.Applet.newAudioClip(getClass().getResource("The Bork Files (online-audio-converter.com).wav"));
		dog.play();
		
		if (puntuacion < 6)
		alien1.setVisible(true);
		
	}
}