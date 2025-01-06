package se.company.resource;

/**
 * The NormalEmployee class represents an employee of the normal type who extends from the Employee class.
 * It overrides the `work` method to provide a specific work description and customizes the `toString` method
 * to include the employee's ID in the output.
 */
public class NormalEmployee extends Employee {
    
    /**
     * Constructs a NormalEmployee with the specified name, job description, and salary.
     * This constructor invokes the superclass constructor to initialize the common properties,
     * including the employee ID.
     * 
     * @param name the name of the employee
     * @param work the job description or work of the employee
     * @param salary the salary of the employee
     */
    public NormalEmployee(String name, String work, int salary) {
        super(name, work, salary);
    }

    /**
     * Provides a specific implementation of the `work` method for a NormalEmployee.
     * This method describes the employee as working on a report in the specified work area.
     * 
     * @return a string describing the work being done by the normal employee
     */
    @Override
    public String work() {
        return "Emp: " + name + " is working on a report in " + work + ".";
    }

    /**
     * Provides a string representation of the NormalEmployee, including the employee's unique ID,
     * name, and job description (work).
     * 
     * @return a string representing the normal employee's details with their ID
     */
    @Override
    public String toString() {
        return "Emp(" + empId + "): " + name + " (" + work + ")";
    }
}
