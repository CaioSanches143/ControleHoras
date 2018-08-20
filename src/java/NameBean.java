
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import javax.enterprise.context.SessionScoped;

import javax.inject.Named;

@Named("nameList")
@SessionScoped
public class NameBean implements Serializable {

       private static final ArrayList<Name> nameList
      = new ArrayList<Name>(Arrays.asList(
      new Name("John", "Marketing"),
      new Name("Robert", "Marketing"),
      new Name("Mark", "Sales") )      
    );

    public NameBean() {
    }

       
    public ArrayList<Name> getNameList() {
        return nameList;
    }


}
