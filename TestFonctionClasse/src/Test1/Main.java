package Test1;
//la classe pricipale qui permet au code de se lancer
public class Main {
 ///les variables se met au debut de la classe
	public static String name;//=NULL ;mais la variable doit etre static pour qu'on peut l'utiliser a l'interieur des classes
	static int money=850;
	static int pricephone=800;
	static int number=9;
	static boolean hasPhone=false;
	static String message="le message";
	public static String  testt="Test";//ajouter static pour qu'on puisse le reutiliser
	public final static String  fin="mommy";//l'option final :la variable ne pourra jamais changer,non modifiable
	public static void main(String[] args) {
		System.out.println("Bonjour!!!");
		testDeFonction();
		test();
		testAge();//Instantiation
		testt="n ";
		test();
		sendMessage("la difference est de: "+getResultat(money,pricephone,hasPhone),number);
		
		
		}
	public static void testDeFonction(){//il faut qu"on ajoute static,on ne peut pas faire une reference static a un code qui n'est pas static
		System.out.println("ca va???");
	}
	public static void test() {
		System.out.println("Allo?!!"+testt);
	}
	public static void testAge() {
		System.out.println("j'ai 20ans");
	}
	private static void sendMessage(String message,int number){
		 System.out.println("ceci est un petit message: "+message);
	}
	private static int getResultat(int money,int pricePhone,boolean hasPhone ) {
		if (money >= pricephone && !hasPhone) {
			 System.out.println("tu peux acheter un phone");
		}
		else {
			 System.out.println("tu n'as pas assez d'argent ou t'as un phone");
		}
		return money-pricephone;
	}
}
