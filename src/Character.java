import java.lang.reflect.Array;

public class Character {
    public static int totalHP;
    public static String name, characterChoice;
    private static String username, password;
    private static int total, correct;
    private static double percent;


    //include standard get/set methods and a constructor.
    //other methods as needed will be added.


    /**
     * Constructor used when creating a brand-new user, for use in Database
     * @param player_name (user)name of the player
     */
    public Character(String player_name, String password)
    {
        this(0,player_name,"dragon", password);
    }

    /**
     *
     * @param difficulty the desired difficulty of the game (0-2), defaults to 2 if unexpected input
     * @param player_name (user)name of player
     * @param character character choice of the player (dragon, cat, bear)
     */
    public Character(int difficulty, String player_name, String character, String password)
    {
        if(difficulty == 0)
            totalHP = 150;
        else if(difficulty == 1)
            totalHP =  100;
        else if(difficulty == 2)
            totalHP = 50;
        else
            totalHP = 0;

        username = createUsername(player_name);
        this.password = password;
        name = player_name;
        characterChoice = character;
        total = 0;
        correct = 0;
    }

    public static String getCharacterChoice() {
        return characterChoice;
    }

    public static String getName() {
        return name;
    }

    public static int getTotalHP() {
        return totalHP;
    }

    public static void setCharacterChoice(String characterChoice) {
        Character.characterChoice = characterChoice;
    }

    public static void setTotalHP(int totalHP) {
        Character.totalHP = totalHP;
    }

    public static void setName(String name) {
        Character.name = name;
    }

    public void takeDamage(int damageTaken)
    {
        totalHP -= damageTaken;
    }

    private String createUsername(String name){
        String str = name;
        String[] splt;
        splt = str.split(" ");
        String[] FI;
        FI = splt[0].split("");
        return FI[0] + splt[1];
    }

    public static int getCorrect() {
        return correct;
    }

    public static int getTotal() {
        return total;
    }

    public static double getPercent(){
        percent = getCorrect()/getTotal();
        return percent;
    }

    public static String getPassword() {
        return password;
    }

    public static String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        String str;
        str = "Character Stats:/n" + getName() + "/n" + getUsername() + "/n" + getCharacterChoice() + "/n" + getTotalHP()
                + "/n" + getCorrect() + "/n" + getTotal() + "/n" + getPercent();
        return str;
    }
}
