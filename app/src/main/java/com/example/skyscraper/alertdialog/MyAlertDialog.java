package com.example.skyscraper.alertdialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MyAlertDialog extends DialogFragment {

    boolean checked[] = new boolean[10];//to store the checked elements

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Select Days : ");


        builder.setMultiChoiceItems(R.array.days, checked, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which, boolean isChecked) {


            }
        });


        /*builder.setItems(R.array.days, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(),"Item " + which + " was clicked",Toast.LENGTH_SHORT).show();
            }
        });*/


        setCancelable(false);
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dismiss();
                Toast.makeText(getActivity(),"Cancel Was Clicked",Toast.LENGTH_SHORT).show();
            }
        });
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dismiss();
                Toast.makeText(getActivity(),"OK Was Clicked",Toast.LENGTH_SHORT).show();
                String s[] = new String[10];
                s = getResources().getStringArray(R.array.days);
                for(int i=0;i<7;i++)
                {
                    if(checked[i] == true)
                    {
                        Toast.makeText(getActivity(),"Item " + s[i] + " was clicked",Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });
        Dialog dialog = builder.create();
        return dialog;
    }
}
