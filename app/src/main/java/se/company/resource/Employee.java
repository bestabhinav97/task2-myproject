package se.company.resource;

/**
 * The Employee class represents an employee with a name, a job description (work), salary, and an employee ID.
 * It also includes methods to generate a unique employee ID and return the employee's details.
 */
class Employee {
    
    /** The name of the employee */
    protected String name;
    
    /** The job description or work of the employee */
    protected String work;
    
    /** The salary of the employee */
    protected int salary;
    
    /** The unique employee ID */
    protected int empId;

    /** A static counter to generate unique employee IDs */
    private static int globalEmpId = 0;

    /**
     * Constructs an Employee with the specified name, job description, and salary.
     * This constructor also assigns a unique employee ID to the employee.
     * 
     * @param name the name of the employee
     * @param work the job description or work of the employee
     * @param salary the salary of the employee
     */
    public Employee(String name, String work, int salary) {
        this.name = name;
        this.work = work;
        this.salary = salary;
        this.empId = getNewId(); // Assign a unique ID
    }

    /**
     * A default work method for the base Employee class.
     * In this class, it returns an empty string, indicating no specific work behavior.
     * 
     * @return an empty string representing the default work behavior
     */
    public String work() {
        return ""; // Default behavior for base class
    }

    /**
     * Generates a new unique employee ID by incrementing the static globalEmpId counter.
     * 
     * @return the newly generated employee ID
     */
    public static int getNewId() {
        return ++globalEmpId;  // Increment the globalEmpId and return the new ID
    }

    /**
     * Returns the employee's unique ID.
     * 
     * @return the employee ID
     */
    public int getEmpId() {
        return empId;  // Getter for employee ID
    }

    /**
     * Provides a string representation of the Employee, including the name and job description.
     * 
     * @return a string representing the employee's name and work
     */
    @Override
    public String toString() {
        return "Emp: " + name + " (" + work + ")";
    }

    /**
     * Returns the name of the employee.
     * 
     * @return the name of the employee
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the salary of the employee.
     * 
     * @return the salary of the employee
     */
    public int getSalary() {
        return salary;
    }
}
