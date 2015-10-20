package sample;

/**
 * Created by cameronoakley on 10/20/15.
 */
public class Contact {
    String nameF;
    String phoneF;
    String emailF;

    public Contact (String name, String phone, String email){
        this.nameF = name;
        this.phoneF = phone;
        this.emailF = email;
    }
    @Override
    public String toString(){
        String done = "";
        return String.format(" %s , %s , %s ", nameF, phoneF, emailF );
    }
}
