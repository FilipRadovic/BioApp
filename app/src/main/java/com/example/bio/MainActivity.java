package com.example.bio;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    //private ActivityMainBinding binding;
    private EditText enterHobbies;
    private TextView hobbies;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterHobbies = findViewById(R.id.enter_hobbies);
        hobbies = findViewById(R.id.hobbies_text);

        //binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        /*binding.doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addHobbies(view);
            }
        });
*/
    }

    public void addHobbies(View view) {

        //binding.hobbiesText.setText("Hobbies: " + binding.enterHobbies.getText().toString().trim());
        //binding.hobbiesText.setVisibility(View.VISIBLE);

        hobbies.setText("Hobbies: " + enterHobbies.getText().toString().trim());
        hobbies.setVisibility(View.VISIBLE);

        //hide keyboard
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);

    }
}