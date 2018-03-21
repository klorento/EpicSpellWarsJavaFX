package players;

import card.Card;
import card.CardTreasure;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.List;

public class UserPlayer extends Player {

    private static UserPlayer instance;
    static{
        instance = new UserPlayer();
    }
    public static UserPlayer getInstance(){
        return instance;
    }

    private StringProperty propertyTextField = new SimpleStringProperty(this,"nameProperty");

    public String getPropertyTextField() {
        return propertyTextField.get();
    }

    public StringProperty propertyTextFieldProperty() {
        return propertyTextField;
    }

    public void setPropertyTextField(String propertyTextField) {
        this.propertyTextField.set(propertyTextField);
    }
}
