package com.example.mojerosliny;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int favoriteCount = 0;
    private TextView countText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countText = findViewById(R.id.favoriteCountText);
        Button addButton = findViewById(R.id.addButton);
        Button removeButton = findViewById(R.id.removeButton);
        Button infoButton = findViewById(R.id.infoButton);

        addButton.setOnClickListener(v -> {
            favoriteCount++;
            countText.setText("Liczba w ulubionych: " + favoriteCount);
        });

        removeButton.setOnClickListener(v -> {
            if (favoriteCount > 0) {
                favoriteCount--;
                countText.setText("Liczba w ulubionych: " + favoriteCount);
            }
        });

        infoButton.setOnClickListener(v ->
            Toast.makeText(this, "Brak dodatkowych informacji.", Toast.LENGTH_SHORT).show()
        );
    }
}
