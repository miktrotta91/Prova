package traccia2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class donatore {
protected String nome;
protected String cognome;
protected LocalDate dataNascita;
protected String luogoNascita;
protected static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

public donatore() {}

public donatore(String nome, String cognome, String dataNascitastr, String luogoNascita) {
	this.nome = nome;
	this.cognome = cognome;
	try
	{
		this.dataNascita = LocalDate.parse(dataNascitastr, dtf);
	}
	catch(DateTimeParseException e)
	{
		e.printStackTrace();
	}
	this.luogoNascita = luogoNascita;
}

public void AggiungiDonatore()
{
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Inserire Nome");
	nome = scan.nextLine();
	
	System.out.println("Inserire Cognome");
	cognome = scan.nextLine();
	
	System.out.println("Inserire data di nascita");
	String DataNascita = scan.nextLine();
	try
	{
		dataNascita = LocalDate.parse(DataNascita, dtf);
	}
	catch(DateTimeParseException e)
	{
		e.printStackTrace();
	}
	
	System.out.println("Inserire Luogo di Nascita");
	luogoNascita = scan.nextLine();
	}

public String StampaNuovoDonatore()
{
	return this.cognome + " " + this.nome + " " + dtf.format(dataNascita) + " " + this.luogoNascita;
}

public int Eta()
{
	LocalDate oggi = LocalDate.now();
	Period p = Period.between(dataNascita, oggi);
	return p.getYears();
}

public String StampaListaDonatori()
{
	return this.cognome + " " + this.nome + " " + dtf.format(dataNascita) + " " + this.luogoNascita + " Età: " + Eta() + " anni."; 
}

}


