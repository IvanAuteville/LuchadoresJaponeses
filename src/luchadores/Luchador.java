package luchadores;

public class Luchador
{
    int peso = 0;
    int altura = 0;
    
    public Luchador(int peso, int altura)
    {
	this.peso = peso;
	this.altura = altura;
    }

    public boolean domina(Luchador oponente)
    {
	int difPeso = this.peso - oponente.peso;
	int difAltura = this.altura - oponente.altura;

	if (difPeso > 0 && difAltura > 0)
	{
	    return true;
	}

	if (difPeso > 0 && difAltura == 0)
	{
	    return true;
	}

	if (difAltura > 0 && difPeso == 0)
	{
	    return true;
	}

	return false;
    }
}
