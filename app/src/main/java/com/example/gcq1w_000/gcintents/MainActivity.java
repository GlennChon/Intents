package com.example.gcq1w_000.gcintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int request_Code = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onAct1BtnClick(View view){
        Intent Activity1 = new Intent(this, Activity1.class);
        startActivityForResult(Activity1, request_Code);
    }
    public void onAct2BtnClick(View view){

        startActivityForResult(new Intent(
                        "android.intent.action.ACTIVITY1"),
                request_Code);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data){
        if (requestCode == request_Code) {
            if(resultCode == RESULT_OK) {
                Toast.makeText(this, data.getData().toString(),
                        Toast.LENGTH_SHORT).show();
            }
        }
    }
}
