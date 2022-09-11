package ejemplo.smoya.actividad13;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class login extends AppCompatActivity {
    // Variables de instancia
    Button btnLogin;
    EditText txtRut;
    EditText txtEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Asigno los valores a botones
        btnLogin = findViewById(R.id.btnLogin);
        txtRut = findViewById(R.id.txtRut);
        txtEmail = findViewById(R.id.txtCorreo);

    }

    public void onButtonClicked(View view) {
            Intent intent = new Intent (this, MainActivity.class);
            startActivity(intent);

    }
}