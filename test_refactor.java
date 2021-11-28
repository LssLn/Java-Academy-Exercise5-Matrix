import java.util.Arrays;
import java.util.Random;

public class test_refactor {
	/*Esercizio 5
	Scrivere un programma che, dopo aver creato un array
	multidimensionale quadrato (3x3, 4x4, 5x5, 10x10…), venga riempito
	con numeri random da 0 a 100, e venga stampato. Fatto ciò scrivere dei
	metodi che mi permettano di:
	• Calcolare la somma di tutti i numeri dell’array
	• Calcolare la somma dei numeri sulla diagonale da sx verso dx
	• Calcolare la somma dei numeri sulla diagonale da dx verso sx*/
		
	public static int ex1(int[][] array, int n) {
		int somma=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				somma=somma+array[i][j];
			}
		}
		return somma;
	}
	
	public static int ex2(int[][] array, int n) {
		int somma=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) somma=somma+array[i][j];
			}
		}
		return somma;
	}
	
	public static int ex3(int[][] array, int n) {
		int somma=0;
		for(int i=n-1;i>=0;i--) {
			for(int j=n-1;j>=0;j--) {
				if(i+j==n-1) {
				somma=somma+array[i][j];
					
				}
			}
		}
		return somma;
	}
	
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
		}
		int return1=ex1(array,n);
		System.out.println("La somma di tutti gli elementi è :"+return1);
		int return2=ex2(array,n);
		System.out.println("La somma della diagonale destra :"+return2);
		int return3=ex3(array,n);
		System.out.println("La somma della diagonale sinistra :"+return3);
		
	}
}
