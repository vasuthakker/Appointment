package com.swiftsprint.appointment;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class NewAppointmentActivity extends Activity {

	private TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new_appointment);
		
	}

}
