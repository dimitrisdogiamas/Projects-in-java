import java.util.Scanner;
public class ASK1 {
	    public static void main(String[] args) 
	    {
	        Scanner input = new Scanner(System.in);
	        double KostosAnaLitro = 1.873;
	        double KaushEkato = 6.3;
	        double SynolikhApostash = 0;
	        double Kausima = 0;
	        double MAXApostasi = 0;
	        int SynolikaAmaxia =0;
	        int elegxos = 0;

	        while (elegxos != 1) 
	        {
	            System.out.println("Plhktrologhste ta xiliometra h pathste to 0 gia na emfanistoun ta apotelesmata: ");
	            double Xiliometra = input.nextDouble();
	            
	            if (Xiliometra == 0) 
	            {
	                elegxos = 1;
	                continue;
	            }
	            
	            SynolikhApostash += Xiliometra;
	            double KausimaAmaxiou  =  Xiliometra / 100 * KaushEkato;
	            Kausima += KausimaAmaxiou;
	            double Kostos = KausimaAmaxiou * KostosAnaLitro;
	            System.out.println("Xiliometra " +Xiliometra +" km: " +Kostos +" Euro ");
	            
	            if (Xiliometra > MAXApostasi) 
	            {
	                MAXApostasi = Xiliometra;
	            }
	            
	            SynolikaAmaxia ++;
	            
	        }
	        
	        System.out.println("Synolikh Apostase:" +SynolikhApostash +"Km");
	        System.out.println("Synolika Kaysima:" +Kausima +"L");
	        System.out.println("Megalyterh Apostash:" +MAXApostasi +"Km");
	        System.out.println("Synolika plhktologhsate stoixeia gia " +SynolikaAmaxia +" amaxia");
	        
	        input.close();
	    }
	}
