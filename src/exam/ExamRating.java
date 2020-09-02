package exam;

public class ExamRating {

    private final int GRADE_2 = 20;
    private final int GRADE_3 = 40;
    private final int GRADE_4 = 60;
    private final int GRADE_5 = 80;
    private final int GRADE_6 = 90;


                                        // De mire módosítsam a levelt?
    public int getRating(final int score, final Levels level)
    {
        int result = 1;
        /** BASIC := 10, MID := 0, HIGH = -10 */
        int diff = 0;


        if (level == Levels.MID && score == GRADE_6){

            System.out.println("New mark");
        }

        /** LOGIC */

        if(level == Levels.BASIC)
        {
            diff = 10;
        }
        else if (level == Levels.ADVANCED)
        {
            diff = -10;
        }
        else
        {
            // diff = 0;
        }


        if(score >= (GRADE_5 + diff))
        {
            result = 5;
        }
        else if ((GRADE_4 + diff) <= score)
        {
            result = 4;
        }
        else if ((GRADE_3 + diff) <= score)
        {
            result = 3;
        }
        else if ((GRADE_2 + diff) <= score)
        {
            result = 2;
        }
        else
        {
            // result = 1;
        }

        /** LOGIC */

        return result;
    }

    /*
    6. feladat: Kiírja mindkét sort.
     */
}
