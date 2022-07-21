package com.example.activitytest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class uiActivity extends BaseActivity implements View.OnClickListener {

    private EditText editText;

    private ImageView imageView;

    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ui_layout);
        Button button = (Button) findViewById(R.id.button_4);
        editText = (EditText) findViewById(R.id.edit_text);
        imageView = (ImageView) findViewById(R.id.image_view);
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_4:
                Log.d("UIActivity", "我点击了按钮4");
//                String inputText = editText.getText().toString();
//                Toast.makeText(uiActivity.this, inputText, Toast.LENGTH_SHORT).show();
//                imageView.setImageResource(R.drawable.ic_launcher_foreground);
//                if (progressBar.getVisibility() == View.GONE) {
//                    progressBar.setVisibility(View.VISIBLE);
//                } else {
//                    progressBar.setVisibility(View.GONE);
//                }
//                int progress = progressBar.getProgress();
//                progress = progress + 10;
//                progressBar.setProgress(progress);

                AlertDialog.Builder dialog = new AlertDialog.Builder(uiActivity.this);
                dialog.setTitle("This is Dialog");
                dialog.setMessage("Something important.");
                dialog.setCancelable(true);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.d("uiActivity", "ok");
                    }
                });
                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.d("uiActivity", "cancel");
                    }
                });
                dialog.show();

//                ProgressDialog progressDialog = new ProgressDialog(uiActivity.this);
//                progressDialog.setTitle("This is Dialog");
//                progressDialog.setMessage("Something important.");
//                progressDialog.setCancelable(true);
//                progressDialog.show();
                break;
            default:
                break;
        }
    }
}