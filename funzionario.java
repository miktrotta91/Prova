package traccia2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class funzionario implements Comparable<funzionario>{
protected String cognome;
protected String nome;
protected LocalDate dataInizio;
protected String ruolo;
protected static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

public funzionario(String cognome, String nome, String dataInizioString, String ruolo)
{
	this.cognome = cognome;
	this.nome = nome;
	try
	{
		this.dataInizio = LocalDate.parse(dataInizioString, dtf);
	}
	catch(DateTimeParseException e) {
		e.printStackTrace();
		this.dataInizio = LocalDate.now();
	}
	this.ruolo = ruolo;
}

public int MesiDiLavoro()
{
	LocalDate oggi = LocalDate.now();
	Period p = Period.between(dataInizio, oggi);
	return p.getYears() * 12 + p.getMonths();
}

public String StampaListaDisordinata()
{
	String info = this.cognome.toLowerCase();
	return info;
}

public String StampaListaOrdinata()
{
	String info = this.cognome.toLowerCase();
	return info;
}

public String ListaOrdinataConInformazioni()
{
	String info = this.cognome.toLowerCase();
	return info + " " + this.nome + " " + this.ruolo + " " + "Mesi Di servizio: " + MesiDiLavoro();
}

public String GetRuolo()
{
	return ruolo;
}

public int GetServizio()
{
	return MesiDiLavoro();
}
@Override
public int compareTo(funzionario o) {
	// TODO Auto-generated method stub
	return this.dataInizio.compareTo(o.dataInizio);
}

}
