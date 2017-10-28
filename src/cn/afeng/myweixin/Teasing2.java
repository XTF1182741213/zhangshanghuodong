package cn.afeng.myweixin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Teasing2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.teasing2);
		getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN); 

		 Button btn=(Button)findViewById(R.id.login_reback_btn);
	        btn.setOnClickListener(new OnClickListener(){
	        	public void onClick(View arg0){
	        		finish();
	        	}
	        });
	    }
	}

