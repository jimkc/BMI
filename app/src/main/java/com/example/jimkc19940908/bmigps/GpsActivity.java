package com.example.jimkc19940908.bmigps;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class GpsActivity extends Activity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gps);

        tv=(TextView)findViewById(R.id.gpstextview);


    }

}
