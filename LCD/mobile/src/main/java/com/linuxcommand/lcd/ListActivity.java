package com.linuxcommand.lcd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }
    public void Search(View v){
        Intent intent = new Intent(getApplicationContext(),SearchActivity.class);
        startActivity(intent);
    }
    public void List(View v){
        Intent intent = new Intent(getApplicationContext(),ListActivity.class);
        startActivity(intent);
    }
    public void Bookmark(View v){
        Intent intent = new Intent(getApplicationContext(),BookmarkActivity.class);
        startActivity(intent);
    }
    public void Share(View v){

    }
}
