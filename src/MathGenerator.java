import java.lang.Math;
import java.util.Scanner;

public class MathGenerator {
    public static int questions = 10;
    private int value1, value2;
    public MathObject[] questionList = new MathObject[questions];
    //array of questions to fill out

    // constructor
    public MathGenerator() {

    }


    /**
     * Method that generates a set number of problems (default: 10) and saves them to an array of MathObjects.
     * Numbers will be randomly generated between 0 and the given limit. For subtraction, first number will
     * always be larger to prevent negative numbers.
     * @param highBound the largest number allowed to be generated, exclusive
     */
    public void generateEquation(int highBound)
    {
        for(int i = 0; i < questions; i++)
        {
            value1 = (int)Math.abs(Math.random() * highBound);
            value2 = (int)Math.abs(Math.random() * highBound);

            int operand = (int)Math.abs(Math.random()*2);
            //0 == add, 1 == subtract

            int answer = 0;


            //add
            if(operand == 0)
            {
                answer = value1 + value2;
                questionList[i] = new MathObject(value1, operand, value2, answer);
            }
            else
            {
                if(value2 > value1)
                {
                    int temp = value2;
                    value2 = value1;
                    value1 = temp;
                }

                answer = value1 - value2;
                questionList[i] = new MathObject(value1, operand, value2, answer);
            }
        }
    }

    
    /**
     * This allows the teacher to input their own math problems if they wish.
     * @return
     */
    public static int[] teacherAddOns() {
        // TODO: 10/7/2019
        // Method that allows teacher to add custom-defined problems that
        return null;
    }

}


// need to be able to code for the teacher to look at the student's scores
// need to be able to add math problems to the system