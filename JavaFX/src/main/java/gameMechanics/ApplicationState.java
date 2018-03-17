package gameMechanics;

public class ApplicationState {
    private static ApplicationState instance;
    static{
        instance = new ApplicationState();
        }
        public static ApplicationState getInstance(){
        return instance;
        }
        private String wizardPicture;
    private String wizardPictureMaly;

    public String getWizardPictureMaly() {
        return wizardPictureMaly;
    }

    public void setWizardPictureMaly(String wizardPictureMaly) {
        this.wizardPictureMaly = wizardPictureMaly;
    }

    public String getWizardPicture() {
        return wizardPicture;
    }

    public void setWizardPicture(String wizardPicture) {
        this.wizardPicture = wizardPicture;
    }

    private String wizardName;
    public String getWizardName() {
        return wizardName;

    }
    public void setWizardName(String wizardName) {
        this.wizardName = wizardName;
        }
}
