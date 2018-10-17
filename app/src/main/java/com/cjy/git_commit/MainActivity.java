package com.cjy.git_commit;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Sample1 sample1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        test();
        test2();

        dev_test();
        master();
        sample1 = new Sample1(this);
    }

    private void master() {

        Log.d("MainActivity", " 现在就已经切换到主分支了");

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
