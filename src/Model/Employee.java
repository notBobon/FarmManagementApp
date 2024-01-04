/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public class Employee implements IWorker {
    private String position;

    public Employee() {

    }

    public Employee(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public double getSalary() {
        double salary = 0.0;
        if (this.position.equals(COORDINATOR_POSITION)) {
            salary = COORDINATOR_SALARY;
        } else if (this.position.equals(ASSISTANT_POSITION)) {
            salary = ASSISTANT_SALARY;
        } else if (this.position.equals(SECRETARY_POSITION)) {
            salary = SECRETARY_SALARY;
        }
        return salary;
    }
}

