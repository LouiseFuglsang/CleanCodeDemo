package Model;

import java.util.Observable;

public class Model extends Observable {

    private String updatedInput;

    public void setUpdatedInput(String updatedInput) {
        this.updatedInput = updatedInput;
        setChanged();
        notifyObservers(updatedInput);
        }
    }