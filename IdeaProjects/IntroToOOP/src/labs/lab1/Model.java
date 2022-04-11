package labs.lab1;

<<<<<<< HEAD
/**
 * Model Class - Lab1
 * @author Guilherme Almeida
=======
import java.sql.SQLOutput;

/**
 * Class for Model
 * @author Guilherme de Almeida
>>>>>>> main
 */
public class Model {

    public static final int INCHES_PER_FOOT = 12;
    public static final double POUNDS_PER_KG = 2.2046;
    public static final int BASE_RATE_DOLLARS_PER_HOUR = 60;
    public static final int TALL_INCHES = 67;
    public static final double THIN_POUNDS = 140.0;
    public static final int TALL_THIN_BONUS_DOLLARS_PER_HOUR = 5;
    public static final int TRAVEL_BONUS_DOLLARS_PER_HOUR = 4;
    public static final int SMOKER_DEDUCTION_DOLLARS_PER_HOUR = 10;


    private String firstName;
    private String lastName;
    private int height;
    private double weight;
    private boolean canTravel;
    private boolean smokes;

    /**
     * Default constructor
     */
    public Model() {
    }

    /**
     * 2nd Constructor
     * @param firstName - First Name
<<<<<<< HEAD
     * @param lastName - Last Name
     * @param height - Height in inches
     * @param weight - Weith in pounds
     * @param canTravel - Can travel (boolean)
     * @param smokes - Does Smokes (boolean)
=======
     * @param lastName - Last name
     * @param height - height (in inches)
     * @param weight - weight (in pounds)
     * @param canTravel - if can travel
     * @param smokes - if smokes
>>>>>>> main
     */
    public Model(String firstName, String lastName, int height, double weight, boolean canTravel, boolean smokes) {
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(height);
        setWeight(weight);
        setCanTravel(canTravel);
        setSmokes(smokes);
    }

