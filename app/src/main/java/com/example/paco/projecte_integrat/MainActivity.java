package com.example.paco.projecte_integrat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button botonAcceder;
    private EditText nombreUsuario;
    private EditText contraseñaUsuario;
    private ImageButton registroFacebook;
    private ImageButton registroGmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonAcceder=(Button)findViewById(R.id.buttonAcceder);
        nombreUsuario=(EditText)findViewById(R.id.editTextNombreUsuario);
        contraseñaUsuario=(EditText)findViewById(R.id.editTextContraUsuario);
        registroFacebook=(ImageButton)findViewById(R.id.imageButtonFacebook);
        registroGmail=(ImageButton)findViewById(R.id.imageButtonGmail);
        botonAcceder.setOnClickListener(this);
        registroFacebook.setOnClickListener(this);
        registroGmail.setOnClickListener(this);


        //Probant
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.buttonAcceder:
                Toast.makeText(this, "Aqui accedo", Toast.LENGTH_SHORT).show();
                break;

            case R.id.imageButtonFacebook:
                Toast.makeText(this, "Aqui por facebook", Toast.LENGTH_SHORT).show();
                break;

            case R.id.imageButtonGmail:
                Toast.makeText(this, "Aqui por gmail", Toast.LENGTH_SHORT).show();
                break;

            default:
                Toast.makeText(this, "Cuidao", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
