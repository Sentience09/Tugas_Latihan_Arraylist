import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    
    private ArrayList<Akun> akuns = new ArrayList<Akun>();

    public Customer(String f, String l) {
        firstName = f;
        lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAkun(Akun acct) {
        akuns.add(acct); 
    }

    public Akun getAkun(int akun_index) {
        return akuns.get(akun_index); 
    }
    
    public int getNumOfakun() {
        return akuns.size(); 
    }
}