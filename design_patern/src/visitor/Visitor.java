package visitor;

public interface Visitor {
	float visitMenu(Menu m);
	float visitLivraison(Livraison l);
	float visitBoisson(Boisson b);
	float visitPlat_Dessert(Plat_Dessert p_d);
}
