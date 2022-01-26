package com.example.sqlite;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edtEmpName = findViewById(R.id.name);
        EditText edtDesig = findViewById(R.id.designation);
        EditText edtSalary = findViewById(R.id.salary);
        EditText edtPhone = findViewById(R.id.phone);
        EditText edtMail = findViewById(R.id.email);
        Button btnSave = findViewById(R.id.submit);
        DatabaseHelper dbh= new DatabaseHelper(getApplicationContext());
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Employee objEmp = new Employee(edtEmpName.getText().toString(),edtDesig.getText().toString(),Integer.parseInt(edtSalary.getText().toString()),edtPhone.getText().toString(),edtMail.getText().toString());
                if(dbh.InsertEmployee(objEmp))
                    Toast.makeText(getApplicationContext(),"Record inserted successfully",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(),"Record not inserted",Toast.LENGTH_LONG).show();
                edtEmpName.setText("");
                edtDesig.setText("");
                edtSalary.setText("");
                edtPhone.setText("");
                edtMail.setText("");

            }

        });
    }
}