/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.HashMap;
import java.util.Map;
import Model.Employee;
import Model.IWorker;
import Model.Payroll;

public class EmployeeController {
    public static final String EMPLOYEE_TYPE = "EMPLOYEE";
    
    public String[] getPositions(){
        String[] positions = {IWorker.SALES_EMPLOYEE_POSITION, IWorker.SALES_MANAGER_POSITION, IWorker.SALES_ASSISTANT_POSITION};
        return positions;
    }
    
    public Map<String, Double> process(String type, String position, int hours){
        Map<String, Double> result = new HashMap<String, Double>();
        //Worker
        Payroll payroll = new Payroll();
        IWorker worker;
        worker = new Employee(position);
        //Process
        result.put("Salary", worker.getSalary());
        result.put("Bonus", payroll.calculateBonus(worker));
        return result;
    }
}

