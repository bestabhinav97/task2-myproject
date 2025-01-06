package se.company.resource;

/**
 * The SuperPower class represents a superpower with a type and a description.
 * This class is used by SuperEmployees to define their special abilities.
 */
public class SuperPower {
    
    /** The type of the superpower (e.g., "Flight", "Strength") */
    private String type;
    
    /** A description of the superpower (e.g., "Ability to fly", "Superhuman strength") */
    private String description;

    /**
     * Constructs a SuperPower with the specified type and description.
     * 
     * @param type the type of the superpower (e.g., "Flight", "Strength")
     * @param description a description of the superpower (e.g., "Ability to fly", "Superhuman strength")
     */
    public SuperPower(String type, String description) {
        this.type = type;
        this.description = description;
    }

    /**
     * Returns the type of the superpower.
     * 
     * @return the type of the superpower
     */
    public String getType() {
        return type;
    }

    /**
     * Provides a string representation of the SuperPower by returning its type.
     * This method is overridden from the Object class to provide a simple output.
     * 
     * @return a string representing the type of the superpower
     */
    @Override
    public String toString() {
        return type;
    }

    /**
     * Returns the description of the superpower.
     * 
     * @return the description of the superpower
     */
    public String getDescription() {
        return description;
    }
}
