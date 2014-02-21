package com.zeneke;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FrameRanking extends Activity {
   
//probando github
/** Called when the activity is first created. */
	public static final int ANCHO=20;
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.frameranking);
       LinearLayout layout = (LinearLayout) findViewById(R.id.ranking);
       TextView t = new TextView(this);
       t.setText(R.string.tituloRanking);
       t.setBackgroundColor(Color.MAGENTA);
       t.setTextColor(Color.BLACK);
       t.setTextSize(TypedValue.COMPLEX_UNIT_SP,18);
       layout.addView(t);
       PuntosAgricolaScore r = PuntosAgricola.ranking;       
       for (int i=0;i<r.numScores;i++)
       {
    	   LinearLayout ll = new LinearLayout(this);
    	   ll.setOrientation(LinearLayout.HORIZONTAL);
    	   
    	   TextView t1 = new TextView(this);
    	   t1.setWidth(150);
    	   t1.setTextColor(Color.WHITE);
    	   t1.setText(r.getNombre(i));
    	   TextView t2 = new TextView(this);
    	   t2.setWidth(15);
    	   t2.setText("");
    	   TextView t3 = new TextView(this);
    	   t3.setWidth(50);
    	   t3.setTextColor(Color.WHITE);
    	   t3.setText(r.getPuntos(i));
    	   ll.addView(t1);
    	   ll.addView(t2);
    	   ll.addView(t3);
           layout.addView(ll);
       }
       Button b = new Button(this);
       b.setText(R.string.salir);
       b.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		finish();	    		
	    	}
	    });
       
       Button bresumen = new Button(this);
       bresumen.setText(R.string.resumen_puntos_texto);
       bresumen.setOnClickListener(new OnClickListener() {
	    	@Override
	    	public void onClick(View arg0)
	    	{
	    		Intent intent = new Intent(FrameRanking.this, ResumenPuntos.class);	    		
	    		startActivity(intent);
	    	}
	    });
       
       layout.addView(bresumen);
       layout.addView(b);
       
       
       
   }
}
