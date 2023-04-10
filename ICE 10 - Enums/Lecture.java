/*
 * Name: Kuldeep Mohanta
 * Date: April 9th, 2023
 * App Name: ClassSchedule
 * 
 */

//New Data type - called Period 
enum Period {AM, PM};

//New Data type - called WeekDay
enum WeekDay {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    /*
     * @return an Integer that matches the options menu 
     */
    int getOption()
    {
        //Convert
        return ordinal()+1;
    }
}
public class Lecture
{
    //Private - only this class has access to them
    private String name;
    private int time;
    private Period period;
    private WeekDay day;

    /*
     * Constructor - Generate an object
     * @param name lecture name
     * @param time what hour is this lecture
     * @param period AM Or PM
     * @param day Enum Weekday
     * 
     */
    public Lecture(String name, int time, Period period, WeekDay day) 
    {
        this.name = name;
        this.time = time;
        this.period = period;
        this.day = day;
    }

    //Return the lecture name
    public String getName() 
    {
        return name;
    }

    //Convert the time to show Hour
    // E.g. 11 will return 11:10
    public String getTime() 
    {
        return time + ":10";
    }

    public Period getPeriod() 
    {
        return period;
    }

    //return the WeekDay enum
    public WeekDay getDay() 
    {
        return day;
    }
}