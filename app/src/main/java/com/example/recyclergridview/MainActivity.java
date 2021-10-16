package com.example.recyclergridview;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
public class MainActivity extends AppCompatActivity {

    RecyclerView rvMain;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvMain = (RecyclerView) findViewById(R.id.rvMain);
        Bitmap[] logos = new Bitmap[12];
        logos[0] = BitmapFactory.decodeResource(getResources(), R.drawable.bmwginadark);
        logos[1] = BitmapFactory.decodeResource(getResources(), R.drawable.bmwm3);
        logos[2] = BitmapFactory.decodeResource(getResources(), R.drawable.bugatti22a);
        logos[3] = BitmapFactory.decodeResource(getResources(), R.drawable.car);
        logos[4] = BitmapFactory.decodeResource(getResources(), R.drawable.car2);
        logos[5] = BitmapFactory.decodeResource(getResources(), R.drawable.carthree);
        logos[6] = BitmapFactory.decodeResource(getResources(), R.drawable.ferrari);
        logos[7] = BitmapFactory.decodeResource(getResources(), R.drawable.kizashilive);
        logos[8] = BitmapFactory.decodeResource(getResources(), R.drawable.nissan);
        logos[9] = BitmapFactory.decodeResource(getResources(), R.drawable.nissancar);
        logos[10] = BitmapFactory.decodeResource(getResources(), R.drawable.volkswagen);
        logos[11] = BitmapFactory.decodeResource(getResources(), R.drawable.seatcordoba);
        MyAdapter adapter = new MyAdapter(getResources().getStringArray(R.array.company_list), logos);
        rvMain.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));
        rvMain.setAdapter(adapter);

    }

}