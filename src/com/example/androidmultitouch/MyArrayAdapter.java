package com.example.androidmultitouch;

import java.util.ArrayList;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MyArrayAdapter extends ArrayAdapter<Student>{
	Context context;
	int layoutResourceId;
	ArrayList<Student> students = new ArrayList<Student>();

	public MyArrayAdapter(Context context, int resource,
			ArrayList<Student> studs) {
		super(context, resource, studs);
		// TODO Auto-generated constructor stub
		
		this.layoutResourceId = resource;
		this.context = context;
		this.students = studs;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View item = convertView;
		StudentWrapper StudentWrapper = null;
		
		if (item == null){
			LayoutInflater inflater = ((Activity)context).getLayoutInflater();
			item = inflater.inflate(layoutResourceId, parent, false);
			StudentWrapper = new StudentWrapper();
			StudentWrapper.age = (TextView)item.findViewById(com.example.androidmultitouch.R.id.textAge);			
			StudentWrapper.name = (TextView)item.findViewById(com.example.androidmultitouch.R.id.textName);
			StudentWrapper.address = (TextView)item.findViewById(com.example.androidmultitouch.R.id.textAddr);
			StudentWrapper.edit = (Button)item.findViewById(com.example.androidmultitouch.R.id.btnEdit);
			StudentWrapper.delete = (Button)item.findViewById(com.example.androidmultitouch.R.id.btnDelete);
			item.setTag(StudentWrapper);
		}else{
			StudentWrapper = (StudentWrapper)item.getTag();
		}
		
		Student student = students.get(position);
		StudentWrapper.name.setText(student.getName());
		StudentWrapper.age.setText(student.getAge());
		StudentWrapper.address.setText(student.getAddress());
		
		StudentWrapper.edit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(context, "Edit", Toast.LENGTH_LONG).show();
			}
		});
		
		StudentWrapper.delete.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(context, "Delete", Toast.LENGTH_LONG).show();
			}
		});
		return item;
	}
	
	static class StudentWrapper{
		TextView name;
		TextView age;
		TextView address;
		Button edit;
		Button delete;
	}
	
	
	
}
