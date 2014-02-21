package com.zeneke;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ResumenPuntos extends Activity {
   

   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.resumenpuntos);
       int MAX_CHAR_NOMBRE = 4;
       LinearLayout rp = (LinearLayout) findViewById(R.id.resumenpuntos);
       PuntosAgricolaScore r = PuntosAgricola.ranking;
       for (int i=0;i<r.numScores;i++)
       {    	   
    	   if (i==0)
    	   {
	    	   String nombre = r.getNombre(i);
	    	   if (nombre.length()>MAX_CHAR_NOMBRE)
	    		   nombre = nombre.substring(0, MAX_CHAR_NOMBRE);
    		   ((TextView)findViewById(R.id.nombre1)).setText(nombre);
	    	   ((TextView)findViewById(R.id.campos1)).setText(r.getCampos(i));
	    	   ((TextView)findViewById(R.id.pastos1)).setText(r.getPastos(i));
	    	   ((TextView)findViewById(R.id.cereales1)).setText(r.getCereales(i));
	    	   ((TextView)findViewById(R.id.hortalizas1)).setText(r.getHortalizas(i));
	    	   ((TextView)findViewById(R.id.ovejas1)).setText(r.getOvejas(i));
	    	   ((TextView)findViewById(R.id.jabalis1)).setText(r.getJabalis(i));
	    	   ((TextView)findViewById(R.id.vacas1)).setText(r.getVacas(i));
	    	   ((TextView)findViewById(R.id.libres1)).setText(r.getLibres(i));
	    	   ((TextView)findViewById(R.id.establos1)).setText(r.getEstablos(i));
	    	   ((TextView)findViewById(R.id.habitaciones1)).setText(r.getHabitaciones(i));
	    	   ((TextView)findViewById(R.id.personas1)).setText(r.getPersonas(i));
	    	   ((TextView)findViewById(R.id.cartas1)).setText(r.getCartas(i));
	    	   ((TextView)findViewById(R.id.mendigos1)).setText(r.getMendigos(i));
	    	   ((TextView)findViewById(R.id.puntos1)).setText(r.getPuntos(i));
	    	   
    	   }
    	   
    	   if (i==1)
    	   {
	    	   String nombre = r.getNombre(i);
	    	   if (nombre.length()>MAX_CHAR_NOMBRE)
	    		   nombre = nombre.substring(0, MAX_CHAR_NOMBRE);
    		   ((TextView)findViewById(R.id.nombre2)).setText(nombre);
	    	   ((TextView)findViewById(R.id.campos2)).setText(r.getCampos(i));
	    	   ((TextView)findViewById(R.id.pastos2)).setText(r.getPastos(i));
	    	   ((TextView)findViewById(R.id.cereales2)).setText(r.getCereales(i));
	    	   ((TextView)findViewById(R.id.hortalizas2)).setText(r.getHortalizas(i));
	    	   ((TextView)findViewById(R.id.ovejas2)).setText(r.getOvejas(i));
	    	   ((TextView)findViewById(R.id.jabalis2)).setText(r.getJabalis(i));
	    	   ((TextView)findViewById(R.id.vacas2)).setText(r.getVacas(i));
	    	   ((TextView)findViewById(R.id.libres2)).setText(r.getLibres(i));
	    	   ((TextView)findViewById(R.id.establos2)).setText(r.getEstablos(i));
	    	   ((TextView)findViewById(R.id.habitaciones2)).setText(r.getHabitaciones(i));
	    	   ((TextView)findViewById(R.id.personas2)).setText(r.getPersonas(i));
	    	   ((TextView)findViewById(R.id.cartas2)).setText(r.getCartas(i));
	    	   ((TextView)findViewById(R.id.mendigos2)).setText(r.getMendigos(i));
	    	   ((TextView)findViewById(R.id.puntos2)).setText(r.getPuntos(i));
	    	   
    	   }
    	   
    	   if (i==2)
    	   {
	    	   String nombre = r.getNombre(i);
	    	   if (nombre.length()>MAX_CHAR_NOMBRE)
	    		   nombre = nombre.substring(0, MAX_CHAR_NOMBRE);
    		   ((TextView)findViewById(R.id.nombre3)).setText(nombre);
	    	   ((TextView)findViewById(R.id.campos3)).setText(r.getCampos(i));
	    	   ((TextView)findViewById(R.id.pastos3)).setText(r.getPastos(i));
	    	   ((TextView)findViewById(R.id.cereales3)).setText(r.getCereales(i));
	    	   ((TextView)findViewById(R.id.hortalizas3)).setText(r.getHortalizas(i));
	    	   ((TextView)findViewById(R.id.ovejas3)).setText(r.getOvejas(i));
	    	   ((TextView)findViewById(R.id.jabalis3)).setText(r.getJabalis(i));
	    	   ((TextView)findViewById(R.id.vacas3)).setText(r.getVacas(i));
	    	   ((TextView)findViewById(R.id.libres3)).setText(r.getLibres(i));
	    	   ((TextView)findViewById(R.id.establos3)).setText(r.getEstablos(i));
	    	   ((TextView)findViewById(R.id.habitaciones3)).setText(r.getHabitaciones(i));
	    	   ((TextView)findViewById(R.id.personas3)).setText(r.getPersonas(i));
	    	   ((TextView)findViewById(R.id.cartas3)).setText(r.getCartas(i));
	    	   ((TextView)findViewById(R.id.mendigos3)).setText(r.getMendigos(i));
	    	   ((TextView)findViewById(R.id.puntos3)).setText(r.getPuntos(i));
	    	   
    	   }
    	   
    	   if (i==3)
    	   {
	    	   String nombre = r.getNombre(i);
	    	   if (nombre.length()>MAX_CHAR_NOMBRE)
	    		   nombre = nombre.substring(0, MAX_CHAR_NOMBRE);
    		   ((TextView)findViewById(R.id.nombre4)).setText(nombre);
	    	   ((TextView)findViewById(R.id.campos4)).setText(r.getCampos(i));
	    	   ((TextView)findViewById(R.id.pastos4)).setText(r.getPastos(i));
	    	   ((TextView)findViewById(R.id.cereales4)).setText(r.getCereales(i));
	    	   ((TextView)findViewById(R.id.hortalizas4)).setText(r.getHortalizas(i));
	    	   ((TextView)findViewById(R.id.ovejas4)).setText(r.getOvejas(i));
	    	   ((TextView)findViewById(R.id.jabalis4)).setText(r.getJabalis(i));
	    	   ((TextView)findViewById(R.id.vacas4)).setText(r.getVacas(i));
	    	   ((TextView)findViewById(R.id.libres4)).setText(r.getLibres(i));
	    	   ((TextView)findViewById(R.id.establos4)).setText(r.getEstablos(i));
	    	   ((TextView)findViewById(R.id.habitaciones4)).setText(r.getHabitaciones(i));
	    	   ((TextView)findViewById(R.id.personas4)).setText(r.getPersonas(i));
	    	   ((TextView)findViewById(R.id.cartas4)).setText(r.getCartas(i));
	    	   ((TextView)findViewById(R.id.mendigos4)).setText(r.getMendigos(i));
	    	   ((TextView)findViewById(R.id.puntos4)).setText(r.getPuntos(i));
	    	   
    	   }
    	   
    	   if (i==4)
    	   {
	    	   String nombre = r.getNombre(i);
	    	   if (nombre.length()>MAX_CHAR_NOMBRE)
	    		   nombre = nombre.substring(0, MAX_CHAR_NOMBRE);
    		   ((TextView)findViewById(R.id.nombre5)).setText(nombre);
	    	   ((TextView)findViewById(R.id.campos5)).setText(r.getCampos(i));
	    	   ((TextView)findViewById(R.id.pastos5)).setText(r.getPastos(i));
	    	   ((TextView)findViewById(R.id.cereales5)).setText(r.getCereales(i));
	    	   ((TextView)findViewById(R.id.hortalizas5)).setText(r.getHortalizas(i));
	    	   ((TextView)findViewById(R.id.ovejas5)).setText(r.getOvejas(i));
	    	   ((TextView)findViewById(R.id.jabalis5)).setText(r.getJabalis(i));
	    	   ((TextView)findViewById(R.id.vacas5)).setText(r.getVacas(i));
	    	   ((TextView)findViewById(R.id.libres5)).setText(r.getLibres(i));
	    	   ((TextView)findViewById(R.id.establos5)).setText(r.getEstablos(i));
	    	   ((TextView)findViewById(R.id.habitaciones5)).setText(r.getHabitaciones(i));
	    	   ((TextView)findViewById(R.id.personas5)).setText(r.getPersonas(i));
	    	   ((TextView)findViewById(R.id.cartas5)).setText(r.getCartas(i));
	    	   ((TextView)findViewById(R.id.mendigos5)).setText(r.getMendigos(i));
	    	   ((TextView)findViewById(R.id.puntos5)).setText(r.getPuntos(i));
	    	   
    	   }
       }
       
       Button bsalir = new Button(this);
       bsalir.setText(R.string.salir);
       bsalir.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		finish();	    		
	    	}
	    });
       
       rp.addView(bsalir);
   }
}