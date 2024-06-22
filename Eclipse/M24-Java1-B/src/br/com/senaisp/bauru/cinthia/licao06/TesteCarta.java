package br.com.senaisp.bauru.cinthia.licao06;

public class TesteCarta {

	public static void main(String[] args) {
		Carta ct;
		try {
			ct = new Carta(4, 15);
			System.out.print(ct.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
