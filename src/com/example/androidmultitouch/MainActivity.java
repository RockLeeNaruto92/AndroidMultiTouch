package com.example.androidmultitouch;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
	ListView listview;
	MyArrayAdapter studentAA;
	ArrayList<Student> studentArray = new ArrayList<Student>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		studentArray.add(new Student("A", "1", "1st"));
		studentArray.add(new Student("B", "2", "2st"));
		studentArray.add(new Student("C", "3", "3rd"));
		studentArray.add(new Student("D", "4", "4th"));
		studentArray.add(new Student("E", "5", "5th"));
		studentArray.add(new Student("F", "6", "6th"));
		studentArray.add(new Student("D", "4", "4th"));
		studentArray.add(new Student("E", "5", "5th"));
		studentArray.add(new Student("F", "6", "6th"));
		studentArray.add(new Student("D", "4", "4th"));
		studentArray.add(new Student("E", "5", "5th"));
		studentArray.add(new Student("F", "6", "6th"));
		studentArray.add(new Student("D", "4", "4th"));
		studentArray.add(new Student("E", "5", "5th"));
		studentArray.add(new Student("F", "6", "6th"));
		
		studentAA = new MyArrayAdapter(MainActivity.this, R.layout.list_item, studentArray);
		listview = (ListView)findViewById(R.id.listView);
		listview.setItemsCanFocus(false);
		listview.setAdapter(studentAA);
		
		listview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "List item clicked " + arg3, Toast.LENGTH_LONG).show();
				
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
