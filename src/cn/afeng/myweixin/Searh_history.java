package cn.afeng.myweixin;



import cn.afeng.myweixin.My_activity.ButtonListener1;
import cn.afeng.myweixin.My_activity.ButtonListener2;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;


public class Searh_history extends Activity {
	
	
	
	public Button high=null;
	public Button search=null;
	public Button sousu=null;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.search_history);
		
		
		Button btn=(Button)findViewById(R.id.login_reback_btn);
		btn.setOnClickListener(new OnClickListener(){
			public void onClick(View arg0){
				finish();
			}
		});
		//dialog=new MyDialog(this);
		
		high=(Button)findViewById(R.id.button1);
		
		
		sousu=(Button)findViewById(R.id.button2);
		high.setOnClickListener(new ButtonListener1());
		sousu.setOnClickListener(new ButtonListener2());
		
		
		

	    		      
		
	}
	
	
		
		class ButtonListener1 implements OnClickListener{
		public void onClick(View v){
		Intent intent = new Intent();
		intent.setClass(Searh_history.this,High_search.class);
		Searh_history.this.startActivity(intent);
		    
		}
		}
		
		
		class ButtonListener2 implements OnClickListener{
			public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(Searh_history.this,Sousu.class);
			Searh_history.this.startActivity(intent);
			    
			}
			}
		
	
		

		
			
public void detailss(View v) {      //小黑  对话界面
	Intent intent = new Intent (Searh_history.this,Details.class);			
	startActivity(intent);	
	//Toast.makeText(getApplicationContext(), "登录成功", Toast.LENGTH_LONG).show();
  }  
	

}


