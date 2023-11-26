package ca.yorku.eecs.mack.healthappdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateAccountActivity extends AppCompatActivity {

    public static final String USER = "user";
    private EditText editTextUsername;
    private EditText editTextPassword;
    private Button buttonCreateAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonCreateAccount = findViewById(R.id.buttonCreateAccount);

        // Use lambda expression for onClickListener
        buttonCreateAccount.setOnClickListener(this::onClick);
    }



    // Rename method to follow Java conventions
    private void onClick(View v) {
        // Handle button click here
        String username = editTextUsername.getText().toString();
        SharedPreferences.Editor editor = getSharedPreferences(USER, Context.MODE_PRIVATE).edit();
        editor.putString("username", username);
        editor.apply();
        String password = editTextPassword.getText().toString();

        if (username.isEmpty() || password.isEmpty()) {
            Toast.makeText(CreateAccountActivity.this, R.string.fields_cant_be_empty, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(CreateAccountActivity.this, R.string.account_created_successfully, Toast.LENGTH_SHORT).show();
        }
    }
}
