package com.zeneke;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.SeekBar.OnSeekBarChangeListener;

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

    private SeekBar seekBarMadera;
    private SeekBar seekBarAdobe;
    private SeekBar seekBarJunco;
    private TextView txtPuntosMadera;
    private TextView txtPuntosAdobe;
    private TextView txtPuntosJunco;

    private int numMadera = 0;
    private int numAdobe = 0;
    private int numJunco = 0;

	
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

        numMadera = Integer.parseInt(maderas);
        numAdobe = Integer.parseInt(adobes);
        numJunco = Integer.parseInt(juncos);
		((TextView)findViewById(R.id.TxtPuntosMadera)).setText(maderas);
    	((TextView)findViewById(R.id.TxtPuntosAdobe)).setText(adobes);
    	((TextView)findViewById(R.id.TxtPuntosJunco)).setText(juncos);

        seekBarMadera = (SeekBar) findViewById(R.id.seekBarMadera);
        seekBarAdobe = (SeekBar) findViewById(R.id.seekBarAdobe);
        seekBarJunco = (SeekBar) findViewById(R.id.seekBarJunco);
        txtPuntosMadera = (TextView)findViewById(R.id.TxtPuntosMadera);
        txtPuntosAdobe = (TextView)findViewById(R.id.TxtPuntosAdobe);
        txtPuntosJunco = (TextView)findViewById(R.id.TxtPuntosJunco);

        seekBarMadera.setOnSeekBarChangeListener(
                new OnSeekBarChangeListener()
                {
                    int progress = 0;
                    @Override
                    public void onProgressChanged(SeekBar seekBar,
                                                  int progresValue, boolean fromUser) {
                        progress = progresValue;
                        txtPuntosMadera.setText(" "+progress+" m");
                        numMadera = progresValue;
                    }
                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        // if you want to do anything at the start of touching the seekbar
                    }
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }
                });

        seekBarAdobe.setOnSeekBarChangeListener(
                new OnSeekBarChangeListener()
                {
                    int progress = 0;
                    @Override
                    public void onProgressChanged(SeekBar seekBar,
                                                  int progresValue, boolean fromUser) {
                        progress = progresValue;
                        txtPuntosAdobe.setText(" "+progress+" a");
                        numAdobe = progresValue;
                    }
                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        // if you want to do anything at the start of touching the seekbar
                    }
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }
                });

        seekBarJunco.setOnSeekBarChangeListener(
                new OnSeekBarChangeListener()
                {
                    int progress = 0;
                    @Override
                    public void onProgressChanged(SeekBar seekBar,
                                                  int progresValue, boolean fromUser) {
                        progress = progresValue;
                        txtPuntosJunco.setText(" "+progress+" j");
                        numJunco = progresValue;
                    }
                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        // if you want to do anything at the start of touching the seekbar
                    }
                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                    }
                });




	    
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
	            	if (numMadera != 0)
	            	{
		            	if (numMadera >= 7)
		            		puntos += 3;
		            	else if (numMadera>=5)
		            		puntos += 2;
		            	else if (numMadera>=3)
		            		puntos += 1;
	            	}
	            	puntos += 2;
	            }
	            checkBox = (CheckBox) findViewById(R.id.checkBoxAlfareria);
	            if (alfareria=checkBox.isChecked()) 
	            {
	            	if (numAdobe != 0)
	            	{
		            	if (numAdobe >= 7)
		            		puntos += 3;
		            	else if (numAdobe>=5)
		            		puntos += 2;
		            	else if (numAdobe>=3)
		            		puntos += 1;           	
	            	}
	            	puntos += 2;
	            }
	            checkBox = (CheckBox) findViewById(R.id.checkBoxCesteria);
	            if (cesteria=checkBox.isChecked()) 
	            {
	            	if (numJunco != 0)
	            	{
		            	if (numJunco >= 5)
		            		puntos += 3;
		            	else if (numJunco>=4)
		            		puntos += 2;
		            	else if (numJunco>=2)
		            		puntos += 1;           	
	            	}
	            	puntos += 2;
	            }
	    		
	            maderas = Integer.toString(numMadera);
	            adobes = Integer.toString(numAdobe);
	            juncos = Integer.toString(numJunco);
	            
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