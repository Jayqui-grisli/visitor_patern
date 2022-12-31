package visitor;

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
	@Override
	public float calculatePrice(Visitor v) {
		// TODO Auto-generated method stub
		return v.visitPlat_Dessert(this);
	}

}
