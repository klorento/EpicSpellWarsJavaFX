package players;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Player {
    private int hp = 25;
    private StringProperty propertyTextField = new SimpleStringProperty(this,"nameProperty");

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

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
