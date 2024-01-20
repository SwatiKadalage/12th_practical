package com.example.auto;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Button btn;
    RadioButton R1,R2,RG1,RG2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bttn=(Button)findViewById(R.id.btn);
        R1=(RadioButton)findViewById(R.id.R1);
        R2=(RadioButton)findViewById(R.id.R2);
        RG1=(RadioButton) findViewById(R.id.RG1);
        RG2=(RadioButton)findViewById(R.id.RG2);
        bttn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                {
                    String result = "selected Button"+"\n";
                    result += (R1.isChecked()) ? "Radio Button 1"+"\n": (R2.isChecked()) ? "Radio Button 2"+"\n" : "";
                   String res=(RG1.isChecked()) ? "Male"+"\n" : (RG2.isChecked()) ? "Female"+"\n" : "";

                    Toast.makeText(getApplicationContext(), result+res,Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

