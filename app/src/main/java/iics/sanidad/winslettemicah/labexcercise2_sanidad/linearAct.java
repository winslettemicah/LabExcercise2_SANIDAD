package iics.sanidad.winslettemicah.labexcercise2_sanidad;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class linearAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button NextButt =(Button) findViewById(R.id.button4);
        Button BackButt =(Button) findViewById(R.id.button3);

        NextButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveCon = new Intent(getApplicationContext(), ConstraintAct.class);
                startActivity(moveCon);
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