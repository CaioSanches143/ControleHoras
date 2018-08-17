
import java.io.Serializable;

public class name implements Serializable{
    private String frist;
    private String last;
    private boolean isEditable;
    public name(String frist, String last) {
        this.frist = frist;
        this.last = last;
        this.isEditable = true;
    }

    public String getFrist() {
        return frist;
    }

    public void setFrist(String frist) {
        this.frist = frist;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public boolean isIsEditable() {
        return isEditable;
    }

    public void setIsEditable(boolean isEditable) {
        this.isEditable = isEditable;
    }
    
    
    
}
