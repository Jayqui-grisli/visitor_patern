package no_patern;


public class Plat_Dessert implements Commande {
	private String _nom;
	private boolean _isDessert;
	public Plat_Dessert(String nom)
	{
		_nom=nom;
		_isDessert=false;
	}
	public Plat_Dessert(String nom,boolean isDessert)
	{
		_nom=nom;
		_isDessert=isDessert;
	}
	public boolean getIsDessert()
	{
		return _isDessert;
	}
	public String getNom()
	{
		return _nom;
	}
	@Override
	public float calculatePrice() {
		if (_isDessert)
		{
			return 5;
		}
		return 10;
	}
}
