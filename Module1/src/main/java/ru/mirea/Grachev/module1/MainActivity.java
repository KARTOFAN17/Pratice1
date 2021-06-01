package ru.mirea.Grachev.module1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView myText = (TextView) findViewById(R.id.editTextTextPersonName);
        myText.setText("New text in MIREA");
        Button button = findViewById(R.id.button14);
        button.setText("MireaButton");
        CheckBox checkBox = findViewById(R.id.check_box);
        checkBox.setChecked(true);
    }
}