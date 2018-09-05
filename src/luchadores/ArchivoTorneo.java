package luchadores;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class ArchivoTorneo
{
    public static Torneo leer(String path) throws FileNotFoundException
    {
	// Archivo
	Scanner sc = new Scanner(new File(path));
	sc.useLocale(Locale.ENGLISH);
	// ---------------------------

	// Cantidad de luchadores a leer
	int n = sc.nextInt();
	
	// Creo un torneo con n luchadores
	Torneo torneo = new Torneo(n);

	// Cargo los n luchadores
	for (int i = 0; i < n; i++)
	{
	    torneo.cargarLuchador(i, sc.nextInt(), sc.nextInt());
	}

	sc.close();
	return torneo;
    }

    public static void escribir(String path, int[] salida) throws IOException
    {
	PrintWriter out = new PrintWriter(new FileWriter(path));

	int corte = salida.length - 1; // Para evitar el \n luego del ultimo output

	for (int i = 0; i < corte; i++)
	{
	    out.println(salida[i]);
	}

	out.print(salida[corte]);
	out.close();
    }
}
