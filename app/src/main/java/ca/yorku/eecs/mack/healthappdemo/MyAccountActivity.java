// MyAccountActivity.java
package ca.yorku.eecs.mack.healthappdemo;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MyAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_account);

        // Display information about the application
        displayAppInformation();

        // Display user-specific information
        displayUserInfo();
    }

    private void displayAppInformation() {
        // Retrieve application information (you can replace these with your actual data)
        String version = "1.0";
        String developer = "Group Alpha";

        // Display application information in TextViews
        TextView versionTextView = findViewById(R.id.textViewVersion);
        versionTextView.setText("Version: " + version);

        TextView developerTextView = findViewById(R.id.textViewDeveloper);
        developerTextView.setText("Developer: " + developer);
    }

    private void displayUserInfo() {
        // Retrieve user-specific information from SharedPreferences (replace with your actual data retrieval)
        SharedPreferences prefs = getSharedPreferences("UserPrefs", MODE_PRIVATE);
        String username = prefs.getString("username", "John Doe");
        String email = prefs.getString("email", "John.Doe@example.com");

        // Display user-specific information in TextViews
        TextView usernameTextView = findViewById(R.id.textViewUserName);
        usernameTextView.setText("Username: " + username);

        TextView emailTextView = findViewById(R.id.textViewEmail);
        emailTextView.setText("Email: " + email);

        // Add more TextViews for additional user information
    }
}
