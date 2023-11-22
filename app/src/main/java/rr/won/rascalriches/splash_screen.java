package rr.won.rascalriches;

import android.content.Intent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class splash_screen extends AppCompatActivity {

    private ImageView splash; // Declare the ImageView variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen); // Replace "your_layout" with your actual layout XML file

        // Initialize the ImageView



        // Using a Handler to delay starting the next activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splash_screen.this, MainActivity.class);
                startActivity(intent); // Use 'intent' instead of 'Intent'
                finish();
            }
        }, 500); // Delay for 3000 milliseconds (3 seconds)
    }
}
