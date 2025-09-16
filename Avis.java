package traccia2;

import java.util.ArrayList;
import java.util.Scanner;

public class Avis {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		ArrayList<donatore> donatori = new ArrayList<>();
		int scelta;
		
		System.out.println("Benvenuto Nel registro Donatori Avis \n");
		do
		{
			System.out.println("Scegli un'opzione: \n");
			System.out.println("1. Aggiungi Donatore");
			System.out.println("2. Stampa Lista Donatori");
			scelta = scan1.nextInt();
			
			switch(scelta)
			{
			case 1: donatore paziente = new donatore();
			paziente.AggiungiDonatore();
			donatori.add(paziente);
			System.out.println(paziente.StampaNuovoDonatore());
			break;
			
			case 2: if(donatori.isEmpty())
			{
				System.out.println("Nessun donatore presente nel registro.");
			}
			else
			{
				System.out.println("\n--- Lista Donatori ---");
				int contatore = 1;
				for(donatore d: donatori)
				{
					System.out.println(" Donatore #" + contatore +": " + d.StampaListaDonatori());
					contatore++;
				}
			}
			break;
			} 
		}
			while (scelta!=0);
			scan1.close();
		}

	}
		


