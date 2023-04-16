/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.daily_coding_problem_problem_23;

/**
 *
 * @author carmitnaor
 */

import java.util.Arrays;
public class Daily_Coding_Problem_Problem_23 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        String[][] matrix = new String [][] {{"f", "f", "f", "f"},
                                        {"t", "t", "f", "t"},
                                        {"f", "f", "f", "f"},
                                        {"f", "f", "f", "f"}};



        
        
        solveMatrix ref = new solveMatrix(matrix,0, 0);
        
        ref.toString();
        ref.search(3, 0, 0);
        
        System.out.println(ref.getLeastSteps());
        
        
        
    }
}
