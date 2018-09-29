package iics.sanidad.winslettemicah.labexcercise2_sanidad;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ConstraintAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint_layout);

        Button NextButt =(Button) findViewById(R.id.button4);
        Button BackButt =(Button) findViewById(R.id.button3);

        NextButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveRela = new Intent(getApplicationContext(), linearAct.class);
                startActivity(moveRela);
            }
        });

        BackButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Back = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(Back);
            }
        });

    }
}