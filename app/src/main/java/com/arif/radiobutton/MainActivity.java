package com.arif.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private Button button;
    private Button genderButton;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = findViewById(R.id.radioGroupId);
        button = findViewById(R.id.buttonId);
        result = findViewById(R.id.resultId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int selectedId =  radioGroup.getCheckedRadioButtonId();
                    genderButton = findViewById(selectedId);
                    String value = genderButton.getText().toString();
                    result.setText("you clicked on " +value +" button");
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"Please select a button",Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}