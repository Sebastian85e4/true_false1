package gonzalez.sebastian.atrue_falsegame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button inicio = (Button) findViewById(R.id.Inicio);
        inicio.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), preguntas.class);
                startActivityForResult(intent, 0);
            }
            })
        ;}



    @Override
    public void onClick(View v) {
        Intent intent = new Intent (v.getContext(), preguntas.class);
        startActivityForResult(intent, 0);
    }


    }




