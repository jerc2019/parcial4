package sv.edu.utec.ordinariocuatro;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.opengl.GLDebugHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import DB.DB;

public class MainActivity extends AppCompatActivity {
    Button btnbasedato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnbasedato = findViewById(R.id.btnbasedato);

        btnbasedato.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                DB dbHelper = new DB(MainActivity.this);
                SQLiteDatabase db = dbHelper.getWritableDatabase();
                if(db != null){
                    Toast.makeText(MainActivity.this, "BASE DE DATOS CREADA", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity.this, "ERROR DE BD", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}