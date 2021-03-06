package View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cleancodedemo.R;

public class AndroidView extends AppCompatActivity {

    EditText editInput;
    TextView result;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editInput = (EditText) findViewById(R.id.editText);
        result = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editInput.getText().toString() != null)
                {
                    Toast.makeText(getApplicationContext(), editInput.getText().toString(), Toast.LENGTH_LONG).show();
                }
                String input = editInput.getText().toString();
                result.setText(input);
            }
        });
    }
}