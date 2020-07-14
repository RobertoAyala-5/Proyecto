import java.io.*;
import java.util.*;


class Archivo{
	
	public static ArrayList<String> leerTodo(String nombreArchivo)
	{
    	ArrayList<String> contenido = new ArrayList<String>();
    	String cadena = new String();

    	try(FileInputStream fis = new FileInputStream(nombreArchivo);
        	DataInputStream din = new DataInputStream(fis);
        	BufferedReader br = new BufferedReader(new InputStreamReader(din));)
{
	cadena = br.readLine();
	while(cadena != null)
	{
    	contenido.add(cadena);
    	cadena = br.readLine();
	}
}
    	
	catch(Exception e)
	{
    	e.printStackTrace();
	}
    	return contenido;
	}

    public static void guardarTodo(String nombre, String informacion)
    {

            try {
               
                FileOutputStream fw = new FileOutputStream(nombre);
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fw));
                bw.write(informacion);
                bw.close();
                
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(1);
            }
    }

    public static void guardarTodo(String informacion)
    {

            try {
               
                FileOutputStream fw = new FileOutputStream("ArchivoNuevo.txt");
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fw));
                bw.write(informacion);
                bw.close();
                
            } catch (Exception e) {
                e.printStackTrace();
                System.exit(1);
            }
    }
}


