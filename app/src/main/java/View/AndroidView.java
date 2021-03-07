package View;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.example.cleancodedemo.R;
import java.util.Observer;
import java.util.Observable;

public class AndroidView extends AppCompatActivity implements Observer {

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

           String input = editInput.getText().toString();
               }
        });
    }
    //@Override
    public void update(Observable o, Object updatedInput) {
        String input = editInput.getText().toString();
        result.setText( updatedInput );
    }
    }