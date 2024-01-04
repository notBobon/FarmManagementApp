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
public class Teacher implements IWorker {
    private int hours;

    public Teacher() {
    }

    public Teacher(int hours) {
        this.hours = hours;
    }

    @Override
    public double getSalary() {
        double salary;
        salary = this.hours * HOURLY_PAY;
        return salary;
    }
}

