package ma.ensa.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.io.Serializable;
import java.util.Map;

public class SecondActivity extends AppCompatActivity {
    private TextView nom,prenom,ville,genre,tele;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        nom = findViewById(R.id.nom1);
        prenom = findViewById(R.id.prenom2);
        ville = findViewById(R.id.ville2);
        genre = findViewById(R.id.genre2);
        tele = findViewById(R.id.phone2);
        Serializable data= getIntent().getSerializableExtra("data");
        if (data!=null){
            Map<String,String>map=(Map<String, String>) data;
            nom.setText(map.get("nom"));
            prenom.setText(map.get("prenom"));
            ville.setText(map.get("ville"));
            genre.setText(map.get("genre"));
            tele.setText(map.get("telephone"));
        }
    }
}