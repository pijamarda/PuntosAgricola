package com.zeneke;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class PuntosCartas extends Activity
{
	boolean hogar;
	boolean cocina;
	boolean pozo;
	boolean hornoPiedra;
	boolean hornoAdobe;
	boolean ebanisteria;
	boolean alfareria;
	boolean cesteria;
	String maderas,adobes,juncos;
	boolean pulsadoBoton;
	
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.puntoscartas);
		pulsadoBoton=false;
		final Button botonCartas = (Button)findViewById(R.id.botonCartas);
		Intent sender = getIntent();		
		hogar = sender.getExtras().getBoolean("hogar");
		CheckBox checkBox = (CheckBox)findViewById(R.id.checkBoxHogar);
		checkBox.setChecked(hogar);
		cocina = sender.getExtras().getBoolean("cocina");
		checkBox = (CheckBox)findViewById(R.id.checkBoxCocina);
		checkBox.setChecked(cocina);
		pozo = sender.getExtras().getBoolean("pozo");
		checkBox = (CheckBox)findViewById(R.id.checkBoxPozo);
		checkBox.setChecked(pozo);
		hornoPiedra = sender.getExtras().getBoolean("hornoPiedra");
		checkBox = (CheckBox)findViewById(R.id.checkBoxHornoPiedra);
		checkBox.setChecked(hornoPiedra);
		hornoAdobe = sender.getExtras().getBoolean("hornoAdobe");
		checkBox = (CheckBox)findViewById(R.id.checkBoxHornoAdobe);
		checkBox.setChecked(hornoAdobe);
		ebanisteria = sender.getExtras().getBoolean("ebanisteria");
		checkBox = (CheckBox)findViewById(R.id.checkBoxEbanisteria);
		checkBox.setChecked(ebanisteria);
		alfareria = sender.getExtras().getBoolean("alfareria");
		checkBox = (CheckBox)findViewById(R.id.checkBoxAlfareria);
		checkBox.setChecked(alfareria);
		cesteria = sender.getExtras().getBoolean("cesteria");
		checkBox = (CheckBox)findViewById(R.id.checkBoxCesteria);
		checkBox.setChecked(cesteria);
		maderas = sender.getExtras().getString("maderas");
		adobes = sender.getExtras().getString("adobes");
		juncos = sender.getExtras().getString("juncos");
		
		((TextView)findViewById(R.id.Txtmadera)).setText(maderas);
    	((TextView)findViewById(R.id.Txtadobe)).setText(adobes);
    	((TextView)findViewById(R.id.Txtjunco)).setText(juncos);
	    
	    botonCartas.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		int puntos = 0;
	    		CheckBox checkBox = (CheckBox) findViewById(R.id.checkBoxHogar);
	            if (hogar=checkBox.isChecked()) 
	            {
	                puntos++;
	                
	            }
	            checkBox = (CheckBox) findViewById(R.id.checkBoxCocina);
	            if (cocina=checkBox.isChecked()) 
	            {
	                puntos++;
	                
	            }
	            checkBox = (CheckBox) findViewById(R.id.checkBoxPozo);
	            if (pozo=checkBox.isChecked()) 
	            {
	                puntos+=4;
	                
	            }
	            checkBox = (CheckBox) findViewById(R.id.checkBoxHornoAdobe);
	            if (hornoAdobe=checkBox.isChecked()) 
	            {
	                puntos+=2;
	            }
	            checkBox = (CheckBox) findViewById(R.id.checkBoxHornoPiedra);
	            if (hornoPiedra=checkBox.isChecked()) 
	            {
	                puntos+=3;
	            }
	            checkBox = (CheckBox) findViewById(R.id.checkBoxEbanisteria);
	            if (ebanisteria=checkBox.isChecked()) 
	            {
	            	String maderas1 = ((TextView)findViewById(R.id.Txtmadera)).getText().toString();
	            	if (!maderas1.equals(""))
	            	{
		            	int madera = Integer.parseInt(maderas1);
		            	if (madera >= 7)
		            		puntos += 3;
		            	else if (madera>=5)
		            		puntos += 2;
		            	else if (madera>=3)
		            		puntos += 1;
	            	}
	            	puntos += 2;
	            }
	            checkBox = (CheckBox) findViewById(R.id.checkBoxAlfareria);
	            if (alfareria=checkBox.isChecked()) 
	            {
	            	String adobes1 = ((TextView)findViewById(R.id.Txtadobe)).getText().toString();
	            	if (!adobes1.equals(""))
	            	{
			    		int adobe = Integer.parseInt(adobes1);
		            	if (adobe >= 7)
		            		puntos += 3;
		            	else if (adobe>=5)
		            		puntos += 2;
		            	else if (adobe>=3)
		            		puntos += 1;           	
	            	}
	            	puntos += 2;
	            }
	            checkBox = (CheckBox) findViewById(R.id.checkBoxCesteria);
	            if (cesteria=checkBox.isChecked()) 
	            {
	            	String juncos1 = ((TextView)findViewById(R.id.Txtjunco)).getText().toString();
	            	if (!juncos1.equals(""))
	            	{
			    		int junco = Integer.parseInt(juncos1);
		            	if (junco >= 5)
		            		puntos += 3;
		            	else if (junco>=4)
		            		puntos += 2;
		            	else if (junco>=2)
		            		puntos += 1;           	
	            	}
	            	puntos += 2;
	            }
	    		
	            maderas = ((TextView)findViewById(R.id.Txtmadera)).getText().toString();
	            adobes = ((TextView)findViewById(R.id.Txtadobe)).getText().toString();
	            juncos = ((TextView)findViewById(R.id.Txtjunco)).getText().toString();
	            
	    		Intent intent = new Intent();	    		
	    		intent.putExtra("puntos", Integer.toString(puntos));
	    		intent.putExtra("hogar",hogar);
	    		intent.putExtra("cocina",cocina);
	    		intent.putExtra("pozo",pozo);
	    		intent.putExtra("hornoPiedra",hornoPiedra);
	    		intent.putExtra("hornoAdobe",hornoAdobe);
	    		intent.putExtra("ebanisteria",ebanisteria);
	    		intent.putExtra("alfareria",alfareria);
	    		intent.putExtra("cesteria",cesteria);
	    		intent.putExtra("maderas",maderas);
	    		intent.putExtra("adobes",adobes);
	    		intent.putExtra("juncos",juncos);
	    		setResult(RESULT_OK,intent);
	    		pulsadoBoton=true;
	    		finish();	    		
	    	}
	    });	
	}
	
	@Override
	public void onPause()
	{
		super.onPause();
		if (!pulsadoBoton)
			setResult(RESULT_CANCELED);
	}
	
	@Override
	public void onDestroy()
	{
		super.onDestroy();
		if (!pulsadoBoton)
			setResult(RESULT_CANCELED);
	}
}