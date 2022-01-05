package helloformation;


class Inetum{
	  public void bla() {
	    System.out.println("Je suis un collaborateur Inetum anonyme");
	  }
	}

class Syhem extends Inetum{
	public void bla() {
		System.out.println("Je suis Syhem d'Inetum");
	}
}

class Logan extends Inetum{
	public void bla() {
		System.out.println("Je suis Logan d'Inetum");
	}
}

class MyFalseMain {
	public static void main(String[] args) {
		Inetum bla = new Inetum();  
		Inetum s = new Syhem(); 
	    Inetum l = new Logan(); 
	    bla.bla(); // affiche Je suis un collaborateur Inetum anonyme
	    s.bla(); // affiche Je suis Syhem d'Inetum
	    l.bla(); // affiche Je suis Logan d'Inetum
	}
}