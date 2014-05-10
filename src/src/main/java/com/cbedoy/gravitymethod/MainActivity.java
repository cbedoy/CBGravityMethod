package com.cbedoy.gravitymethod;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity  {

    private Button      country_view;
    private TextView    latitud_view;
    private TextView    longitud_view;
    private EditText    cost_view;
    private Button      action_solve;
    private Button      action_add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_view);
        getActionBar().hide();

        country_view    = (Button)findViewById(R.id.country_view);
        latitud_view    = (TextView)findViewById(R.id.latitud_view);
        longitud_view   = (TextView)findViewById(R.id.longitud_view);
        cost_view       = (EditText)findViewById(R.id.cost_view);
        action_add      = (Button)findViewById(R.id.action_add);
        action_solve    = (Button)findViewById(R.id.action_solve);

        country_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        action_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        action_solve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
