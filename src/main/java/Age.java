package main.java;
/*
 * Name: Ultan Sweeney
 * Student ID: l00183669
 */
public class Age {
    //Instance variables
    /*
     * Child -> 0 - 12 years old
     * Teen -> 13 - 19 years old
     * Adult -> 20 - 64 years old
     * Senior -> 65+ years old
     */
    private int age;
    private final int CHILD_MAX_AGE = 12;
    private final int TEEN_MAX_AGE = 19;
    private final int ADULT_MAX_AGE = 64;

    //Constructors
    public Age(int age) {
        setAge(age);
    }

    //Methods
    private int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("ERROR - Age cannot be negative.");
        } else if (age > 130) {
            throw new IllegalArgumentException("ERROR - age seems unrealistic (greater than 130).");
        }
        this.age = age;
    }

    public String getAgeCategory() {
        if (age <= CHILD_MAX_AGE) {
            return "Child";
        } else if (age <= TEEN_MAX_AGE) {
            return "Teen";
        } else if (age <= ADULT_MAX_AGE) {
            return "Adult";
        } else {
            return "Senior";
        }
    }

}// end Age class
