package com.example.travel;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private ImageView login2;




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        Button login1 = findViewById(R.id.button20);
        login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, beach1.class);
                startActivity(intent);
            }
        });

        login1 =findViewById(R.id.button22);
        login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, hiking.class);
                startActivity(intent);
            }
        });

        login1 =findViewById(R.id.button21);
        login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, camping.class);
                startActivity(intent);
            }
        });

        login1 =findViewById(R.id.button7);
        login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, beachhouse.class);
                startActivity(intent);
            }
        });

        login1 =findViewById(R.id.button19);
        login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, villa.class);
                startActivity(intent);
            }
        });

        login1 =findViewById(R.id.button8);
        login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, hotels.class);
                startActivity(intent);
            }
        });

        login1 =findViewById(R.id.button17);
        login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, travelitems.class);
                startActivity(intent);
            }
        });

        login1 =findViewById(R.id.button18);
        login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, transports.class);
                startActivity(intent);
            }
        });

        login1 =findViewById(R.id.button9);
        login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, foods.class);
                startActivity(intent);
            }
        });


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.profile) {
                    startActivity(new Intent(MainActivity.this, aditacc.class));

                } else if (item.getItemId() == R.id.book_now) {
                    startActivity(new Intent(MainActivity.this, Booking.class));

                }else if (item.getItemId() == R.id.home) {
                    startActivity(new Intent(MainActivity.this, MainActivity.class));

                }else if (item.getItemId() == R.id.baseline) {
                    startActivity(new Intent(MainActivity.this, Contact_us.class));

                }
                return true;
            }
        });



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}