package visitor;

public class CalculatePriceVisitor implements Visitor {
	
	public CalculatePriceVisitor()
	{
		
	}

	@Override
	public float visitMenu(Menu m) {
		float prix=0;
		for (Commande c:m.getComposition())
		{
			prix+=c.calculatePrice(this);
		}
		if (m.getComposition().size()>=3)
		{
			prix*=0.9;
		}
		return prix;
	}

	@Override
	public float visitLivraison(Livraison l) {
		float prix=0;
		for (Commande c:l.getComposition())
		{
			prix+=c.calculatePrice(this);
		}
		prix*=1.2;
		return prix;
	}

	@Override
	public float visitBoisson(Boisson b) {
		float prix=2;
		if(b.getAlcool())
		{
			prix*=3;
		}
		return prix;
	}

	@Override
	public float visitPlat_Dessert(Plat_Dessert p_d) {
		float prix=10;
		if(p_d.getIsDessert())
		{
			prix=5;
		}
		return prix;
	}


}
