# LPVS2

Repositório da disciplina Linguagem de Programação Visual (2023).

import java.util.Random;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Random generator = new Random();
        int number1, number2, sum, attempt, bet, option;
        boolean hit;
        do{
            //gerar os lados dos dados
            number1 = generator.nextInt(6) + 1;
            number2 = generator.nextInt(6) + 1;
            // somar os lados gerados
            sum = number1 + number2;
            System.out.println("número 1 = " + number1 + " - Número 2 = " + number2 + " - Soma = " + sum);
            attempt = 3;
            hit = false;
            while(!hit && attempt > 0){
                bet = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua aposta: "));
                attempt--;
                if(sum == bet){
                    hit = true;
                }else{
                    JOptionPane.showMessageDialog(null, "Você errou! Você ainda tem " + attempt + " tentativas.");
                }
            }if(hit){
                JOptionPane.showMessageDialog(null, "Você acertou! Parabéns!");
            }else{
                JOptionPane.showMessageDialog(null, "Jogo encerrado!");
            }
            option = JOptionPane.showConfirmDialog(null, "Deseja jogar novamente?");
        }while(option == 0);
    }
}
