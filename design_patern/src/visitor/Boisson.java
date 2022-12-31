package visitor;

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
	@Override
	public float calculatePrice(Visitor v) {
		// TODO Auto-generated method stub
		return v.visitBoisson(this);
	}

}
