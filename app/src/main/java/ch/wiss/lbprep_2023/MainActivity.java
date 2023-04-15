package ch.wiss.lbprep_2023;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup skillRadios = findViewById(R.id.skillRadios);
        for (String skill : getResources().getStringArray(R.array.skills)) {
            RadioButton b = new RadioButton(this);
            b.setText(skill);
            skillRadios.addView(b);
        }
    }
}
