package no_patern;

public class Main {

	public static void main(String[] args) {
		//on crée des plats
		Plat_Dessert plt1=new Plat_Dessert("pizza");
		Plat_Dessert plt2=new Plat_Dessert("tiramisu",true);
		Boisson bois1=new Boisson("coca");
		Boisson bois2=new Boisson("86",true);
		//on Crée des menus
		Menu men1=new Menu("petite formule");
		men1.addComposant(plt1);
		men1.addComposant(bois1);
		Menu men2=new Menu("grosse formule");
		men2.addComposant(bois2);
		men2.addComposant(plt2);
		men2.addComposant(plt1);
		//On effectue les Livraisons
		Livraison liv1=new Livraison("Isli Zaoui");
		liv1.addComposant(men2);
		Livraison liv2=new Livraison("Mathieu Laisné");
		liv2.addComposant(plt2);
		//On affiche les prix des différents items
		System.out.println("Livraison 1 (no patern) : "+liv1.calculatePrice());
		System.out.println("Livraison 2 (no patern) : "+liv2.calculatePrice());
		System.out.println("Tiramisu (no patern) : "+plt2.calculatePrice());
		System.out.println("Grosse formule (no patern) : "+men2.calculatePrice());
	}

}
