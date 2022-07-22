package com.example.activitytest;

//import androidx.fragment.app.FragmentManager;
//import androidx.fragment.app.FragmentTransaction;

//import androidx.fragment.app.Fragment;

import android.app.Activity;
        import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends Activity implements View.OnClickListener {
//    @Override
//    public void onBackPressed() {
//        super.onBackPressed();
//        Intent intent = new Intent();
//        intent.putExtra("data_return", "Hello FirstActivity");
//        setResult(RESULT_OK, intent);
//        finish();
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Log.d("Second Activity", "Task id is" + getTaskId());
//        Button button2 = (Button) findViewById(R.id.button_2);
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                Intent intent = new Intent();
////                intent.putExtra("data_return", "Hello FirstActivity");
////                setResult(RESULT_OK, intent);
////                finish();
//                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
//                startActivity(intent);
//            }
//        });
        Button button = (Button)findViewById(R.id.button_fragment);
        button.setOnClickListener(this);
//        replaceFragment(new RightFragment());
        Intent intent = getIntent();
        String data1 = intent.getStringExtra("param1");
        String data2 = intent.getStringExtra("param2");
        Log.d("SecondActivity", data1 + data2);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_fragment:
//                replaceFragment(new AnotherRightFragment());
                break;
            default:
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("SecondActivity", "onDestory");
    }

    public static void actionStart(Context context, String data1, String data2) {
        Intent intent = new Intent(context, SecondActivity.class);
        intent.putExtra("param1", data1);
        intent.putExtra("param2", data2);
        context.startActivity(intent);
    }

//    private void replaceFragment(Fragment fragment) {
//        FragmentManager fragmentManager = getFragmentManager();
//        FragmentTransaction transaction = fragmentManager.beginTransaction();
//        transaction.replace(R.id.right_layout, fragment);
//        transaction.addToBackStack(null);
//        transaction.commit();
//    }
}