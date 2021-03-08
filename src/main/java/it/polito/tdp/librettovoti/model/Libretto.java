package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List<Voto> voti ;
	
	public Libretto() {
		this.voti = new ArrayList<>() ;
	}

	public void add(Voto v) {
		this.voti.add(v) ;
	}
	
	public String toString() {

		String s = "" ;
		for(Voto v: this.voti) {
			s = s + v.toString() + "\n" ;
		}
		return s ;
	}

	public Libretto votiUguali(int punteggio) {
		
		Libretto elenco = new Libretto();
		for(Voto v : voti) {
			if(v.getVoto()==punteggio) {
				elenco.add(v);
			}
		}
		
		return elenco;
	}

	public Voto ricercaCorso(String nome) {
		
		Voto risultato = null;
		for(Voto v : this.voti) {
			if(v.getNome().equals(nome)) {
				risultato = v;
				break;
			}
		}
		return risultato;
	}


}
