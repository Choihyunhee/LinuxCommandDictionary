package com.linuxcommand.lcd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    public void Register(View v) throws SQLException {
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);

        TextView id,pwd,age,job;
        id= (TextView)this.findViewById(R.id.id);
        pwd=(TextView)this.findViewById(R.id.pwd);
        age=(TextView)this.findViewById(R.id.age);
        job=(TextView)this.findViewById(R.id.job);

        String sid,spwd,sage,sjob;
        sid=id.getText().toString();
        spwd=pwd.getText().toString();
        sage=age.getText().toString();
        sjob=job.getText().toString();

        int iage=Integer.parseInt(sage);


        if(sid!=null&&spwd!=null&&sage!=null&&job!=null){
            if(Integer.parseInt(sage)>1&&Integer.parseInt(sage)<100){
                Connection con=null;
                Statement stmt =null;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    String url="uws7-037.cafe24.com/WebMysql";
                    String user="choi38389";
                    String password="dpswlsldj";
                    con= DriverManager.getConnection(url,user,password);
                    stmt=con.createStatement();
                    stmt.executeQuery("use choi38389;");
                    stmt.executeQuery("insert into user values (sid,spwd,iage,sjob);");

                } catch (ClassNotFoundException e) {

                }
                Toast toast = Toast.makeText(this,id.getText().toString()+"님 회원가입이 완료되었습니다.\n 로그인하고 사용하시면 됩니다.",Toast.LENGTH_LONG);
                toast.show();
                startActivity(intent);
            }
           else{
                Toast toast = Toast.makeText(this,"나이를 제대로 입력해주세요.",Toast.LENGTH_LONG);
                toast.show();
            }
        }
        //id 중복확인, id, password, age, job 꼭 쓸 것
        else{
            Toast toast = Toast.makeText(this,"제대로된 정보 입력을 부탁드립니다.",Toast.LENGTH_LONG);
            toast.show();
        }
    }
}
