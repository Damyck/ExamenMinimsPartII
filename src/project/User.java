
package project;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marc on 18/11/2016.
 */
public class User  {

    String name;
    String password;
    List<Etakemon>  etak = new ArrayList<Etakemon>();

    public User(String name, String password){

        this.name = name;
        this.password = password;

    }

    public void addEtak(Etakemon etake){
        etak.add(etake);
    }



}
