package additionalTasks.onlineReader;

public class User {

    private int id;
    private String name;
    private String surname;
    private String email;

    private static int totalOnline = 0;

    public User(int id, String name, String surname, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        totalOnline++;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public static int getTotalOnline() {
        return totalOnline;
    }
}
