package esercizio5;

public class Main {

	public static void main(String[] args) {
		double v1,v2,v3,temp;
		v1=5.6;
		v2=67.5;
		v3=42.4;
		
		
		temp=media(v1,v2,v3);
		System.out.println("La media dei valori " + v1 + ", " + v2 +", "+ v3 +" è: "+ temp);
	}
	
	public static double media(double v1,double v2,double v3) {
		double temp1;
		temp1=(v1+v2+v3)/3;
		return temp1;
	}

}
