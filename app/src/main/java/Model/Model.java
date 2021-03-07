package Model;

import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Model extends Observable {

    private String updatedInput;

    public void setUpdatedInput(String updatedInput) {
        this.updatedInput = updatedInput;
        setChanged();
        notifyObservers(updatedInput);
        }
    }