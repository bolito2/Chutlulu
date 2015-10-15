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

                        while (mensajeINT[i] > 27) {
                            mensajeINT[i] -= 28;
                        }

                    while (mensajeINT[i] < 0) {
                        mensajeINT[i] += 28;
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

                        while (mensajeINT[i] < 0) {
                            mensajeINT[i] += 28;
                        }
                    while (mensajeINT[i] > 27) {
                        mensajeINT[i] -= 28;
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
        switch(lepra)
        {
            case ' ' : return 0;
            case 'a' : return 1;
            case 'b' : return 2;
            case 'c' : return 3;
            case 'd' : return 4;
            case 'e' : return 5;
            case 'f' : return 6;
            case 'g' : return 7;
            case 'h' : return 8;
            case 'i' : return 9;
            case 'j' : return 10;
            case 'k' : return 11;
            case 'l' : return 12;
            case 'm' : return 13;
            case 'n' : return 14;
            case 'ñ' : return 15;
            case 'o' : return 16;
            case 'p' : return 17;
            case 'q' : return 18;
            case 'r' : return 19;
            case 's' : return 20;
            case 't' : return 21;
            case 'u' : return 22;
            case 'v' : return 23;
            case 'w' : return 24;
            case 'x' : return 25;
            case 'y' : return 26;
            case 'z' : return 27;
        }
        return 0;
    }

    protected char numeroALepra(int numero)
    {
        switch(numero)
        {
            case 0 : return ' ';
            case 1 : return 'a';
            case 2 : return 'b';
            case 3 : return 'c';
            case 4 : return 'd';
            case 5 : return 'e';
            case 6 : return 'f';
            case 7 : return 'g';
            case 8 : return 'h';
            case 9 : return 'i';
            case 10 : return 'j';
            case 11 : return 'k';
            case 12 : return 'l';
            case 13 : return 'm';
            case 14 : return 'n';
            case 15 : return 'ñ';
            case 16 : return 'o';
            case 17 : return 'p';
            case 18 : return 'q';
            case 19 : return 'r';
            case 20 : return 's';
            case 21 : return 't';
            case 22 : return 'u';
            case 23 : return 'v';
            case 24 : return 'w';
            case 25 : return 'x';
            case 26 : return 'y';
            case 27 : return 'z';
        }
        return ' ';
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
