package com.ingrammicro.inrans00.employeedetails;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by INRANS00 on 8/30/2018.
 */

public class EmployeeAdapter extends ArrayAdapter {
    public EmployeeAdapter(@NonNull Context context, ArrayList<employee> Employee) {
        super(context, 0, Employee);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null)
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

            employee emp = (employee) getItem(position);

            TextView titleView = (TextView) listItemView.findViewById(R.id.title);
            titleView.setText(emp.getTitle());
            TextView nameView = (TextView) listItemView.findViewById(R.id.Company_name);
            nameView.setText(emp.getCompanyName());
            TextView packageView = (TextView) listItemView.findViewById(R.id.Package);
            packageView.setText(Integer.toString(emp.getPackage()));

            return listItemView;
        }
    }

