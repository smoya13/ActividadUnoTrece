package ejemplo.smoya.actividad13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Variables de instancia
    private Button btnApretame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnApretame = findViewById(R.id.btnApretame);

    }

    public void onButtonClicked(View view) {
            String mensaje = "Gracias🤑";
            Toast toast = Toast.makeText(this, mensaje, Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.START, 90, 0);
            toast.show();
    }
}