import java.util.*;

/**
 * Class to both hold student information and return a string of all properties.
 * @author Justin Reich
 * @version 1.0
 */
public class StudentInfo implements Comparable<StudentInfo> {
    public String firstName;
    public String lastName;
    public int score;

    /**
     * Constructor to set argument values to properties
     * @param firstName user entered student first name
     * @param lastName user entered student last name
     * @param score user entered student score
     */
    public StudentInfo(String firstName, String lastName, int score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }

    /**
     * A method to return a string of the instantiated object's properties
     * @return a string of the instantiated object's properties
     */
    public String studentInfoMessage() {
        return firstName + " " + lastName + " made a " + score + ".";
    }

    @Override
    public int compareTo(StudentInfo s) {

        //ascending order
        return this.lastName.compareTo(s.lastName);
    }
}

