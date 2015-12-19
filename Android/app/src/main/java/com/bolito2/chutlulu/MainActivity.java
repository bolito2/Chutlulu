package com.bolito2.chutlulu;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mySound, chut, normal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        mySound = MediaPlayer.create(this, R.raw.bienvenida);
        chut = MediaPlayer.create(this, R.raw.chut);
        normal = MediaPlayer.create(this, R.raw.normal);
        mySound.start();
        EditText texto = (EditText) findViewById(R.id.resultado);
        texto.setKeyListener(null);
        Button normalachut = (Button)findViewById(R.id.button);
        Button chutanormal = (Button)findViewById(R.id.button2);
        final Button borrarLista = (Button)findViewById(R.id.button3);
        borrarLista.setOnClickListener(new OnClickListener()
        {
            @Override
        public void onClick(View v)
            {
                EditText caja = (EditText) findViewById(R.id.input);
                caja.setText("");
          }
        });

        normalachut.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v)
            {
                EditText caja = (EditText) findViewById(R.id.input);
                String inputString = caja.getText().toString();

                char[] chutlulu = new char[] {'c' , 'h' , 'u','t','l','u','l','u'};
                char[] mensaje = inputString.toCharArray();
                int[] mensajeINT = new int[mensaje.length];
                int contadorCHUT = 0;

                for(int i = 0; i < mensaje.length; i++)
                {
                    Log.d("log81", String.valueOf(Math.round( Math.log10 (Math.pow(mensaje.length, 4.0)))));
                    mensajeINT[i] = (int) (Math.cos((mensaje.length - (i + 1)) * Math.PI)*3 +lepraANumero(mensaje[i]) + Math.round(Math.log10 (Math.pow(i + 1, 4.0))) + chutlulu[contadorCHUT] *69);

                    while(mensajeINT[i] > 1032){
                        mensajeINT[i] -= 1033;
                    }

                    while(mensajeINT[i] < 0){
                        mensajeINT[i] += 1033;
                    }
                        if (contadorCHUT == 7) {
                            contadorCHUT = 0;
                        } else {
                            contadorCHUT++;
                        }

                        mensaje[i] = numeroALepra(mensajeINT[i]);
                    }
                    EditText texto = (EditText) findViewById(R.id.resultado);
                    texto.setKeyListener(null);
                    texto.setText(String.valueOf(mensaje));
                    ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                    ClipData clip = ClipData.newPlainText("chutlulu translation", String.valueOf(mensaje));
                    Toast toast = Toast.makeText(getApplicationContext(), "Texto copiado a portapapeles", Toast.LENGTH_SHORT);
                    chut.start();
                    toast.show();
                    clipboard.setPrimaryClip(clip);

            }
        });

        chutanormal.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v)
            {
                EditText caja = (EditText) findViewById(R.id.input);
                String inputString = caja.getText().toString();

                char[] chutlulu = new char[] {'c' , 'h' , 'u','t','l','u','l','u'};
                char[] mensaje = inputString.toCharArray();
                int[] mensajeINT = new int[mensaje.length];
                int contadorCHUT = 0;

                for(int i = 0; i < mensaje.length; i++)
                {
                        mensajeINT[i] =(int) ( - Math.cos(( mensaje.length - (i + 1)) * Math.PI)*3 + lepraANumero(mensaje[i]) - Math.round(Math.log10(Math.pow(i + 1, 4.0))) - chutlulu[contadorCHUT] * 69);

                    while(mensajeINT[i] > 1032){
                        mensajeINT[i] -= 1033;
                    }

                    while(mensajeINT[i] < 0){
                        mensajeINT[i] += 1033;
                    }

                        Log.d("mensaje", String.valueOf(mensajeINT[i]));
                        if (contadorCHUT == 7) {
                            contadorCHUT = 0;
                        } else {
                            contadorCHUT++;
                        }
                        Log.d("lepra", String.valueOf(numeroALepra(mensajeINT[i])));
                        mensaje[i] = numeroALepra(mensajeINT[i]);

                }

                    EditText texto = (EditText) findViewById(R.id.resultado);
                    texto.setKeyListener(null);
                    texto.setText(String.valueOf(mensaje));
                    ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                    ClipData clip = ClipData.newPlainText("chutlulu translation", String.valueOf(mensaje));
                    Toast toast = Toast.makeText(getApplicationContext(), "Coso copiado aapartapapeles", Toast.LENGTH_SHORT);
                    normal.start();
                    toast.show();
                    clipboard.setPrimaryClip(clip);

            }
        });
    }

    protected int lepraANumero(char lepra)
    {
        return (int)lepra;
    }

    protected char numeroALepra(int numero)
    {
        return (char)numero;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            startActivity(new Intent(MainActivity.this, Settings.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
