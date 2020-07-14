import java.awt.*;
import javax.swing.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.Random;
import java.applet.AudioClip;

class Movimiento implements Runnable{

	int t;
	int indice;
	int indiceX;
	BufferedImage imagen;
	int x;
	int y;
	Monito1 monito1;

	public Movimiento(int t, int indice, int indiceX, BufferedImage imagen, int x, int y, Monito1 monito1)
	{
		this.t = t;
		this.indice = indice;
		this.indiceX = indiceX;
		this.imagen = imagen;
		this.x = x;
		this.y = y;
		this.monito1 = monito1;
	}
	public void run()
	{
		if(t==68)
		{
			x = x + 5;
			indice = (indice + 1) % 4;
			indiceX = 48 * indice;
			if (indiceX == 48*3) {
				indiceX = 48;
			}
			monito1.imagen = imagen.getSubimage(indiceX,48*6,48,48);
		}

		else if(t==65)
		{

			x = x - 5;
			indice = (indice + 1) % 4;
			indiceX = 48 * indice;
			if (indiceX == 48*3) {
				indiceX = 48;
			}
			monito1.imagen = imagen.getSubimage(indiceX,48*5,48,48);
				
		}

		else if(t==83)
		{
			y = y + 5;
			indice = (indice + 1) % 4;
			indiceX = 48 * indice;
			if (indiceX == 48*3) {
				indiceX = 48;
			}
			monito1.imagen = imagen.getSubimage(indiceX,48*4,48,48);			
		}
		else if(t==87)
		{
			y = y - 5;
			indice = (indice + 1) % 4;
			indiceX = 48 * indice;
			if (indiceX == 48*3) {
				indiceX = 48;
			}
			monito1.imagen = imagen.getSubimage(indiceX,48*7,48,48);
		}

		monito1.setLocation(x,y);
	}
	
}