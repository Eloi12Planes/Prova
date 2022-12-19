
public class Main {

	public static void main(String[] args) {
		int n =  10;
		boolean par ;
		n++;
		
		
		par = EsParell(n);
		
	}
	
	public void saludar(String nom) {
		System.out.println("Hola "+nom);
	}
	
	public static boolean EsParell(int num) {
		return num % 2 == 0;
	}
	

}
