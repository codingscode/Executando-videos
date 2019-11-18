package pacote.udemy55executandovideos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

    }

    public void abrirVideo(View view) {
        startActivity(new Intent(this, PlayerActivity.class));
    }

}
