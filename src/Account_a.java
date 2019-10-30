/**
 * Generic class for all users of the game. Currently in testing stages. All it requires is name, username, and password.
 *
 * @version 25.10.2019
 * @author Benjamin Williams
 */

public abstract class Account_a {
    public String name, username, password;

    /*
     * This is a constructor which holds the users name, username, and password
     *
     * @param n, Name of User
     * @param u, Username for Login
     * @param p, Password for Login
     */
    public Account_a(String n, String u, String p)
    {
        name = n;
        username = u;
        password = p;
    }

    // getter for Name
    public String getName() {
        return name;
    }

    //getter for Password
    public String getPassword() {
        return password;
    }

    //getter for Username
    public String getUsername() {
        return username;
    }

    /*
    * Returns a String containing Name, Username, and Password.
    */
    @Override
    public String toString() {
        return (getName() + "\n" + getUsername() + "\n" + getPassword() + "\n");
    }
}
