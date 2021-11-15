
/**
 * Write a description of class LunchTime here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LunchTime
{
    public static int minutesUntilLunch(int curHr, int curMn)//before 1pm
    {
        if(curHr < 13)
        {
            /**
             * Every time this program returns the total minutes left
             * it gives a negative value to solve this I will use the
             * math function in java to get the absolute value
             */
            curHr -= 13;//13 represent 1pm military time
            curHr *= 60;//multiply 60 to get minutes from the hour the left  until lunch
            curMn -= 60;//Subtracts the curMn from 60 to get the amount of minutes until luncj
            int timeLeft = curHr + curMn;
            return Math.abs(timeLeft);
        }
        return 0;
    }
}
