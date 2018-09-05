package luchadores;

public class Torneo
{
    Luchador[] luchadores = null;

    public Torneo(int n)
    {
	luchadores = new Luchador[n];
    }

    public void cargarLuchador(int index, int peso, int altura)
    {
	luchadores[index] = new Luchador(peso, altura);
    }

    public int[] resolver()
    {
	int[] output = new int[luchadores.length];

	for (int i = 0; i < output.length; i++)
	{
	    int domina = 0;

	    for (int n = 0; n < output.length; n++)
	    {
		if (luchadores[i].domina(luchadores[n]))
		{
		    domina++;
		}
	    }

	    output[i] = domina;
	}

	return output;
    }

}
