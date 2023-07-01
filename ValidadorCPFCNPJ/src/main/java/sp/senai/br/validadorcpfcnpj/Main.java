/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.validadorcpfcnpj;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Main {
    public static void main(String args[]){   
        
         Scanner teclado = new Scanner(System.in);
        
         System.out.println("Bem vindo!!");
         
        String cnpj = teclado.nextLine();
        String cpf = teclado.nextLine();
        
        System.out.println("Por favor digite seu CNPJ:");
        cnpj = teclado.nextLine();
        
        if (CNPJ.validar(cnpj)) {
            System.out.println("CNPJ válido!");
        } else {
            System.out.println("CNPJ inválido!");
        }
	
        System.out.println("Por favor digite seu CPF:");
        cpf = teclado.nextLine();
        
        if (CPF.validar(cpf)) {
             System.out.println("CPF válido!");
        } else {
            System.out.println("CPF inválido!");
        }
        System.exit(0);
    }
}