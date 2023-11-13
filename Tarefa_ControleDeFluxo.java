import java.util.Scanner;

public class Tarefa_ControleDeFluxo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, agora iremos saber se você foi aprovado, se está de recuperação ou se está reprovado! :) ");
        System.out.println("Digite a primeira nota: ");
        int nota1 = scanner.nextInt();
        System.out.println("Digite a segunda nota: ");
        int nota2 = scanner.nextInt();
        System.out.println("Digite a terceira nota: ");
        int nota3  = scanner.nextInt();
        System.out.println("Digite a ultima nota: ");
        int nota4 = scanner.nextInt();

        System.out.println("**** Calculado ****");
        int result = (nota1 + nota2 + nota3 + nota4) / 4;


        if (result >= 7) {
            System.out.println("Sua nota é : " +  result +  " Parabéns!!! Você está aprovado.");
        } else if (result >= 5) {
            System.out.println("Sua nota é : " + result + " Você está de recuperação e tem uma nova chance de conseguir a aprovação.");
        } else {
            System.out.println("Sua nota é : " + result + " Você está reprovado :( ");
        }
    }
}
