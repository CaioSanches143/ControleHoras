
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import javax.inject.Named;

@Named
public class nameBean implements Serializable {

    private final ArrayList<name> listNames = new ArrayList<>(Arrays.asList(
            new name("caio", "Sanches"),
            new name("Lais", "Perdomo"),
            new name("Natasha", "Sanches")
    ));

    public ArrayList<name> getNames() {
        return listNames;
    }
    
    public String deleteRow (name nameToDelete){
    listNames.remove(nameToDelete);
    return null;}

}
