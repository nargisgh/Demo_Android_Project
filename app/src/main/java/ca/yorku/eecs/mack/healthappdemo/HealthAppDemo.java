package ca.yorku.eecs.mack.healthappdemo;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HealthAppDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        Button exerciseButton = findViewById(R.id.exerciseButton);
        exerciseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HealthAppDemo.this, ExerciseActivity.class);
                startActivity(intent);
            }
        });

        Button sleepButton = findViewById(R.id.sleepButton);
        sleepButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HealthAppDemo.this, SleepActivity.class);
                startActivity(intent);
            }
        });

        Button mealButton = findViewById(R.id.mealButton);
        mealButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HealthAppDemo.this, MealActivity.class);
                startActivity(intent);
            }
        });
    }
}