    /**
<<<<<<< HEAD
     * 3rd Constructor (Can travel is true and Smokes is false)
     * @param firstName - First Name
     * @param lastName - Last Name
     * @param height - Height in inches
     * @param weight - Weith in pounds
     */
    public Model(String firstName, String lastName, int height, double weight) {
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(height);
        setWeight(weight);
        setCanTravel(true);
        setSmokes(false);
=======
     * 3rd Constructor
     * @param firstName - First Name
     * @param lastName - Last name
     * @param height - height (in inches)
     * @param weight - weight (in pounds)
     */
    public Model(String firstName, String lastName, int height, double weight) {
        this(firstName,lastName,height,weight,true,false);
>>>>>>> main
    }

    /**
     * Get First Name
<<<<<<< HEAD
     * @return the 1st name (String)
=======
     * @return the first name
>>>>>>> main
     */
    public String getFirstName() {
        return firstName;
    }

    /**
<<<<<<< HEAD
     * Get Last Name
     * @return last name (String)
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Get Height
     * @return the height in inches
     */
    public int getHeight() {
        return height;
    }

    /**
     * Get Weight
     * @return the weight in pounds (double)
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Get Weight Kg
     * @return the weight in kilograms (long)
     */
    public long getWeightKg() {
        return Math.round(getWeight() / Model.POUNDS_PER_KG);
    }

    /**
     * Is Can Travel?
     * @return if the model can travel (boolean)
     */
    public boolean isCanTravel() {
        return canTravel;
    }

    /**
     * Is Smokes?
     * @return if the model smokes (boolean)
     */
    public boolean isSmokes() {
        return smokes;
    }

    /**
     * Set First Name
     * @param firstName - First Name (String)
=======
     * Set first name
     * @param firstName - First Name of the Model
>>>>>>> main
     */
    public void setFirstName(String firstName) {
        if (firstName.length() >= 3 && firstName.length() <= 20) {
            this.firstName = firstName;
        }
    }

    /**
<<<<<<< HEAD
     * Set Last Name
     * @param lastName - Last Name (String)
=======
     * Get Last Name
     * @return the Last Name of the model
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set Last Name
     * @param lastName - Last Name of the model
>>>>>>> main
     */
    public void setLastName(String lastName) {
        if (lastName.length() >= 3 && lastName.length() <= 20) {
            this.lastName = lastName;
        }
    }

    /**
<<<<<<< HEAD
     * Set Height
     * @param inches - Height in inches (int)
=======
     * Get Height
     * @return the height of the model (in inches)
     */
    public int getHeight() {
        return height;
    }

    /**
     * Set Height
     * height must be 24 to 84 inches or it won't be stored
     * @param inches - The height of the model (in inches)
>>>>>>> main
     */
    public void setHeight(int inches) {
        if (inches >= 24 && inches <= 84) {
            this.height = inches;
        }
    }

    /**
<<<<<<< HEAD
     * Set Height - Inches and Feet
     * @param feet - Feet (int)
     * @param inches - Inches (int)
     */
    public void setHeight(int feet, int inches) {
        setHeight((feet * Model.INCHES_PER_FOOT) + inches);
    }

    /**
     * Set Weight in pounds
     * @param pounds - Weight in pounds (double)
=======
     * Set Height (feet and inches)
     * @param feet
     * @param inches
     */
    public void setHeight(int feet, int inches) {
        int inch = (feet * Model.INCHES_PER_FOOT) + inches;
        setHeight(inch);
    }

    /**
     * Get Weight
     * @return the weight in pounds
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Set weight in pounds
     * @param pounds (weight)
>>>>>>> main
     */
    public void setWeight(double pounds) {
        if (pounds >= 80 && pounds <= 280) {
            this.weight = pounds;
        }
    }

    /**
<<<<<<< HEAD
     * Set Weight in kilograms
     * @param kilograms - Weight in kilograms (long)
     */
    public void setWeight(long kilograms) {
        setWeight(kilograms * Model.POUNDS_PER_KG);
    }

    /**
     * Set Can Travel
     * @param canTravel - if model can travel (boolean)
=======
     * Set weight in kilograms
     * @param kilograms (weight)
     */
    public void setWeight(long kilograms) {
        double pounds = kilograms * Model.POUNDS_PER_KG;
        setWeight(pounds);
    }

    /**
     * Return if the model can travel
     * @return boolean if can travel
     */
    public boolean isCanTravel() {
        return canTravel;
    }

    /**
     * Set if can travel
     * @param canTravel (boolean)
>>>>>>> main
     */
    public void setCanTravel(boolean canTravel) {
        this.canTravel = canTravel;
    }

    /**
<<<<<<< HEAD
     * Set Smokes
     * @param smokes - if model smokes (boolean)
=======
     * Return if the model smokes
     * @return boolean
     */
    public boolean isSmokes() {
        return smokes;
    }

    /**
     * Set if the model smoke
     * @param smokes (boolean)
>>>>>>> main
     */
    public void setSmokes(boolean smokes) {
        this.smokes = smokes;
    }

    /**
     * Get Height in Feet and Inches
<<<<<<< HEAD
     * @return the height in Feet and Inches (String)
     */
    public String getHeightInFeetAndInches() {
        int feet = getHeight() / Model.INCHES_PER_FOOT;
        int inch = getHeight() % Model.INCHES_PER_FOOT;
        String result = String.valueOf(feet) + " feet";
        if (inch > 0) {
            result = result + " " + String.valueOf(inch) + ((inch > 1) ? " inches" : " inch");
=======
     * @return string with the height
     */
    public String getHeightInFeetAndInches() {
        int feet = getHeight() / Model.INCHES_PER_FOOT;
        int inches = getHeight() % Model.INCHES_PER_FOOT;
        String result = String.valueOf(feet) + " feet";
        if (inches > 0) {
            result += " " + String.valueOf(inches) + " ";
            result += (inches > 1) ? "inches" : "inch";
>>>>>>> main
        }
        return result;
    }

    /**
<<<<<<< HEAD
     * Prints Details of the Model (Name, Height, Weight, If travel and If Smokes)
=======
     * Return the weight in kilograms
     * @return wight in kilograms (long)
     */
    public long getWeightKg() {
        return Math.round(weight / Model.POUNDS_PER_KG);
    }

    /**
     * Print Name, Height, Weight, Travel and Smoke information
>>>>>>> main
     */
    public void printDetails() {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeight() + " inches");
<<<<<<< HEAD
        System.out.println("Weight: " + getWeight() + " pounds");
=======
        System.out.println("Weight: " + Math.round(getWeight()) + " pounds");
>>>>>>> main
        if (isCanTravel()) {
            System.out.println("Does travel");
        } else {
            System.out.println("Does not travel");
        }
        if (isSmokes()) {
            System.out.println("Does smoke");
        } else {
            System.out.println("Does not smoke");
        }
    }

    /**
     * Calculate Pay Dollars Per Hour
<<<<<<< HEAD
     * @return model's per-hour pay rate (int)
     */
    public int calculatePayDollarsPerHour() {
        int rate = Model.BASE_RATE_DOLLARS_PER_HOUR;
        if (getHeight() >= Model.TALL_INCHES && getWeight() < Model.THIN_POUNDS) {
            rate += Model.TALL_THIN_BONUS_DOLLARS_PER_HOUR;
        }
        if (isCanTravel()) {
            rate += Model.TRAVEL_BONUS_DOLLARS_PER_HOUR;
        }
        if (isSmokes()) {
            rate -= Model.SMOKER_DEDUCTION_DOLLARS_PER_HOUR;
        }
        return rate;
    }

    /**
     * Display Model Details (Name, Height, Weight, Travel, Smoke, Hourly rate)
     */
    public void displayModelDetails() {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeightInFeetAndInches());
        System.out.println("Weight: " + getWeight() + " pounds");
        System.out.println("Travels: " + ((isCanTravel()) ? "yep" : "nope"));
        System.out.println("Smokes: " + ((isSmokes()) ? "yep" : "nope"));
        System.out.println("Hourly rate: $" + calculatePayDollarsPerHour());

    }
=======
     * @return an int value with the value of Dollars per Hour
     */
    public int calculatePayDollarsPerHour() {
        int salary = Model.BASE_RATE_DOLLARS_PER_HOUR;
        if (getHeight() >= Model.TALL_INCHES && getWeight() < Model.THIN_POUNDS) {
            salary += Model.TALL_THIN_BONUS_DOLLARS_PER_HOUR;
        }
        if (isCanTravel()) {
            salary += Model.TRAVEL_BONUS_DOLLARS_PER_HOUR;
        }
        if (isSmokes()) {
            salary -= Model.SMOKER_DEDUCTION_DOLLARS_PER_HOUR;
        }
        return salary;
    }

    /**
     * Print Model Details (Name, Height, Weight, Travel, Smokes e Hourly Rate)
     */
    public void displayModelDetails() {
//        printDetails();
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Height: " + getHeightInFeetAndInches());
        System.out.println("Weight: " + getWeight() + " pounds");
        System.out.println("Travel: " + ((isCanTravel()) ? "yep" : "nope")) ;
        System.out.println("Smokes: " + ((isSmokes()) ? "yep" : "nope"));
        System.out.println("Hourly rate: $" + calculatePayDollarsPerHour());
    }

>>>>>>> main
}
