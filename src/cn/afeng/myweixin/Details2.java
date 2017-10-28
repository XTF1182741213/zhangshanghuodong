package cn.afeng.myweixin;

import cn.afeng.myweixin.My_activity.ButtonListener;
import cn.afeng.myweixin.My_activity.ButtonListener1;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class Details2 extends Activity{
	   @Override
	    protected void onCreate(Bundle savedInstanceState) {
		   
		   Button consultbutton=null;
			Button teasebutton=null;
			
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.details2);
	        
	        

			 Button btn=(Button)findViewById(R.id.login_reback_btn);
		        btn.setOnClickListener(new OnClickListener(){
		        	public void onClick(View arg0){
		        		finish();
		        	}
		        });
		        
		        
	        consultbutton = (Button)findViewById(R.id.button1);
			teasebutton= (Button)findViewById(R.id.button2);
	        
			consultbutton.setOnClickListener(new ButtonListener());
			teasebutton.setOnClickListener(new ButtonListener1());
	   }

		class ButtonListener implements OnClickListener{
			public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(Details2.this,ChatActivity.class);
			    Details2.this.startActivity(intent);
			    
			}
			}
			class ButtonListener1 implements OnClickListener{
			public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(Details2.this,Teasing.class);
			    Details2.this.startActivity(intent);
			    
			}
	    }
	  



}
