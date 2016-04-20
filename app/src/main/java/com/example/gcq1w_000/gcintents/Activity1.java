package com.example.gcq1w_000.gcintents;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Gcq1w_000 on 3/14/2016.
 */
public class Activity1 extends MainActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);

        //---get the OK button---
        Button btn = (Button) findViewById(R.id.submitBtn);

        //---event handler for the OK button---
        btn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view) {
                Intent data = new Intent();

                //---get the EditText view---
                EditText name =
                        (EditText) findViewById(R.id.nameEditText);

                //---set the data to pass back---
                data.setData(Uri.parse(
                        name.getText().toString()));
                setResult(RESULT_OK, data);

                //---closes the activity---
                finish();
            }
        });
    }
}
