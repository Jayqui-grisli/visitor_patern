package no_patern;

public class Boisson implements Commande {

	private boolean _alcool;
	private String _nom;
	public Boisson(String nom, boolean alcool)
	{
		_alcool=alcool;
		_nom=nom;
	}
	public Boisson(String nom)
	{
		_alcool=false;
		_nom=nom;
	}
	public boolean getAlcool()
	{
		return _alcool;
	}
	public String getNom()
	{
		return _nom;
	}
	@Override
	public float calculatePrice() {
		if (_alcool)
		{
			return 6;
		}
		return 2;
	}
}
