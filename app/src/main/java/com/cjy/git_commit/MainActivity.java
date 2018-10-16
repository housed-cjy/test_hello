package com.cjy.git_commit;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        test();
        test2();

        dev_test();
    }

    private void dev_test() {
        Log.d("MainActivity", "dev-test 代码提交");

    }

    private void test2() {
        Toast.makeText(this, "xx2", Toast.LENGTH_SHORT).show();
        Log.d("MainActivity", "修改 master 上代码 dev_test");
    }

    private void test() {
        Toast.makeText(this, "xx", Toast.LENGTH_SHORT).show();

    }
}
