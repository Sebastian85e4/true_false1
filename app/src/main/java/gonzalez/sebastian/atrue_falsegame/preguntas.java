package gonzalez.sebastian.atrue_falsegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class preguntas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.botonVerdadero).setOnClickListener((View.OnClickListener) this);}

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.botonVerdadero:
                Intent intent = new Intent(this, preguntas2.class);
                break;

            case R.id.botFalso:
                Intent intent2 = new Intent(this, preguntas2.class);
                startActivity(intent2);
                break;
        }

    }
    }

