
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import javax.enterprise.context.SessionScoped;

import javax.inject.Named;

@Named("nameList")
@SessionScoped
public class NameBean implements Serializable {

    private static ArrayList<Name> nameList;

    public NameBean() {
        nameList = new ArrayList<Name>();
        nameList.add(new Name("John", "Marketing"));
        nameList.add(new Name("John", "1"));
        nameList.add(new Name("John", "2"));
        nameList.add(new Name("John", "Marketing"));
        nameList.add(new Name("John", "1"));
        nameList.add(new Name("John", "2"));
        nameList.add(new Name("John", "Marketing"));
        nameList.add(new Name("John", "1"));
        nameList.add(new Name("John", "2"));
        nameList.add(new Name("John", "Marketing"));
        nameList.add(new Name("John", "1"));
        nameList.add(new Name("John", "2"));
        nameList.add(new Name("John", "Marketing"));
        nameList.add(new Name("John", "1"));
        nameList.add(new Name("John", "2"));
        nameList.add(new Name("John", "Marketing"));
        nameList.add(new Name("John", "1"));
        nameList.add(new Name("John", "2"));
        nameList.add(new Name("John", "Marketing"));
        nameList.add(new Name("John", "1"));
        nameList.add(new Name("John", "2"));
        nameList.add(new Name("John", "Marketing"));
        nameList.add(new Name("John", "1"));
        nameList.add(new Name("John", "2"));
        nameList.add(new Name("John", "Marketing"));
        nameList.add(new Name("John", "1"));
        nameList.add(new Name("John", "2"));
        nameList.add(new Name("John", "Marketing"));
        nameList.add(new Name("John", "1"));
        nameList.add(new Name("John", "2"));
        nameList.add(new Name("John", "Marketing"));
        nameList.add(new Name("John", "1"));
        nameList.add(new Name("John", "2"));
        nameList.add(new Name("John", "Marketing"));
        nameList.add(new Name("John", "1"));
        nameList.add(new Name("John", "2"));

    }

    public ArrayList<Name> getNameList() {
        return nameList;
    }

    public String saveTodosNames() {

        //get all existing value but set "editable" to false 
        for (Name nameList : nameList) {
            nameList.setIsEditable(false);
        }
        //return to current page
        return null;

    }

    public String deleteName(Name n) {
        nameList.remove(n);
        return null;
    }

    public String salvaName(Name n) {
        n.setIsEditable(false);
        return null;
    }

}
