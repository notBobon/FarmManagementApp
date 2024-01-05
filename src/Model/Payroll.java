/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public class Payroll {
    public double calculateBonus(IWorker worker) {
        double bonus = 0.0;
        if (worker instanceof Employee) {
            bonus = worker.getSalary();
        }
        return bonus;
    }
}

