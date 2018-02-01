package gonzalez.sebastian.atrue_falsegame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class preguntas3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas3);
        Intent intent3 = getIntent();
        findViewById(R.id.botonVerdadero).setOnClickListener((View.OnClickListener) this);}

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.botonVerdadero3:
                Intent intent = new Intent(this, preguntas2.class);
                Intent intent3 = new Intent(this, preguntas2.class);
                startActivity(intent3);
                break;

            case R.id.botFalso3:
                intent3 = new Intent(this, preguntas2.class);
                startActivity(intent3);
                break;
        }

    }
}