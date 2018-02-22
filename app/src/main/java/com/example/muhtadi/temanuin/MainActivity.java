package com.example.muhtadi.temanuin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int pointa = 0;
    int pointb = 0;
    TextView scorea;
    TextView scoreb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basket);
        scorea = (TextView)findViewById(R.id.point_groupA);
        scoreb = (TextView) findViewById(R.id.point_groupB);

        //mytext = (TextView)findViewById(R.id.text_number);
    }

//    public void toast_click(View view) {
//        Toast.makeText(this, "tombol toast ditekan", Toast.LENGTH_SHORT).show();
//    }
//
//
//    public void count_click(View view) {
//        angka++;
//        mytext.setText(Integer.toString(angka));
//    }

    public void a_1(View view) {
        pointa++;
        scorea.setText(Integer.toString(pointa));
    }

    public void a_2(View view) {
        pointa+=2;
        scorea.setText(Integer.toString(pointa));
    }

    public void a_3(View view) {
        pointa+=3;
        scorea.setText(Integer.toString(pointa));
    }

    public void b_1(View view) {
        pointb++;
        scoreb.setText(Integer.toString(pointb));
    }

    public void b_2(View view) {
        pointb+=2;
        scoreb.setText(Integer.toString(pointb));
    }

    public void b_3(View view) {
        pointb+=3;
        scoreb.setText(Integer.toString(pointb));
    }

    public void reset_btn(View view) {
        pointa=0;
        pointb=0;
        scorea.setText(Integer.toString(pointa));
        scoreb.setText(Integer.toString(pointb));

    }
}
