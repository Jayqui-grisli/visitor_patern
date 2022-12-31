package no_patern;

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
	public String getDestinataire()
	{
		return _destinataire;
	}
	@Override
	public float calculatePrice() {
		float prix=0;
		for (Commande c:_composition)
		{
			prix+=c.calculatePrice();
		}
		prix*=1.2;
		return prix;
	}

}
