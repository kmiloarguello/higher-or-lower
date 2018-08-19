package xyz.camiloarguello.higherorlower;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onGuess(View view){
        EditText randomNumberField = findViewById(R.id.randomNumberField);
        int max = 20;
        int min = 1;

        int random = (int) (Math.random() * max + min);
        int randomFieldInt = Integer.parseInt(randomNumberField.getText().toString());

        if(randomFieldInt == random){
            Toast.makeText(MainActivity.this, "CONGRATS! The numbers are equals.", Toast.LENGTH_LONG).show();
        }else if(randomFieldInt > random){
            Toast.makeText(MainActivity.this, "Your number " + randomFieldInt + "  is higher than " + random + ".", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(MainActivity.this, "Your number " + randomFieldInt + "  is lower than " + random + ".", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
