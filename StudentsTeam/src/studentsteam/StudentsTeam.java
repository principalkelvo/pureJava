/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentsteam;

/**
 *
 * @author KELVO FRAYAY
 */
public class StudentsTeam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int students,studentsPerTeam,teams,studentsRemainder;
        students=30;
        studentsPerTeam=9;
        teams=students/studentsPerTeam;
        System.out.println("Teams = "+ teams);
        studentsRemainder=students%studentsPerTeam;
        System.out.println("Remainder = "+studentsRemainder);
        // TODO code application logic here
    }
    
}
