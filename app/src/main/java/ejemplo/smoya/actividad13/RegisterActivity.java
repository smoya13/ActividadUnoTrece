package ejemplo.smoya.actividad13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    // Variables de instancia
    private TextView txtRut, txtNombre, txtApellidoPat, txtApellidoMat, txtEdad, txtTelefono, txtDireccion, txtCorreo;
    private String rut, nombre, apellidoPat, apellidoMat, direccion, correo;
    private int edad, telefono;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

    }

    public void onButtonClicked(View view) {
        // Asignamos los valores ingresados a las variables.
        txtRut = findViewById(R.id.txtRut);
        txtNombre = findViewById(R.id.txtNombre);
        txtApellidoPat = findViewById(R.id.txtApellidoPat);
        txtApellidoMat = findViewById(R.id.txtApellidoMat);
        txtEdad = findViewById(R.id.txtEdad);
        txtTelefono = findViewById(R.id.txtTelefono);
        txtDireccion = findViewById(R.id.txtDireccion);
        txtCorreo = findViewById(R.id.txtCorreo);

        // Los asignamos a las variables legibles.
        rut = String.valueOf(txtRut);
        nombre = String.valueOf(txtNombre);
        apellidoPat = String.valueOf(txtApellidoPat);
        apellidoMat = String.valueOf(txtApellidoMat);
        edad = Integer.parseInt((String) txtEdad.getText());
        telefono = Integer.parseInt((String) txtTelefono.getText());
        direccion = String.valueOf(txtApellidoMat);
        correo = String.valueOf(txtCorreo);

    }
}