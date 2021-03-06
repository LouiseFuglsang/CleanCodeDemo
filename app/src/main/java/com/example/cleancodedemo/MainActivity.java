package com.example.cleancodedemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editInput;
    TextView result;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editInput  = (EditText) findViewById(R.id.editText);
        result = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);

 /*       final TextView textView = (TextView) findViewById(R.id.textView); //get the id for TextView
        final EditText editText = (EditText) findViewById(R.id.editText);//get the id for edit text
        Button changeText = (Button) findViewById(R.id.button); //get the id for button
*/
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editInput.getText().toString() != null)//check whether the entered text is not null
                {
                    Toast.makeText(getApplicationContext(), editInput.getText().toString(), Toast.LENGTH_LONG).show();//display the text that you entered in edit text
                }

                String input = editInput.getText().toString();
                result.setText( input );
 //               textView.setText(); //set the text after clicking button
            }
        });

/*        final EditText editText = (EditText) findViewById(R.id.editText);//get the id for edit text
        Button button = (Button) findViewById(R.id.button);//get the id for button

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText.getText().toString() != null)//check whether the entered text is not null
                {
                    Toast.makeText(getApplicationContext(), editText.getText().toString(), Toast.LENGTH_LONG).show();//display the text that you entered in edit text
                }
    }
            }
        );
  */  }
}


