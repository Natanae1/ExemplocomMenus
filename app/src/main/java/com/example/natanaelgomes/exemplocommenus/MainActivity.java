package com.example.natanaelgomes.exemplocommenus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        getMenuInflater().inflate(R.menu.menu_aplicacao, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.item_novo:
                //Executa algo
                break;

            case R.id.item_abrir:
                //Executa algo
                break;

            case R.id.item_salvar:
                //Executa algo
                break;

            case R.id.item_salvar_copia:
                break;

            case R.id.item_salvar_como:
                break;
        }
        return super.onOptionsItemSelected(item);

    }
}
