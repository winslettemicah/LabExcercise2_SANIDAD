package iics.sanidad.winslettemicah.labexcercise2_sanidad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_menu);

        Button LinButt =(Button) findViewById(R.id.LinearButton);
        Button ConButt =(Button) findViewById(R.id.ConstraintButton);
        Button RelButt =(Button) findViewById(R.id.RelativeButton);

        LinButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveLin = new Intent(getApplicationContext(), linearAct.class);
                startActivity(moveLin);
            }
        });

        RelButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveRel = new Intent(getApplicationContext(), relativeAct.class);
                startActivity(moveRel);
            }
        });

        ConButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveCon = new Intent(getApplicationContext(), ConstraintAct.class);
                startActivity(moveCon);
            }
        });

    }
}