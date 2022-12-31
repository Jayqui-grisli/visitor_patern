package visitor;

import java.util.ArrayList;
import java.util.List;

public class Livraison implements Commande {

	private List<Commande> _composition=new ArrayList<Commande>();
	private String _destinataire;
	
	public Livraison(String destinataire)
	{
		_destinataire=destinataire;
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
		return v.visitLivraison(this);
	}

}
