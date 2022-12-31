package visitor;
import java.util.ArrayList;
import java.util.List;

public class Menu implements Commande {
	
	private List<Commande> _composition=new ArrayList<Commande>();
	private String _nom;
	public Menu(String nom)
	{
		_nom=nom;
	}
	public void addComposant(Commande c)
	{
		_composition.add(c);
	}
	public List<Commande> getComposition()
	{
		return _composition;
	}
	@Override
	public float calculatePrice(Visitor v) {
		// TODO Auto-generated method stub
		return v.visitMenu(this);
	}
}
