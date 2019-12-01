package com.createsapp.wowlet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnmenu,exp,addOns,message,settings,signout;
    RelativeLayout maincontent;
    LinearLayout mainmenu;

    Animation fromtop, frombottom;
    ImageView userpicbig;
    TextView user, country;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnmenu = findViewById(R.id.btnMenu);
        exp = findViewById(R.id.explore);
        addOns = findViewById(R.id.addOns);
        message = findViewById(R.id.message);
        settings = findViewById(R.id.settings);
        signout = findViewById(R.id.signout);


        user = findViewById(R.id.name);
        country = findViewById(R.id.country);
        userpicbig = findViewById(R.id.userImg);

        fromtop = AnimationUtils.loadAnimation(this, R.anim.fromtop);
        frombottom = AnimationUtils.loadAnimation(this, R.anim.frombottom);

        maincontent = findViewById(R.id.maincontent);
        mainmenu = findViewById(R.id.mainmenu);


        btnmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                maincontent.animate().translationX(0);
                mainmenu.animate().translationX(0);
                exp.startAnimation(frombottom);
                addOns.startAnimation(frombottom);
                message.startAnimation(frombottom);
                settings.startAnimation(frombottom);
                signout.startAnimation(frombottom);


                user.startAnimation(fromtop);
                country.startAnimation(fromtop);
                userpicbig.startAnimation(fromtop);
            }
        });

        maincontent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                maincontent.animate().translationX(-735);
                mainmenu.animate().translationX(-735);
            }
        });
    }
}
