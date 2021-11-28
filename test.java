import java.util.Arrays;
import java.util.Random;

public class test {
	/*Esercizio 5
	Scrivere un programma che, dopo aver creato un array
	multidimensionale quadrato (3x3, 4x4, 5x5, 10x10…), venga riempito
	con numeri random da 0 a 100, e venga stampato. Fatto ciò scrivere dei
	metodi che mi permettano di:
	• Calcolare la somma di tutti i numeri dell’array
	• Calcolare la somma dei numeri sulla diagonale da sx verso dx
	• Calcolare la somma dei numeri sulla diagonale da dx verso sx*/
	
	
	
	public static void main(String[] args) {
		int n=5;
		int[][] array = new int[n][n];
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				Random random = new Random();
				array[i][j]=random.nextInt(101);
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(Arrays.toString(array[i]));
			/*for(int j=0;j<n;j++) {
				System.out.println(array[i][j]);
			}*/
		}
		
		int somma=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				somma=somma+array[i][j];
			}
		}
		
		System.out.println("La somma di tutti gli elementi è :"+somma);
		
		somma=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j)
				somma=somma+array[i][j];
			}
		}
		System.out.println("La somma di tutti gli elementi della diagonale destra :"+somma);
		somma=0;
		for(int i=n-1;i>=0;i--) {
			for(int j=n-1;j>=0;j--) {
				if(i+j==n-1) { //i=5 && j=1, i=4 && j=2, i==3 && j=3, ...
				somma=somma+array[i][j];
					
				}
			}
		}
		System.out.println("La somma di tutti gli elementi della diagonale sinistra :"+somma);
		
	}
}