package cn.studyjams.s1.sj26.ShoesTip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.analytics.FirebaseAnalytics;

public class MainActivity extends AppCompatActivity {
    Button bAboutShoes;
    Button bQualifyShoes;
    Button bChooseShoes;
    Button bMaintainShoes;
    Button bAboutApps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bAboutShoes = (Button) findViewById(R.id.about_shoes_button);
        bAboutShoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iAboutShoes = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(iAboutShoes);
            }
        });

        bQualifyShoes = (Button) findViewById(R.id.qualify_shoes_button);
        bQualifyShoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iQualifyShoes = new Intent(MainActivity.this, QualifyActivity.class);
                startActivity(iQualifyShoes);
            }
        });

        bChooseShoes = (Button)findViewById(R.id.choose_shoes_button);
        bChooseShoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iChooseShoes = new Intent(MainActivity.this, ChooseActivity.class);
                startActivity(iChooseShoes);
            }
        });

        bMaintainShoes = (Button)findViewById(R.id.maintain_shoes_button);
        bMaintainShoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iMaintainShoes = new Intent(MainActivity.this, MaintainActivity.class);
                startActivity(iMaintainShoes);
            }
        });
        bAboutApps = (Button)findViewById(R.id.about_apps_button);
        bAboutApps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iAboutApps = new Intent(MainActivity.this, AboutAppsActivity.class);
                startActivity(iAboutApps);
            }
        });
    }
}
