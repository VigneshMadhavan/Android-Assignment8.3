package com.example.vimadhavan.assignment83;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private  Toast msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn= (Button) findViewById(R.id.btn);
        btn.setOnClickListener(this);

    }

    private void showSettingsAlert() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);

        // Setting Dialog Title
        alertDialog.setTitle(getString(R.string.title));

        // Setting Dialog Message
        alertDialog.setMessage(getString(R.string.msg));


        alertDialog.setCancelable(false);
        // on pressing Yes button
        alertDialog.setPositiveButton(getString(R.string.yes),
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        if(msg!=null){
                            msg.cancel();
                        }
                        msg= Toast.makeText(getApplicationContext(),getString(R.string.yesMsg),Toast.LENGTH_LONG);
                        msg.show();
                        dialog.cancel();
                    }
                });


        // on pressing No button
        alertDialog.setNegativeButton(getString(R.string.no),
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        if(msg!=null){
                            msg.cancel();
                        }
                        msg= Toast.makeText(getApplicationContext(),getString(R.string.noMsg),Toast.LENGTH_LONG);
                        msg.show();
                        dialog.cancel();
                    }
                });

        // Showing Alert Message
        alertDialog.show();
    }


    @Override
    public void onClick(View v) {

        showSettingsAlert();


    }
}
