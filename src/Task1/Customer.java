package Task1;

public class Customer {
    /*
    1.a Lav en klasse, Customer, med attributterne (felterne/instansvariablene):
    String firstName
    String lastName
    String username
    int id
    static int counter
    */
    private String firstName;
    private String lastName;
    private String username;
    private int id;
    private static int counter;

    //1.b Klassen skal have en konstruktør, der tager kundens navn og brugernavn som parametre.
    public Customer(String firstName, String lastName, String username){
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        //1.c Sørg for at counter tælles op med 1, hver gang konstruktoren bliver kaldt. Brug counter til at initialisere id
        counter++;
        id = counter;
    }

    //1.d Giv klassen en toString() metode, der printer kundens detaljer pænt ud. Gør alle klassens felter private, og tilføj getters og setters.
    public String toString(){
        return firstName + " " + lastName + " (" + username + ") " + "- ID: " + id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}