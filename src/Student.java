/**The student class. This class contains all of the data for students, which is mostly the same as the abstract
 * Account class, but includes game features such as HP, character selection, and a recording of the answers
 * a student has submitted.
 *
 * @version 25.10.2019
 * @author Benjamin Williams
 */

public class Student extends Account_a {
    public String character_type;
    public int HP, ansCorrect, ansAttempt;

    //Note that difficulty is not saved by this class: this will be handled dynamically within the game itself.

    /**
    * Constructor For Student Class. It holds Name, Username, Password, and Character Type
    */
    public Student(String n, String u, String p, String ch)
    {
        super(n,u,p);
        character_type = ch;
        ansCorrect = 0;
        ansAttempt = 0;
        HP = 100;
    }

    //Getter Methods

    // getter for HP
    public int getHP() {
        return HP;
    }

    // getter for Attempted Answer
    public int getAnsAttempt() {
        return ansAttempt;
    }

    // getter for Correct Answer
    public int getAnsCorrect() {
        return ansCorrect;
    }

    // getter for Character Type
    public String getCharacter_type() {
        return character_type;
    }

    //Setter Methods


    /** 
    * setter for Attempted Answer
    */
    public void setAnsAttempt(int ansAttempt) {
        this.ansAttempt = ansAttempt;
    }

    /** 
    * setter for Correct Answer
    */
    public void setAnsCorrect(int ansCorrect) {
        this.ansCorrect = ansCorrect;
    }

    /** 
    * setter for Character Type
    */
    //I don't expect us to need to use this, but in case a user decides to change their character type
    public void setCharacter_type(String character_type) {
        this.character_type = character_type;
    }

    /** 
    * setter for HP
    */
    public void setHP(int HP) {
        this.HP = HP;
    }


    /** 
    * Returns a string Containing Name, Username, Password, HP, the Correct Answer, User's Attempted Answer, and User's Character Type
    */
    @Override
    public String toString() {
        return (super.toString() + getHP() + "\n" + getAnsCorrect() + "\n" + getAnsAttempt() + "\n" + getCharacter_type());
    }

}
