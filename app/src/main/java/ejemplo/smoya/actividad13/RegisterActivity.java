package ejemplo.smoya.actividad13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class RegisterActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    // Creo el arreglo para poner los generos
    String[] genero = {"Hombre", "Mujer", "Gamer"};

    // Variables de instancia
    private EditText txtRut, txtNombre, txtApellidoPat, txtApellidoMat, txtEdad, txtTelefono, txtDireccion, txtCorreo;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Asignamos los valores ingresados a las variables.
        btnRegister = (Button) findViewById(R.id.btnRegistrarse);
        txtRut = findViewById(R.id.txtRut);
        txtNombre = findViewById(R.id.txtNombre);
        txtApellidoPat = findViewById(R.id.txtApellidoPat);
        txtApellidoMat = findViewById(R.id.txtApellidoMat);
        txtEdad = findViewById(R.id.txtEdad);
        txtTelefono = findViewById(R.id.txtTelefono);
        txtDireccion = findViewById(R.id.txtDireccion);
        txtCorreo = findViewById(R.id.txtCorreo);

        // Obteniendo una instancia del Spinner y asignando a la variable
        Spinner spin = (Spinner) findViewById(R.id.spnGnero);
        spin.setOnItemSelectedListener(this);

        // Creando una instancia del ArrayAdapter obteniendo la lista de paises.
        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, genero);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Setteando el ArrayAdapter al Spinner
        spin.setAdapter(aa);
    }

    public void onButtonClicked(View view) {
        if(txtRut.getText().toString().equals("") | txtNombre.getText().toString().equals("") | txtApellidoPat.getText().toString().equals("") | txtApellidoMat.getText().toString().equals("") | txtEdad.getText().toString().equals("") | txtTelefono.getText().toString().equals("") | txtDireccion.getText().toString().equals("") | txtCorreo.getText().toString().equals("")){
            String mensaje = "⚠Tienes campos vacios";
            Toast toast = Toast.makeText(this, mensaje, Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.START, 90, 0);
            toast.show();
        }else{
            Intent intent = new Intent (this, login.class);
            startActivity(intent);
        }

    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}