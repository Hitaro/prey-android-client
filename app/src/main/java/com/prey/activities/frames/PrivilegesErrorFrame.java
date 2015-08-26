package com.prey.activities.frames;

 
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.prey.PreyLogger;
import com.prey.R;
import com.prey.activities.WelcomeActivity;

public class PrivilegesErrorFrame extends Fragment {
	
private WelcomeActivity welcome;

public void setActivity(WelcomeActivity welcome) {
	this.welcome = welcome;
}

@Override
  public void onResume() {
     PreyLogger.i("onResume of PrivilegesErrorFrame");
     super.onResume();
  }

  @Override
  public void onPause() {
	  PreyLogger.i("onPause of PrivilegesErrorFrame");
    super.onPause();
  }

 
  
  
@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
  // Defines the xml file for the fragment
  View view = inflater.inflate(R.layout.privileges_error, container, false);
  
  Button buttonAddPrivileges=(Button)view.findViewById(R.id.buttonAddPrivileges);
  buttonAddPrivileges.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		PreyLogger.i("________________");
		
		welcome.addPrivileges();
		 
		
	}
});
  
  return view;
}


 

}