package cn.afeng.myweixin;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class Attention extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attention);
        
        

		 Button btn=(Button)findViewById(R.id.login_reback_btn);
	        btn.setOnClickListener(new OnClickListener(){
	        	public void onClick(View arg0){
	        		finish();
	        	}
	        });
    }
    public void startchat2(View v) {      //小黑  对话界面
		Intent intent = new Intent (Attention.this,Details2.class);			
		startActivity(intent);	
		//Toast.makeText(getApplicationContext(), "登录成功", Toast.LENGTH_LONG).show();
      }  

    }


