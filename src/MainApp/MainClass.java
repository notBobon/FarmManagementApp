/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainApp;

import Helper.Database;
import View.WorkerView;

public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO application logic here
        WorkerView.main(null);
        Database db = new Database();
    }
}
