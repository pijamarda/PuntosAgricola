package com.zeneke;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class PuntosAgricola extends Activity 
{
	String maderas;
    String adobes;
    String juncos;
    public static final String ARCHIVO_RANKING = "ranking";
    boolean hogar=false;
    boolean cocina=false;
    boolean pozo=false;
    boolean hornoPiedra=false;
    boolean hornoAdobe=false;
    boolean ebanisteria=false;
    boolean alfareria=false;
    boolean cesteria=false;
    String tipo_habitacion;
    int puntos;
    int numHabitaciones=2;
    int povejas=-1;
    int pjabalis=-1;
    int pvacas=-1;
    int pcereales=-1;
    int phortalizas=-1;
    int ppastos=-1;
    int pcampos=-1;
    int plibres=0;
    int ppersonas=6;
    int pmendigos=0;
    int phabitaciones=0;
    int pestablos=0;
    int pcartas=0;
    public static PuntosAgricolaScore ranking;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        actualizarPuntos();
        //inicializarFichero();
        ranking = new PuntosAgricolaScore();
        final Button botonCalcularCartas = (Button)findViewById(R.id.botonCalcularCartas);
        final Button bovejas0 = (Button)findViewById(R.id.bovejas0);
        final Button bovejas13 = (Button)findViewById(R.id.bovejas13);
        final Button bovejas45 = (Button)findViewById(R.id.bovejas45);
        final Button bovejas67 = (Button)findViewById(R.id.bovejas67);
        final Button bovejas8 = (Button)findViewById(R.id.bovejas8);
        final Button bjabalis0 = (Button)findViewById(R.id.bjabalis0);
        final Button bjabalis12 = (Button)findViewById(R.id.bjabalis12);
        final Button bjabalis34 = (Button)findViewById(R.id.bjabalis34);
        final Button bjabalis56 = (Button)findViewById(R.id.bjabalis56);
        final Button bjabalis7 = (Button)findViewById(R.id.bjabalis7);
        final Button bvacas0 = (Button)findViewById(R.id.bvacas0);
        final Button bvacas1 = (Button)findViewById(R.id.bvacas1);
        final Button bvacas23 = (Button)findViewById(R.id.bvacas23);
        final Button bvacas45 = (Button)findViewById(R.id.bvacas45);
        final Button bvacas6 = (Button)findViewById(R.id.bvacas6);
        final Button bcereales0 = (Button)findViewById(R.id.bcereales0);
        final Button bcereales13 = (Button)findViewById(R.id.bcereales13);
        final Button bcereales45 = (Button)findViewById(R.id.bcereales45);
        final Button bcereales67 = (Button)findViewById(R.id.bcereales67);
        final Button bcereales8 = (Button)findViewById(R.id.bcereales8);
        final Button bhortalizas0 = (Button)findViewById(R.id.bhortalizas0);
        final Button bhortalizas1 = (Button)findViewById(R.id.bhortalizas1);
        final Button bhortalizas2 = (Button)findViewById(R.id.bhortalizas2);
        final Button bhortalizas3 = (Button)findViewById(R.id.bhortalizas3);
        final Button bhortalizas4 = (Button)findViewById(R.id.bhortalizas4);
        final Button bcampos01 = (Button)findViewById(R.id.bcampos01);
        final Button bcampos2 = (Button)findViewById(R.id.bcampos2);
        final Button bcampos3 = (Button)findViewById(R.id.bcampos3);
        final Button bcampos4 = (Button)findViewById(R.id.bcampos4);
        final Button bcampos5 = (Button)findViewById(R.id.bcampos5);
        final Button bpastos0 = (Button)findViewById(R.id.bpastos0);
        final Button bpastos1 = (Button)findViewById(R.id.bpastos1);
        final Button bpastos2 = (Button)findViewById(R.id.bpastos2);
        final Button bpastos3 = (Button)findViewById(R.id.bpastos3);
        final Button bpastos4 = (Button)findViewById(R.id.bpastos4);
        final Button blibres0 = (Button)findViewById(R.id.blibres0);
        final Button blibres1 = (Button)findViewById(R.id.blibres1);
        final Button blibres2 = (Button)findViewById(R.id.blibres2);
        final Button blibres3 = (Button)findViewById(R.id.blibres3);
        final Button blibres4 = (Button)findViewById(R.id.blibres4);
        final Button blibres5 = (Button)findViewById(R.id.blibres5);
        final Button blibres6 = (Button)findViewById(R.id.blibres6);
        final Button blibres7 = (Button)findViewById(R.id.blibres7);
        final Button blibres8 = (Button)findViewById(R.id.blibres8);
        final Button bpersonas2 = (Button)findViewById(R.id.bpersonas2);
        final Button bpersonas3 = (Button)findViewById(R.id.bpersonas3);
        final Button bpersonas4 = (Button)findViewById(R.id.bpersonas4);
        final Button bpersonas5 = (Button)findViewById(R.id.bpersonas5);
        final Button bmendigos0 = (Button)findViewById(R.id.bmendigos0);
        final Button bmendigos1 = (Button)findViewById(R.id.bmendigos1);
        final Button bmendigos2 = (Button)findViewById(R.id.bmendigos2);
        final Button bmendigos3 = (Button)findViewById(R.id.bmendigos3);
        final Button bmendigos4 = (Button)findViewById(R.id.bmendigos4);
        final Button bhabitaciones2 = (Button)findViewById(R.id.bhabitaciones2);
        final Button bhabitaciones3 = (Button)findViewById(R.id.bhabitaciones3);
        final Button bhabitaciones4 = (Button)findViewById(R.id.bhabitaciones4);
        final Button bhabitaciones5 = (Button)findViewById(R.id.bhabitaciones5);
        final Button bestablos0 = (Button)findViewById(R.id.bestablos0);
        final Button bestablos1 = (Button)findViewById(R.id.bestablos1);
        final Button bestablos2 = (Button)findViewById(R.id.bestablos2);
        final Button bestablos3 = (Button)findViewById(R.id.bestablos3);
        final Button bestablos4 = (Button)findViewById(R.id.bestablos4);
        final Button bestablos5 = (Button)findViewById(R.id.bestablos5);
        
        final Button branking = (Button)findViewById(R.id.branking);
        final Button bcerrar = (Button)findViewById(R.id.bcerrar);
        
        
        branking.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		guardarFichero();
	    		Intent intent = new Intent(PuntosAgricola.this, FrameRanking.class);
	    		
	    		startActivity(intent);	     		
	    	}
	    });
        
        final Button bguardar = (Button)findViewById(R.id.bguardar);
        
        bguardar.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		agregarNombre();					    		
	    	}
	    });
        
        
        
        
	    Spinner spinner = (Spinner) findViewById(R.id.elegir_habs);
	    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
	            this, R.array.lista_habitaciones, android.R.layout.simple_spinner_item);
	    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	    spinner.setAdapter(adapter);
	    spinner.setOnItemSelectedListener(new MyOnItemSelectedListener());

        
	    bovejas0.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		povejas=-1;
	    		actualizarPuntos();
	    		bovejas0.setEnabled(false);	    		
	    		bovejas13.setEnabled(true);
	    		bovejas45.setEnabled(true);
	    		bovejas67.setEnabled(true);
	    		bovejas8.setEnabled(true);	    		
	    	}
	    });
	    bovejas13.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		povejas=1;
	    		actualizarPuntos();
	    		bovejas0.setEnabled(true);
	    		bovejas13.setEnabled(false);
	    		bovejas45.setEnabled(true);
	    		bovejas67.setEnabled(true);
	    		bovejas8.setEnabled(true);	    		
	    	}
	    });
	    bovejas45.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		povejas=2;
	    		actualizarPuntos();
	    		bovejas0.setEnabled(true);
	    		bovejas13.setEnabled(true);
	    		bovejas45.setEnabled(false);
	    		bovejas67.setEnabled(true);
	    		bovejas8.setEnabled(true);	    		
	    	}
	    });
	    bovejas67.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		povejas=3;
	    		actualizarPuntos();
	    		bovejas0.setEnabled(true);
	    		bovejas13.setEnabled(true);
	    		bovejas45.setEnabled(true);
	    		bovejas67.setEnabled(false);
	    		bovejas8.setEnabled(true);	    		
	    	}
	    });
	    bovejas8.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		povejas=4;
	    		actualizarPuntos();
	    		bovejas0.setEnabled(true);
	    		bovejas13.setEnabled(true);
	    		bovejas45.setEnabled(true);
	    		bovejas67.setEnabled(true);
	    		bovejas8.setEnabled(false);	    		
	    	}
	    });
	    
	    //jabalis
	    
	    bjabalis0.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		pjabalis=-1;
	    		actualizarPuntos();
	    		bjabalis0.setEnabled(false);	    		
	    		bjabalis12.setEnabled(true);
	    		bjabalis34.setEnabled(true);
	    		bjabalis56.setEnabled(true);
	    		bjabalis7.setEnabled(true);	    		
	    	}
	    });
	    bjabalis12.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		pjabalis=1;
	    		actualizarPuntos();
	    		bjabalis0.setEnabled(true);	    		
	    		bjabalis12.setEnabled(false);
	    		bjabalis34.setEnabled(true);
	    		bjabalis56.setEnabled(true);
	    		bjabalis7.setEnabled(true);	    		
	    	}
	    });
	    bjabalis34.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		pjabalis=2;
	    		actualizarPuntos();
	    		bjabalis0.setEnabled(true);	    		
	    		bjabalis12.setEnabled(true);
	    		bjabalis34.setEnabled(false);
	    		bjabalis56.setEnabled(true);
	    		bjabalis7.setEnabled(true);	    		
	    	}
	    });
	    bjabalis56.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		pjabalis=3;
	    		actualizarPuntos();
	    		bjabalis0.setEnabled(true);	    		
	    		bjabalis12.setEnabled(true);
	    		bjabalis34.setEnabled(true);
	    		bjabalis56.setEnabled(false);
	    		bjabalis7.setEnabled(true);	    		
	    	}
	    });
	    bjabalis7.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		pjabalis=4;
	    		actualizarPuntos();
	    		bjabalis0.setEnabled(true);	    		
	    		bjabalis12.setEnabled(true);
	    		bjabalis34.setEnabled(true);
	    		bjabalis56.setEnabled(true);
	    		bjabalis7.setEnabled(false);	    		
	    	}
	    });
	    
	    //vacas
	    
	    bvacas0.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		pvacas=-1;
	    		actualizarPuntos();
	    		bvacas0.setEnabled(false);	    		
	    		bvacas1.setEnabled(true);
	    		bvacas23.setEnabled(true);
	    		bvacas45.setEnabled(true);
	    		bvacas6.setEnabled(true);	    		
	    	}
	    });
	    bvacas1.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		pvacas=1;
	    		actualizarPuntos();
	    		bvacas0.setEnabled(true);	    		
	    		bvacas1.setEnabled(false);
	    		bvacas23.setEnabled(true);
	    		bvacas45.setEnabled(true);
	    		bvacas6.setEnabled(true);	    		
	    	}
	    });
	    bvacas23.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		pvacas=2;
	    		actualizarPuntos();
	    		bvacas0.setEnabled(true);	    		
	    		bvacas1.setEnabled(true);
	    		bvacas23.setEnabled(false);
	    		bvacas45.setEnabled(true);
	    		bvacas6.setEnabled(true);	    		
	    	}
	    });
	    bvacas45.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		pvacas=3;
	    		actualizarPuntos();
	    		bvacas0.setEnabled(true);	    		
	    		bvacas1.setEnabled(true);
	    		bvacas23.setEnabled(true);
	    		bvacas45.setEnabled(false);
	    		bvacas6.setEnabled(true);	    		
	    	}
	    });
	    bvacas6.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		pvacas=4;
	    		actualizarPuntos();
	    		bvacas0.setEnabled(true);	    		
	    		bvacas1.setEnabled(true);
	    		bvacas23.setEnabled(true);
	    		bvacas45.setEnabled(true);
	    		bvacas6.setEnabled(false);	    		
	    	}
	    });
	    
	    //cereales
	    
	    bcereales0.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		pcereales=-1;
	    		actualizarPuntos();
	    		bcereales0.setEnabled(false);	    		
	    		bcereales13.setEnabled(true);
	    		bcereales45.setEnabled(true);
	    		bcereales67.setEnabled(true);
	    		bcereales8.setEnabled(true);	    		
	    	}
	    });
	    bcereales13.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		pcereales=1;
	    		actualizarPuntos();
	    		bcereales0.setEnabled(true);
	    		bcereales13.setEnabled(false);
	    		bcereales45.setEnabled(true);
	    		bcereales67.setEnabled(true);
	    		bcereales8.setEnabled(true);	    		
	    	}
	    });
	    bcereales45.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		pcereales=2;
	    		actualizarPuntos();
	    		bcereales0.setEnabled(true);
	    		bcereales13.setEnabled(true);
	    		bcereales45.setEnabled(false);
	    		bcereales67.setEnabled(true);
	    		bcereales8.setEnabled(true);	    		
	    	}
	    });
	    bcereales67.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		pcereales=3;
	    		actualizarPuntos();
	    		bcereales0.setEnabled(true);
	    		bcereales13.setEnabled(true);
	    		bcereales45.setEnabled(true);
	    		bcereales67.setEnabled(false);
	    		bcereales8.setEnabled(true);	    		
	    	}
	    });
	    bcereales8.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		pcereales=4;
	    		actualizarPuntos();
	    		bcereales0.setEnabled(true);
	    		bcereales13.setEnabled(true);
	    		bcereales45.setEnabled(true);
	    		bcereales67.setEnabled(true);
	    		bcereales8.setEnabled(false);	    		
	    	}
	    });
	    
	    //hortalizas
	    
	    bhortalizas0.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		phortalizas=-1;
	    		actualizarPuntos();
	    		bhortalizas0.setEnabled(false);	    		
	    		bhortalizas1.setEnabled(true);
	    		bhortalizas2.setEnabled(true);
	    		bhortalizas3.setEnabled(true);
	    		bhortalizas4.setEnabled(true);	    		
	    	}
	    });
	    bhortalizas1.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		phortalizas=1;
	    		actualizarPuntos();
	    		bhortalizas0.setEnabled(true);	    		
	    		bhortalizas1.setEnabled(false);
	    		bhortalizas2.setEnabled(true);
	    		bhortalizas3.setEnabled(true);
	    		bhortalizas4.setEnabled(true);	    		
	    	}
	    });
	    bhortalizas2.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		phortalizas=2;
	    		actualizarPuntos();
	    		bhortalizas0.setEnabled(true);	    		
	    		bhortalizas1.setEnabled(true);
	    		bhortalizas2.setEnabled(false);
	    		bhortalizas3.setEnabled(true);
	    		bhortalizas4.setEnabled(true);	    		
	    	}
	    });
	    bhortalizas3.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		phortalizas=3;
	    		actualizarPuntos();
	    		bhortalizas0.setEnabled(true);	    		
	    		bhortalizas1.setEnabled(true);
	    		bhortalizas2.setEnabled(true);
	    		bhortalizas3.setEnabled(false);
	    		bhortalizas4.setEnabled(true);	    		
	    	}
	    });
	    bhortalizas4.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		phortalizas=4;
	    		actualizarPuntos();
	    		bhortalizas0.setEnabled(true);	    		
	    		bhortalizas1.setEnabled(true);
	    		bhortalizas2.setEnabled(true);
	    		bhortalizas3.setEnabled(true);
	    		bhortalizas4.setEnabled(false);	    		
	    	}
	    });
	    
	    //campos
	    
	    bcampos01.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		pcampos=-1;
	    		actualizarPuntos();
	    		bcampos01.setEnabled(false);	    		
	    		bcampos2.setEnabled(true);
	    		bcampos3.setEnabled(true);
	    		bcampos4.setEnabled(true);
	    		bcampos5.setEnabled(true);	    		
	    	}
	    });
	    bcampos2.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		pcampos=1;
	    		actualizarPuntos();
	    		bcampos01.setEnabled(true);	    		
	    		bcampos2.setEnabled(false);
	    		bcampos3.setEnabled(true);
	    		bcampos4.setEnabled(true);
	    		bcampos5.setEnabled(true);	    		
	    	}
	    });
	    bcampos3.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		pcampos=2;
	    		actualizarPuntos();
	    		bcampos01.setEnabled(true);	    		
	    		bcampos2.setEnabled(true);
	    		bcampos3.setEnabled(false);
	    		bcampos4.setEnabled(true);
	    		bcampos5.setEnabled(true);	    		
	    	}
	    });
	    bcampos4.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		pcampos=3;
	    		actualizarPuntos();
	    		bcampos01.setEnabled(true);	    		
	    		bcampos2.setEnabled(true);
	    		bcampos3.setEnabled(true);
	    		bcampos4.setEnabled(false);
	    		bcampos5.setEnabled(true);	    		
	    	}
	    });
	    bcampos5.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		pcampos=4;
	    		actualizarPuntos();
	    		bcampos01.setEnabled(true);	    		
	    		bcampos2.setEnabled(true);
	    		bcampos3.setEnabled(true);
	    		bcampos4.setEnabled(true);
	    		bcampos5.setEnabled(false);	    		
	    	}
	    });
	    
	    //pastos
	    
	    bpastos0.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		ppastos=-1;
	    		actualizarPuntos();
	    		bpastos0.setEnabled(false);	    		
	    		bpastos1.setEnabled(true);
	    		bpastos2.setEnabled(true);
	    		bpastos3.setEnabled(true);
	    		bpastos4.setEnabled(true);	    		
	    	}
	    });
	    bpastos1.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		ppastos=1;
	    		actualizarPuntos();
	    		bpastos0.setEnabled(true);	    		
	    		bpastos1.setEnabled(false);
	    		bpastos2.setEnabled(true);
	    		bpastos3.setEnabled(true);
	    		bpastos4.setEnabled(true);	    		
	    	}
	    });
	    bpastos2.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		ppastos=2;
	    		actualizarPuntos();
	    		bpastos0.setEnabled(true);	    		
	    		bpastos1.setEnabled(true);
	    		bpastos2.setEnabled(false);
	    		bpastos3.setEnabled(true);
	    		bpastos4.setEnabled(true);	    		
	    	}
	    });
	    bpastos3.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		ppastos=3;
	    		actualizarPuntos();
	    		bpastos0.setEnabled(true);	    		
	    		bpastos1.setEnabled(true);
	    		bpastos2.setEnabled(true);
	    		bpastos3.setEnabled(false);
	    		bpastos4.setEnabled(true);	    		
	    	}
	    });
	    bpastos4.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		ppastos=4;
	    		actualizarPuntos();
	    		bpastos0.setEnabled(true);	    		
	    		bpastos1.setEnabled(true);
	    		bpastos2.setEnabled(true);
	    		bpastos3.setEnabled(true);
	    		bpastos4.setEnabled(false);	    		
	    	}
	    });	    
	    
	    //libres
	    
	    blibres0.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		plibres=0;
	    		actualizarPuntos();
	    		blibres0.setEnabled(false);	    		
	    		blibres1.setEnabled(true);
	    		blibres2.setEnabled(true);
	    		blibres3.setEnabled(true);
	    		blibres4.setEnabled(true);	    		
	    		blibres5.setEnabled(true);
	    		blibres6.setEnabled(true);
	    		blibres7.setEnabled(true);
	    		blibres8.setEnabled(true);
	    	}
	    });
	    blibres1.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		plibres=-1;
	    		actualizarPuntos();
	    		blibres0.setEnabled(true);	    		
	    		blibres1.setEnabled(false);
	    		blibres2.setEnabled(true);
	    		blibres3.setEnabled(true);
	    		blibres4.setEnabled(true);	    		
	    		blibres5.setEnabled(true);
	    		blibres6.setEnabled(true);
	    		blibres7.setEnabled(true);
	    		blibres8.setEnabled(true);
	    	}
	    });	
	    blibres2.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		plibres=-2;
	    		actualizarPuntos();
	    		blibres0.setEnabled(true);	    		
	    		blibres1.setEnabled(true);
	    		blibres2.setEnabled(false);
	    		blibres3.setEnabled(true);
	    		blibres4.setEnabled(true);	    		
	    		blibres5.setEnabled(true);
	    		blibres6.setEnabled(true);
	    		blibres7.setEnabled(true);
	    		blibres8.setEnabled(true);
	    	}
	    });	
	    blibres3.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		plibres=-3;
	    		actualizarPuntos();
	    		blibres0.setEnabled(true);	    		
	    		blibres1.setEnabled(true);
	    		blibres2.setEnabled(true);
	    		blibres3.setEnabled(false);
	    		blibres4.setEnabled(true);	    		
	    		blibres5.setEnabled(true);
	    		blibres6.setEnabled(true);
	    		blibres7.setEnabled(true);
	    		blibres8.setEnabled(true);
	    	}
	    });	
	    blibres4.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		plibres=-4;
	    		actualizarPuntos();
	    		blibres0.setEnabled(true);	    		
	    		blibres1.setEnabled(true);
	    		blibres2.setEnabled(true);
	    		blibres3.setEnabled(true);
	    		blibres4.setEnabled(false);	    		
	    		blibres5.setEnabled(true);
	    		blibres6.setEnabled(true);
	    		blibres7.setEnabled(true);
	    		blibres8.setEnabled(true);
	    	}
	    });	
	    blibres5.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		plibres=-5;
	    		actualizarPuntos();
	    		blibres0.setEnabled(true);	    		
	    		blibres1.setEnabled(true);
	    		blibres2.setEnabled(true);
	    		blibres3.setEnabled(true);
	    		blibres4.setEnabled(true);	    		
	    		blibres5.setEnabled(false);
	    		blibres6.setEnabled(true);
	    		blibres7.setEnabled(true);
	    		blibres8.setEnabled(true);
	    	}
	    });	
	    blibres6.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		plibres=-6;
	    		actualizarPuntos();
	    		blibres0.setEnabled(true);	    		
	    		blibres1.setEnabled(true);
	    		blibres2.setEnabled(true);
	    		blibres3.setEnabled(true);
	    		blibres4.setEnabled(true);	    		
	    		blibres5.setEnabled(true);
	    		blibres6.setEnabled(false);
	    		blibres7.setEnabled(true);
	    		blibres8.setEnabled(true);
	    	}
	    });	
	    blibres7.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		plibres=-7;
	    		actualizarPuntos();
	    		blibres0.setEnabled(true);	    		
	    		blibres1.setEnabled(true);
	    		blibres2.setEnabled(true);
	    		blibres3.setEnabled(true);
	    		blibres4.setEnabled(true);	    		
	    		blibres5.setEnabled(true);
	    		blibres6.setEnabled(true);
	    		blibres7.setEnabled(false);
	    		blibres8.setEnabled(true);
	    	}
	    });	
	    blibres8.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		plibres=-8;
	    		actualizarPuntos();
	    		blibres0.setEnabled(true);	    		
	    		blibres1.setEnabled(true);
	    		blibres2.setEnabled(true);
	    		blibres3.setEnabled(true);
	    		blibres4.setEnabled(true);	    		
	    		blibres5.setEnabled(true);
	    		blibres6.setEnabled(true);
	    		blibres7.setEnabled(true);
	    		blibres8.setEnabled(false);
	    	}
	    });
	    
	    //personas
	    
	    bpersonas2.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		ppersonas=6;
	    		actualizarPuntos();	    		
	    		bpersonas2.setEnabled(false);
	    		bpersonas3.setEnabled(true);
	    		bpersonas4.setEnabled(true);
	    		bpersonas5.setEnabled(true);
	    	}
	    });
	    bpersonas3.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		ppersonas=9;
	    		actualizarPuntos();	    		
	    		bpersonas2.setEnabled(true);
	    		bpersonas3.setEnabled(false);
	    		bpersonas4.setEnabled(true);
	    		bpersonas5.setEnabled(true);
	    	}
	    });
	    bpersonas4.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		ppersonas=12;
	    		actualizarPuntos();	    		
	    		bpersonas2.setEnabled(true);
	    		bpersonas3.setEnabled(true);
	    		bpersonas4.setEnabled(false);
	    		bpersonas5.setEnabled(true);
	    	}
	    });
	    bpersonas5.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		ppersonas=15;
	    		actualizarPuntos();	    		
	    		bpersonas2.setEnabled(true);
	    		bpersonas3.setEnabled(true);
	    		bpersonas4.setEnabled(true);
	    		bpersonas5.setEnabled(false);
	    	}
	    });
	    
	    //mendigos
	    
	    
	    bmendigos0.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		pmendigos=0;
	    		actualizarPuntos();
	    		bmendigos0.setEnabled(false);	    		
	    		bmendigos1.setEnabled(true);
	    		bmendigos2.setEnabled(true);
	    		bmendigos3.setEnabled(true);
	    		bmendigos4.setEnabled(true);	    		
	    	}
	    });
	    bmendigos1.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		pmendigos=-3;
	    		actualizarPuntos();
	    		bmendigos0.setEnabled(true);	    		
	    		bmendigos1.setEnabled(false);
	    		bmendigos2.setEnabled(true);
	    		bmendigos3.setEnabled(true);
	    		bmendigos4.setEnabled(true);	    		
	    	}
	    });
	    bmendigos2.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		pmendigos=-6;
	    		actualizarPuntos();
	    		bmendigos0.setEnabled(true);	    		
	    		bmendigos1.setEnabled(true);
	    		bmendigos2.setEnabled(false);
	    		bmendigos3.setEnabled(true);
	    		bmendigos4.setEnabled(true);	    		
	    	}
	    });
	    bmendigos3.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		pmendigos=-9;
	    		actualizarPuntos();
	    		bmendigos0.setEnabled(true);	    		
	    		bmendigos1.setEnabled(true);
	    		bmendigos2.setEnabled(true);
	    		bmendigos3.setEnabled(false);
	    		bmendigos4.setEnabled(true);	    		
	    	}
	    });
	    bmendigos4.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		pmendigos=-12;
	    		actualizarPuntos();
	    		bmendigos0.setEnabled(true);	    		
	    		bmendigos1.setEnabled(true);
	    		bmendigos2.setEnabled(true);
	    		bmendigos3.setEnabled(true);
	    		bmendigos4.setEnabled(false);	    		
	    	}
	    });
	    
	    //habitaciones
	    
	    bhabitaciones2.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		numHabitaciones=2;
	    		puntosHabitaciones();
	    		actualizarPuntos();	 	    		
	    		bhabitaciones2.setEnabled(false);
	    		bhabitaciones3.setEnabled(true);
	    		bhabitaciones4.setEnabled(true);
	    		bhabitaciones5.setEnabled(true);
	    	}
	    });
	    bhabitaciones3.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		numHabitaciones=3;
	    		puntosHabitaciones();
	    		actualizarPuntos();	 	    		
	    		bhabitaciones2.setEnabled(true);
	    		bhabitaciones3.setEnabled(false);
	    		bhabitaciones4.setEnabled(true);
	    		bhabitaciones5.setEnabled(true);
	    	}
	    });
	    bhabitaciones4.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		numHabitaciones=4;
	    		puntosHabitaciones();
	    		actualizarPuntos();	 	    		
	    		bhabitaciones2.setEnabled(true);
	    		bhabitaciones3.setEnabled(true);
	    		bhabitaciones4.setEnabled(false);
	    		bhabitaciones5.setEnabled(true);
	    	}
	    });
	    bhabitaciones5.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		numHabitaciones=5;
	    		puntosHabitaciones();
	    		actualizarPuntos();	    		
	    		bhabitaciones2.setEnabled(true);
	    		bhabitaciones3.setEnabled(true);
	    		bhabitaciones4.setEnabled(true);
	    		bhabitaciones5.setEnabled(false);
	    	}
	    });
	    
	    //establos
	    
	    bestablos0.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		pestablos=0;
	    		actualizarPuntos();
	    		bestablos0.setEnabled(false);	    		
	    		bestablos1.setEnabled(true);
	    		bestablos2.setEnabled(true);
	    		bestablos3.setEnabled(true);
	    		bestablos4.setEnabled(true);	
	    		bestablos5.setEnabled(true);
	    	}
	    });
	    bestablos1.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		pestablos=1;
	    		actualizarPuntos();
	    		bestablos0.setEnabled(true);	    		
	    		bestablos1.setEnabled(false);
	    		bestablos2.setEnabled(true);
	    		bestablos3.setEnabled(true);
	    		bestablos4.setEnabled(true);	
	    		bestablos5.setEnabled(true);
	    	}
	    });
	    bestablos2.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		pestablos=2;
	    		actualizarPuntos();
	    		bestablos0.setEnabled(true);	    		
	    		bestablos1.setEnabled(true);
	    		bestablos2.setEnabled(false);
	    		bestablos3.setEnabled(true);
	    		bestablos4.setEnabled(true);
	    		bestablos5.setEnabled(true);
	    	}
	    });
	    bestablos3.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		pestablos=3;
	    		actualizarPuntos();
	    		bestablos0.setEnabled(true);	    		
	    		bestablos1.setEnabled(true);
	    		bestablos2.setEnabled(true);
	    		bestablos3.setEnabled(false);
	    		bestablos4.setEnabled(true);
	    		bestablos5.setEnabled(true);
	    	}
	    });
	    bestablos4.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		pestablos=4;
	    		actualizarPuntos();
	    		bestablos0.setEnabled(true);	    		
	    		bestablos1.setEnabled(true);
	    		bestablos2.setEnabled(true);
	    		bestablos3.setEnabled(true);
	    		bestablos4.setEnabled(false);
	    		bestablos5.setEnabled(true);
	    	}
	    });
	    bestablos5.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		pestablos=5;
	    		actualizarPuntos();
	    		bestablos0.setEnabled(true);	    		
	    		bestablos1.setEnabled(true);
	    		bestablos2.setEnabled(true);
	    		bestablos3.setEnabled(true);
	    		bestablos4.setEnabled(true);
	    		bestablos5.setEnabled(false);	    		
	    	}
	    });
	    
	    botonCalcularCartas.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		Intent intent = new Intent(PuntosAgricola.this, PuntosCartas.class);
	    		final int result = 1;
	    		intent.putExtra("hogar", hogar);
	    		intent.putExtra("cocina", cocina);
	    		intent.putExtra("pozo", pozo);
	    		intent.putExtra("hornoPiedra", hornoPiedra);
	    		intent.putExtra("hornoAdobe", hornoAdobe);
	    		intent.putExtra("ebanisteria", ebanisteria);
	    		intent.putExtra("alfareria", alfareria);
	    		intent.putExtra("cesteria", cesteria);
	    		intent.putExtra("maderas", maderas);
	    		intent.putExtra("adobes", adobes);
	    		intent.putExtra("juncos", juncos);
	    		startActivityForResult(intent,result);
	    	}
	    });
	    
	    bcerrar.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		finish();    		
	    	}
	    });
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data)
    {
    	super.onActivityResult(requestCode, resultCode, data);
    	
    	if (resultCode == RESULT_OK)
    	{
    	hogar = data.getExtras().getBoolean("hogar");
    	cocina = data.getExtras().getBoolean("cocina");
    	pozo = data.getExtras().getBoolean("pozo");
    	hornoPiedra = data.getExtras().getBoolean("hornoPiedra");
    	hornoAdobe = data.getExtras().getBoolean("hornoAdobe");
    	ebanisteria = data.getExtras().getBoolean("ebanisteria");
    	alfareria = data.getExtras().getBoolean("alfareria");
    	cesteria = data.getExtras().getBoolean("cesteria");
    	maderas = data.getExtras().getString("maderas");
    	adobes = data.getStringExtra("adobes");
    	juncos = data.getStringExtra("juncos");
    	maderas = data.getExtras().getString("maderas");
    	
    	String txtPuntos=data.getStringExtra("puntos");
    	TextView puntosCartas = (TextView)findViewById(R.id.puntosCartas);
    	puntosCartas.setText(txtPuntos);
    	if (!txtPuntos.equals(""))
    		pcartas=Integer.parseInt(txtPuntos);
    	
    	actualizarPuntos();
    	}
    }
    
    public void actualizarPuntos()
    {
    	int tmp1,tmp2,tmp3;
    	tmp1=povejas+pjabalis+pvacas+pcereales+phortalizas;
    	tmp2=ppastos+pcampos+plibres+pestablos;
    	tmp3=ppersonas+pmendigos+phabitaciones+pcartas;
    	puntos=tmp1+tmp2+tmp3;
    	
    	TextView tpuntos = (TextView)findViewById(R.id.tpuntos);
		tpuntos.setText(Integer.toString(puntos));
    }
    
    public void puntosHabitaciones()
    {
    	if (tipo_habitacion.equals(getString(R.string.adobe)))
    		phabitaciones=numHabitaciones;
    	else if (tipo_habitacion.equals(getString(R.string.piedra)))
    		phabitaciones=numHabitaciones*2;
    	else phabitaciones=0;
    }
    
    public class MyOnItemSelectedListener implements OnItemSelectedListener {

        public void onItemSelected(AdapterView<?> parent,
            View view, int pos, long id) {
        	tipo_habitacion=parent.getItemAtPosition(pos).toString();
        	puntosHabitaciones();
        	actualizarPuntos();
        }

        public void onNothingSelected(AdapterView parent) {
          // Do nothing.
        }
    }
    
    public void inicializarFichero()
    {
    	
    	
		try 
		{
			InputStream instream = openFileInput(ARCHIVO_RANKING);			
			InputStreamReader inputreader = new InputStreamReader(instream);
			BufferedReader buffreader = new BufferedReader(inputreader);
			String linea;
			while ((linea=buffreader.readLine())!=null)
			{
				String nombre="";
				int puntos;
				boolean esNombre=true;
				if (esNombre)
					{nombre = linea; esNombre=false;}
				else 
				{
					puntos=Integer.parseInt(linea); 
					ranking.addScore(nombre,pcampos,ppastos,pcereales,phortalizas,povejas, pjabalis, pvacas,
						plibres, pestablos, phabitaciones, ppersonas, pcartas, pmendigos, puntos);
					esNombre=true;}
			}
				
			instream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    }
    
    public void agregarNombre()
    {
    	AlertDialog.Builder alert = new AlertDialog.Builder(this);
    	alert.setTitle(R.string.ranking);
    	alert.setMessage(R.string.nombre);
    	
    	final EditText input = new EditText(this);
    	alert.setView(input);
    	
    	alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {			
			@Override
			public void onClick(DialogInterface dialog, int wichButton) {
				// TODO Auto-generated method stub
				String value = input.getText().toString();
				ranking.addScore(value,pcampos,ppastos,pcereales,phortalizas,povejas, pjabalis, pvacas,
						plibres, pestablos, phabitaciones, ppersonas, pcartas, pmendigos, puntos);
			}
		});
    	
    	alert.setNegativeButton(R.string.cancelar, new DialogInterface.OnClickListener() {			
			@Override
			public void onClick(DialogInterface dialog, int wichButton) {
				// TODO Auto-generated method stub
				//cancelado
			}
		});
    	
    	alert.show();   	
    	
    }
    public void guardarFichero()
    {
		try 
		{
			
			String string = ranking.getCadena();

			FileOutputStream fos = openFileOutput(ARCHIVO_RANKING, Context.MODE_PRIVATE);
			fos.write(string.getBytes());
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    }
    
    

}