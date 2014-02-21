package com.zeneke;

public class PuntosAgricolaScore {
	
	
	public final int MAXSCORES=100;
	int numScores;
	PuntuacionesAgricola[] scores;
	
	PuntosAgricolaScore()
	{
		scores = new PuntuacionesAgricola[MAXSCORES];
		numScores=0;
	}
	
	public class PuntuacionesAgricola
	{
		String nombre;
		
	    int pcampos=-1;
	    int ppastos=-1;
	    int pcereales=-1;
	    int phortalizas=-1;
	    int povejas=-1;
	    int pjabalis=-1;
	    int pvacas=-1;
	    int plibres=0;
	    int pestablos=0;
	    int phabitaciones=0;
	    int ppersonas=6;
	    int pcartas=0;
	    int pmendigos=0;
	    int puntos=0;
	    
		PuntuacionesAgricola(String nombre,int pcampos,int ppastos,int pcereales,int phortalizas,int povejas, int pjabalis, int pvacas,
				int plibres, int pestablos, int phabitaciones, int ppersonas, int pcartas, int pmendigos, int puntos)
		{
			this.nombre=nombre;
			
			this.pcampos=pcampos;
		    this.ppastos=ppastos;
		    this.pcereales=pcereales;
		    this.phortalizas=phortalizas;
		    this.povejas=povejas;
		    this.pjabalis=pjabalis;
		    this.pvacas=pvacas;
		    this.plibres=plibres;
		    this.pestablos=pestablos;
		    this.phabitaciones=phabitaciones;
		    this.ppersonas=ppersonas;
		    this.pcartas=pcartas;
		    this.pmendigos=pmendigos;
		    this.puntos=puntos;
		}
	}
	
	public void addScore(String nombre,int pcampos,int ppastos,int pcereales,int phortalizas,int povejas, int pjabalis, int pvacas,
			int plibres, int pestablos, int phabitaciones, int ppersonas, int pcartas, int pmendigos, int puntos)
	{
		int posicion=0;
		boolean encontrado=false;
		
		while (posicion<numScores && !encontrado)
		{
			if (scores[posicion].puntos<puntos)
			{
				numScores++;
				int nuevaPos=0;
				for (int i=numScores;i>posicion;i--)
					{scores[i]=scores[i-1];nuevaPos=i-1;}
				scores[nuevaPos]=new PuntuacionesAgricola(nombre,pcampos,ppastos,pcereales,phortalizas,povejas, pjabalis, pvacas,
						plibres, pestablos, phabitaciones, ppersonas, pcartas, pmendigos, puntos);
				encontrado=true;
			}
			posicion++;
		}
		
		if (!encontrado)
		{
			scores[posicion]= new PuntuacionesAgricola(nombre,pcampos,ppastos,pcereales,phortalizas,povejas, pjabalis, pvacas,
					plibres, pestablos, phabitaciones, ppersonas, pcartas, pmendigos, puntos);
			numScores++;
		}			
	}
	public void mostrarPorConsola()
	{
		System.out.println("Puntuaciones:");
		for(int i=0;i<numScores;i++)
		{
			
			System.out.println(scores[i].nombre+" "+scores[i].puntos);
		}
	}
	
	public String getCadena()
	{
		String c="";
		for (int i=0;i<numScores;i++)
		{
			c+=scores[i].nombre;
			c+="\n";
			c+=scores[i].puntos;
			c+="\n";
		}
		return c;
	}
	public String getJugador(int pos)
	{
		String resultado="";
		String n=scores[pos].nombre;
		String p=Integer.toString(scores[pos].puntos);
		resultado=n+" "+p;
		return resultado;
	}
	public String getPuntos(int pos)
	{		
		return Integer.toString(scores[pos].puntos);		
	}
	
	public String getCampos(int pos)
	{		
		return Integer.toString(scores[pos].pcampos);		
	}
	
	public String getNombre(int pos)	
	{		
		return scores[pos].nombre;		
	}
	public CharSequence getPastos(int pos) {
		// TODO Auto-generated method stub
		return Integer.toString(scores[pos].ppastos);
	}
	
	public String getCereales(int pos)
	{		
		return Integer.toString(scores[pos].pcereales);		
	}
	
	public String getHortalizas(int pos)
	{		
		return Integer.toString(scores[pos].phortalizas);		
	}
	
	public String getOvejas(int pos)
	{		
		return Integer.toString(scores[pos].povejas);		
	}
	
	public String getJabalis(int pos)
	{		
		return Integer.toString(scores[pos].pjabalis);		
	}
	
	public String getVacas(int pos)
	{		
		return Integer.toString(scores[pos].pvacas);		
	}
	
	public String getLibres(int pos)
	{		
		return Integer.toString(scores[pos].plibres);		
	}
	
	public String getEstablos(int pos)
	{		
		return Integer.toString(scores[pos].pestablos);		
	}
	
	public String getHabitaciones(int pos)
	{		
		return Integer.toString(scores[pos].phabitaciones);		
	}
	
	public String getPersonas(int pos)
	{		
		return Integer.toString(scores[pos].ppersonas);		
	}
	
	public String getCartas(int pos)
	{		
		return Integer.toString(scores[pos].pcartas);		
	}
	
	public String getMendigos(int pos)
	{		
		return Integer.toString(scores[pos].pmendigos);		
	}
	
}
