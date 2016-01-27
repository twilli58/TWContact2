package com.example.miko.tamikowilliamscontact2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static RadioGroup radioGroup1;
    private static RadioButton radioBtn;
    private static Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void buttonOnClick(View v) {
        btnSave = (Button)findViewById(R.id.btnSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText nEdit =(EditText)findViewById(R.id.nameEdit);
                EditText pEdit =(EditText)findViewById(R.id.phoneEdit);
                EditText eEdit =(EditText)findViewById(R.id.emailEdit);

                TextView tView1 = (TextView)findViewById(R.id.textView);
                tView1.setText(nEdit.getText().toString());

                TextView tView4 = (TextView)findViewById(R.id.textView4);
                tView4.setText(pEdit.getText().toString());


                TextView tView5 = (TextView)findViewById(R.id.textView5);
                tView5.setText(eEdit.getText().toString());
                //radio buttons
                onClickListenerButton();

            }
        });
    }
    public void onClickListenerButton() {
        radioGroup1 = (RadioGroup)findViewById(R.id.RadioGroup1);
        btnSave = (Button)findViewById(R.id.btnSave);
        btnSave.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        int selectedId = radioGroup1.getCheckedRadioButtonId();
                        radioBtn = (RadioButton)findViewById(selectedId);
                        Toast.makeText(MainActivity.this, radioBtn.getText().toString(), Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
