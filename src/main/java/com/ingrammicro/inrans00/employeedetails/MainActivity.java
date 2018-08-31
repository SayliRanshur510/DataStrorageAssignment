package com.ingrammicro.inrans00.employeedetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<employee> Employee = new ArrayList<employee>();

            Employee.add(new employee("Manager","Ingram Micro",100000));
            Employee.add(new employee("Developer","LTI",50000));
            Employee.add(new employee("QA","TIAA",50000));
            Employee.add(new employee("Trainee","Tata consultancy services india limited",20000));
            Employee.add(new employee("HR","Infosys",80000));
            Employee.add(new employee("finance","Atos",50000));

            EmployeeAdapter adapter = new EmployeeAdapter(this, Employee);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);



    }
}
