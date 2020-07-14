import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.Random;
import java.applet.AudioClip;

class Colorear implements Runnable{
	JLabel palabraPuntos;

	public Colorear(JLabel palabraPuntos)
	{
		this.palabraPuntos = palabraPuntos;
	}

	public void run()
	{
		retorno(17510);

		while(true)
		{
			this.palabraPuntos.setForeground(Color.RED);
			retorno(200);
			this.palabraPuntos.setForeground(Color.BLUE);
			retorno(200);
			this.palabraPuntos.setForeground(Color.GREEN);
			retorno(200);
			this.palabraPuntos.setForeground(Color.YELLOW);
			retorno(200);
		}
	}

	public void retorno(int duracion)
	{
		try{
		Thread.sleep(duracion);
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
}