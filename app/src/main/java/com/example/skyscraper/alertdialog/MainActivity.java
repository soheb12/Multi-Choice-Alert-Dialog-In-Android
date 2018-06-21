package com.example.skyscraper.alertdialog;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDialogClicked(View v)
    {
        MyAlertDialog myAlertDialog = new MyAlertDialog();
        myAlertDialog.show(getFragmentManager(),"myDialog");
    }
}
