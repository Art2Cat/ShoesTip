package cn.studyjams.s1.sj26.ShoesTip;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AboutAppsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_apps);
    }

    public void contactMe(View view) {
        Intent contactMe = new Intent(Intent. ACTION_SENDTO);
        contactMe.setData(Uri.parse("mailto:me@art2cat.com"));
        if (contactMe.resolveActivity(getPackageManager()) != null)
        {
            startActivity(contactMe);
        }
    }
}
