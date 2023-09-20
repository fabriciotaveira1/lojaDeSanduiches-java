/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.control;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author contabilidade
 */
public class Calculus {
    private double nameSandwich;
    private double valueSandwich;
    private double totalSold;
    private double dearSandwich;
    private int smaller25;    

    public double getNameSandwich() {
        return nameSandwich;
    }

    public void setNameSandwich(double nameSandwich) {
        this.nameSandwich = nameSandwich;
    }

    public double getValueSandwich() {
        return valueSandwich;
    }
    
    public void setValueSandwich(double valueSandwich) {
        this.valueSandwich = valueSandwich;

        // Atualiza o valor mais caro
        if (valueSandwich > dearSandwich) {
            dearSandwich = valueSandwich;
        }

        // Atualiza o total vendido
        totalSold += valueSandwich;

        // Verifica se o sanduíche custa menos de R$25,00
        if (valueSandwich < 25.0) {
            smaller25++;
        }
    }

    public double dearSandwich() {
        return dearSandwich;
    }

    public double totalSold() {
        return totalSold;
    }

    public int smaller25() {
        return smaller25;
    }
    
}
