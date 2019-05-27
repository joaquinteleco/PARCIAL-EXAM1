package jsproblem6;
import java.util.Scanner;
public class JSCONSECUTIVES {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("numero de elementos del conjunto: ");
		int total = entrada.nextInt();
		int [] conjunto =new int[total];
		int []mayor = new int[4];
		System.out.println("Ingrese los valores del conjunto");
		for(int i=0;i<total;i++) {
			conjunto[i]=entrada.nextInt();
		}
		int indice=0;
		int inicial = conjunto[0]*conjunto[1]*conjunto[2]*conjunto[3];
		for(int j=1;j<total-3;j++) {
			int secundario=conjunto[j]*conjunto[j+1]*conjunto[j+2]*conjunto[j+3];
			if(inicial>=secundario) {
				
			}
			else {
				inicial=secundario;
				indice=j;
			}
		}
		mayor[0]=conjunto[indice];
		mayor[1]=conjunto[indice+1];
		mayor[2]=conjunto[indice+2];
		mayor[3]=conjunto[indice+3];
		
		System.out.println("el mayor producto de numero consecutivos se obtiene de los numeros:\n");
		for(int k=0;k<4;k++) {
			
			System.out.println(mayor[k]);
		}
		
	}


}
