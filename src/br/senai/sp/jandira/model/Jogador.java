package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Jogador extends Pessoas {

    public void cadastrarJogador(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" informe o nome: ");
        super.setNome(scanner.nextLine());
        System.out.println(" informe o apelido: ");
        super.setApelido(scanner.nextLine());
        System.out.println(" informe a idade: ");
        super.setIdade(scanner.nextInt());
        scanner.nextLine();
        System.out.println("**************************");
    }
}
