package traccia2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ospedale {

	public static void main(String[] args) {
		ArrayList<funzionario> funzionari = new ArrayList<>();
		funzionari.add(new funzionario("Trotta", "Giuseppe", "13/09/2000", "OSS"));
		funzionari.add(new funzionario("Spinelli", "Giovanni", "18/10/2007", "Caposala"));
		funzionari.add(new funzionario("Lepore", "Mirko", "08/05/2000", "Infermiere"));
		funzionari.add(new funzionario("Corsini", "Simone", "13/02/2003", "Presidente"));
		funzionari.add(new funzionario("Fiorentino", "Mario", "01/09/2024", "Primario di Reparto"));
		funzionari.add(new funzionario("Siliberti", "Verbena", "13/11/2001", "Medico Senior"));
		funzionari.add(new funzionario("Bianconi", "Giuseppe", "10/04/2002", "Direttore Generale"));
		funzionari.add(new funzionario("Lombardi", "Zoe", "09/08/2025", "Infermiere"));
		funzionari.add(new funzionario("Lopez", "Vincenzo", "23/09/2017", "Caposala"));
		funzionari.add(new funzionario("De Mauro", "Pasquale", "09/09/2020", "Medico Senior"));
		funzionari.add(new funzionario("Ciafardini", "Fabio", "06/03/2015", "Primario di Reparto"));
		funzionari.add(new funzionario("Scarcelli", "Alessandro", "03/02/2025", "Caposala"));
		funzionari.add(new funzionario("Lippolis", "Francesca", "13/01/2024", "Medico Senior"));
		funzionari.add(new funzionario("Dibe", "Bouchra", "15/07/2018", "Infermiere"));
		funzionari.add(new funzionario("Felice", "Natale", "25/12/1990", "Primario di Dipartimento"));
		
		
		//Lista Disordinata
		System.out.println("Lista Disordinata: \n");
		for (funzionario f: funzionari)
		{
			System.out.println(f.StampaListaDisordinata());
		}
		
		
		//Ordinamento Per Ruolo
				List<String>ordineRuolo = List.of(
						"Presidente",
						"Direttore Generale",
						"Primario di Dipartimento",
						"Primario di Reparto",
						"Caposala",
						"Medico Senior",
						"Infermiere",
						"OSS");
				
				
		//Lista ordinata per mesi e ruoli
				List<funzionario>ordinePerRuoloEAnzianita = funzionari.stream()
						.sorted(
								Comparator.comparingInt((funzionario f) ->ordineRuolo.indexOf(f.GetRuolo()))
								.thenComparing(Comparator.comparingInt(funzionario::GetServizio).reversed())
								).collect(Collectors.toList());
				
				System.out.println("Lista Ordinata: \n");
				for(funzionario f: ordinePerRuoloEAnzianita)
				{
					System.out.println(f.StampaListaOrdinata());
				}
				
	//Lista Ordidata Con Informazioni
				System.out.println("Lista ordinata con nformazioni: \n");
				for(funzionario f: ordinePerRuoloEAnzianita)
				{
					System.out.println(f.ListaOrdinataConInformazioni());
				}


	}

}
