package org.example.hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class Hello extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        View submitButton = findViewById(R.id.button1);
        submitButton.setOnClickListener(this);
   
        Tag = (EditText)findViewById(R.id.editText1);
        Message = (EditText)findViewById(R.id.editText2);
    
    }
    
    EditText Tag;
    EditText Message;
    
    public void onClick(View v){
    	String myTag = Tag.getText().toString();
    	Toast.makeText(this,myTag, Toast.LENGTH_SHORT).show();
    	
    	String myMessage = Message.getText().toString();
    	Toast.makeText(this,myMessage, Toast.LENGTH_SHORT).show();
    }
}