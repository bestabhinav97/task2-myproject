package se.company.resource;

import java.util.ArrayList;

/**
 * The SuperEmployee class represents an employee with superpowers. It extends the Employee class
 * and includes additional functionality for managing superpowers.
 * SuperEmployees do not have a salary, and their work behavior is more dynamic, involving the use of superpowers.
 */
public class SuperEmployee extends Employee {

    /** A list of superpowers held by the SuperEmployee */
    private ArrayList<SuperPower> powers;

    /**
     * Constructs a SuperEmployee with the specified name and job description (work).
     * SuperEmployees have no salary, and their powers are initialized as an empty list.
     * 
     * @param name the name of the SuperEmployee
     * @param work the job description or work of the SuperEmployee
     */
    public SuperEmployee(String name, String work) {
        super(name, work, 0); // Super employees have no salary
        this.powers = new ArrayList<>();
    }

    /**
     * Adds a superpower to the SuperEmployee's list of powers.
     * 
     * @param power the SuperPower to be added
     */
    public void addPower(SuperPower power) {
        if (power != null) {
            powers.add(power);
        }
    }

    /**
     * Provides a specific implementation of the `work` method for a SuperEmployee.
     * This method describes the SuperEmployee's work in their job area, including a list of superpowers used.
     * 
     * @return a string describing the work being done by the SuperEmployee, including their superpowers
     */
    @Override
    public String work() {
        StringBuilder workDescription = new StringBuilder();
        workDescription.append("Sup: ").append(name).append(" is saving the day in ").append(work).append(".\n");
        for (SuperPower power : powers) {
            workDescription.append("    Using superpower: ").append(power.getType())
                    .append(" - ").append(power.getDescription()).append("\n");
        }
        return workDescription.toString();
    }

    /**
     * Provides a string representation of the SuperEmployee, including the employee's unique ID,
     * name, job description (work), and a list of their superpowers.
     * 
     * @return a string representing the SuperEmployee's details with their powers
     */
    @Override
    public String toString() {
        StringBuilder powersList = new StringBuilder();
        for (SuperPower power : powers) {
            powersList.append(power.toString()).append(", ");
        }
        if (powersList.length() > 0) {
            powersList.setLength(powersList.length() - 2); // Remove trailing comma and space
        }
        return "Sup(" + empId + "): " + name + " (" + work + ") - " + powersList;
    }
}
