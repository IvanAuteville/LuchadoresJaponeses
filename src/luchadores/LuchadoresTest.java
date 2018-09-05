package luchadores;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class LuchadoresTest
{
    @Test
    public void prueba1()
    {
	Torneo torneo = null;
	
	String path = "E:\\Program Files (x86)\\Programas\\Eclipse\\Workspace\\LuchadoresJaponeses\\test\\";
	String file = "sumo";

	int max = 4; // Cantidad de casos de prueba que tengo

	for (int i = 0; i < max; i++)
	{
	    try
	    {
		torneo = ArchivoTorneo.leer(path + file + i + ".in");
	    } catch (FileNotFoundException e)
	    {
		e.getMessage();
	    }

	    try
	    {
		ArchivoTorneo.escribir(path + file + i + ".out", torneo.resolver());
	    } catch (IOException e)
	    {
		e.getMessage();
	    }
	}
    }
}
