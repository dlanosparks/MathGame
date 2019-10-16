
public class Account
{
    private String username, password;
    private int score;
    private Character choice;


    public Account(String username, String password, Character newCharacter)
    {
        this.username = username;
        this.password = password;
        this.choice = newCharacter;
        score = 0;
    }

    public void setUsername(String newUsername){
        this.username = newUsername;
    }

    public void setPassword(String newPassword){
        this.password = newPassword;
    }

    public void setScore(int newScore){
        this.score = newScore;
    }

    public String getUsername()
    {
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    public int getScore(){
        return this.score;
    }

    public Character getCharacter() {
        return this.choice;     }
}

