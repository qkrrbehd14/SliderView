package gun0912.tedbottompickerdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import gun0912.tedbottompickerdemo.Alarm.SubAlarm;
import gun0912.tedbottompickerdemo.Calendar.Cal;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("메인");



        Button btnAlarm = (Button) findViewById(R.id.button3);
        btnAlarm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SubAlarm.class);
                startActivity(intent);
            }
        });


        Button calendar = (Button) findViewById(R.id.button);
        calendar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Cal.class);
                startActivity(intent);

            }


        });
        Button picture = (Button) findViewById(R.id.button4);
        picture.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Picture.class);
                startActivity(intent);

            }


        });
    }
}