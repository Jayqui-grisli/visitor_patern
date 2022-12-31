package visitor;

public class Main {

	public static void main(String[] args) {
		//On crée le visiteur
		CalculatePriceVisitor myVisitor=new CalculatePriceVisitor();
		//On crée des elements de menu
		Plat_Dessert plt1=new Plat_Dessert("pizza");
		Plat_Dessert plt2=new Plat_Dessert("tiramisu",true);
		Boisson bois1=new Boisson("coca");
		Boisson bois2=new Boisson("86");
		//on Crée des menu
		Menu men1=new Menu("petite formule");
		men1.addComposant(plt1);
		men1.addComposant(bois1);
		Menu men2=new Menu("grosse formule");
		men2.addComposant(bois2);
		men2.addComposant(plt2);
		men2.addComposant(plt1);
		//On effectue les Livraison
		Livraison liv1=new Livraison("Isli Zaoui");
		liv1.addComposant(men2);
		Livraison liv2=new Livraison("Mathieu Laisné");
		liv2.addComposant(plt2);
		//On affiche les prix des différents items
		System.out.println("Livraison 2 : "+liv2.calculatePrice(myVisitor));
		System.out.println("Livraison 1 : "+liv1.calculatePrice(myVisitor));
		System.out.println("Tiramisu : "+plt2.calculatePrice(myVisitor));
		System.out.println("Grosse formule : "+men2.calculatePrice(myVisitor));
	}

}
