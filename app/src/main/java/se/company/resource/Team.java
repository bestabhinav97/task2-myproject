package se.company.resource;

import java.util.ArrayList;

/**
 * The Team class represents a collection of employees who work together as a team.
 * It provides methods to add members, display the team's work, and get information about the team.
 */
public class Team {
   
    /** A list of employees who are members of the team */
    private ArrayList<Employee> members = new ArrayList<>();

    /**
     * Adds an employee to the team.
     * 
     * @param emp the employee to be added to the team
     */
    public void add(Employee emp) {
        members.add(emp);
    }

    /**
     * Generates a summary of the work being done by the team members.
     * It calls the `work` method of each employee and constructs a string of tasks.
     * 
     * @return a string describing the work being done by all team members
     */
    public String work() {
        StringBuilder sb = new StringBuilder("# TEAM is working:\n");
        for (Employee member : members) {
            String task = member.work();
            if (!task.isEmpty()) {
                sb.append("  ").append(task).append("\n");
            }
        }
        return sb.toString();
    }

    /**
     * Provides a string representation of the team, including details of each member.
     * If the team is empty, a message indicating this is returned.
     * 
     * @return a string representing the team and its members
     */
    @Override
    public String toString() {
        if (members.isEmpty()) {
            return "# TEAM:\n (empty team)";
        } else {
            StringBuilder sb = new StringBuilder("# TEAM:\n");
            for (Employee member : members) {
                sb.append(member.toString()).append("\n");
            }
            return sb.toString();
        }
    }

    /**
     * Returns the list of members of the team.
     * 
     * @return an ArrayList containing the team members (employees)
     */
    public ArrayList<Employee> getMembers() {
        return members;
    }
}
