/*
 * Name: Ultan Sweeney
 * Student ID: l00183669
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
    private static final Logger LOGGER = LoggerFactory.getLogger(Age.class);

    //Constructors
    public Age(int age) {
        setAge(age);
    }

    //Methods
    @SuppressWarnings("unused")
    private int getAge() {
        logger.info("Creating Age object with value: {}", age);
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            logger.warn("Invalid age provided (negative): {}", age);
            throw new IllegalArgumentException("ERROR - Age cannot be negative.");
        } else if (age > 130) {
            logger.warn("Invalid age provided (unrealistic): {}", age);
            throw new IllegalArgumentException("ERROR - age seems unrealistic (greater than 130).");
        }
        this.age = age;
        logger.info("Age successfully set to {}", age);
    }

    public String getAgeCategory() {
        String category;
        
        if (age <= CHILD_MAX_AGE) {
            category = "Child";
        } else if (age <= TEEN_MAX_AGE) {
            category = "Teen";
        } else if (age <= ADULT_MAX_AGE) {
            category = "Adult";
        } else {
            category = "Senior";
        }
        logger.debug("Computed age category '{}' for age {}", category, age);
        return category;
    }

}// end Age class
