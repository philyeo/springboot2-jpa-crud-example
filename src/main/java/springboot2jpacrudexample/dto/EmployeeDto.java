package springboot2jpacrudexample.dto;


import javax.validation.constraints.Size;

/*
 * Data Transfer Object for Employee
 */
public class EmployeeDto {

    @Size(max = 80)
    private String firstName;

    @Size(max = 80)
    private String lastName;

    @Size(max = 150)
    private String emailId;

    public EmployeeDto(String firstName, String lastName, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }

    protected EmployeeDto() {};

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
