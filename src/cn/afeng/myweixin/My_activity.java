package cn.afeng.myweixin;




import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class My_activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.my_activity);}
		
		
		
		public Button ViewTest1=null;
		public Button cue1=null;
		public Button help1=null;
		public Button end1=null;
		protected void onCreate1(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.my_activity);
		ViewTest1 = (Button)findViewById(R.id.head);
		cue1 = (Button)findViewById(R.id.ImageView01);
		help1 = (Button)findViewById(R.id.ImageView02);
		end1 = (Button)findViewById(R.id.ImageView03);
		ViewTest1.setOnClickListener(new ButtonListener());
		cue1.setOnClickListener(new ButtonListener1());
		help1.setOnClickListener(new ButtonListener2());
		end1.setOnClickListener(new ButtonListener3());

		}

		class ButtonListener implements OnClickListener{
			public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(My_activity.this,Attention.class);
			    My_activity.this.startActivity(intent);
			    
			}
			}
			class ButtonListener1 implements OnClickListener{
			public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(My_activity.this,Issue_activity.class);
			    My_activity.this.startActivity(intent);
			    
			}
			}
			class ButtonListener2 implements OnClickListener{
			public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(My_activity.this,Issue.class);
			    My_activity.this.startActivity(intent);
			    
			}
			}
			class ButtonListener3 implements OnClickListener{
			public void onClick(View v){
			Intent intent = new Intent();
			intent.setClass(My_activity.this,Parteners.class);
			    My_activity.this.startActivity(intent);
			    
			}
			}
		
		

		}
	
