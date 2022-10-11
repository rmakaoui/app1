package ma.ensa.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private EditText nom, prenom, telephone;
    private Spinner villes;
    private RadioButton f,g;
    private Button env;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nom= findViewById(R.id.nom);
        prenom = findViewById(R.id.prenom);
        telephone= findViewById(R.id.phone);
        villes = findViewById(R.id.villes);
        f= findViewById(R.id.f);
        g= findViewById(R.id.m);
        env= findViewById(R.id.button);
        env.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                HashMap<String, String> data= new HashMap<>();
                data.put("nom", nom.getText().toString());
                data.put("prenom", prenom.getText().toString());
                data.put("telephone", telephone.getText().toString());
                data.put("ville", villes.getSelectedItem().toString());
                if (f.isChecked()){
                    data.put("genre", "femme");
                }
                if (g.isChecked()){
                    data.put("genre", "Homme");
                }
                intent.putExtra("data",data);
                startActivity(intent);
                MainActivity.this.finish();
            }
        });
    }
}