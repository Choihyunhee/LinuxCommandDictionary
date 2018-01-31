package com.linuxcommand.lcd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import java.sql.*;
import java.sql.DriverManager;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }
    public void Search(View v){

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
    public void Searchnow(View v) throws SQLException {

    }
}
