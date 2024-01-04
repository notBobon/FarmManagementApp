/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author User
 */
public interface IWorker {
    //Positions
    String COORDINATOR_POSITION = "COORDINATOR";
    String ASSISTANT_POSITION = "ASSISTANT";
    String SECRETARY_POSITION = "SECRETARY";
    
    String SALES_MANAGER_POSITION = "SALES MANAGER";
    String SALES_EMPLOYEE_POSITION = "SALES EMPLOYEE";
    String SALES_ASSISTANT_POSITION = "SALES ASSISTANT";
    //Salaries
    double COORDINATOR_SALARY = 3000.0;
    double ASSISTANT_SALARY = 2500.0;
    double SECRETARY_SALARY = 1800.0;
    //Hourly Pay
    double HOURLY_PAY = 70.0;
    //Operations
    double getSalary();
}

