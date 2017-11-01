/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.analyzer;

import ec.edu.espe.model.History;

import ec.edu.espe.model.Analyst;
public class Comparer {
    public static void main(String[] args) {
        Analyst diego = new Analyst("Diego","DVHH",new History());
        diego.setName("Diego");
        diego.setInitials("DVHH");
        System.out.println("The name is: "+diego.getName()+"");
        System.out.println("The initials is: "+diego.getInitials()+"");
    }
}
