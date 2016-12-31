package com.paulsentribe.dialview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SeekBar sb = (SeekBar)findViewById(R.id.seekBar);
        final SpeedometerView sv = (SpeedometerView) findViewById(R.id.speedoMeterView);

        sv.addColoredRange(1000,2249, Color.GREEN);
        sv.addColoredRange(2250,2299,Color.YELLOW);
        sv.addColoredRange(2300,2649,Color.GREEN);
        sv.addColoredRange(2650,2700,Color.RED);

        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                sv.setSpeed((double)progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}
