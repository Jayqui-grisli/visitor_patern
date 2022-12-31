package no_patern;

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
	public String getNom()
	{
		return _nom;
	}
	@Override
	public float calculatePrice() {
		float prix=0;
		for (Commande c:_composition)
		{
			prix+=c.calculatePrice();
		}
		prix*=0.9;
		return prix;
	}
}
