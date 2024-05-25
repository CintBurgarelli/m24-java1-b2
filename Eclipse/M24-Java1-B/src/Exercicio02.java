
public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = a++; //a => 11 a = a + 1
		int c = ++a; // a => 12
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		//nesse ponto a = 13
		int total = ++a / 2;
		System.out.println(total);
		char letraA = 'A'; //65
		char letraB = 'B';
		System.out.println(++letraA);
		System.out.println("" + letraA + letraB);
		
	}

}
