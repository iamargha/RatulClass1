package org.tution.prasenjitdemo1.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.tution.prasenjitdemo1.R;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btEnter, btOpenOtherActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btEnter = (Button) findViewById(R.id.btEnter);
        btOpenOtherActivity = (Button) findViewById(R.id.btOpenNextActivity);


        btEnter.setOnClickListener(this);
        btOpenOtherActivity.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btEnter:
                Toast t = Toast.makeText(MainActivity.this, "Boom , Boom !", Toast.LENGTH_SHORT);
                t.show();
                break;
            case R.id.btOpenNextActivity:
                Intent intent = new Intent(MainActivity.this, OtherActivity.class);
                startActivity(intent);
                //finish();
                break;
        }

    }
}
