import java.util.Scanner;

public class Divertidamente {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Quantas amizades Riley fez? ");
        int amigo = leia.nextInt();
        int amigos;
        if (amigo > 0) {
            amigos = amigo * 10;
            System.out.println("Riley fez " + amigos + " pontos de alegria.");
        } else {
            amigos = -30;
            System.out.println("Sem amigos. " + amigos);
        }
        System.out.println("nota da A1 prova: ");
        int prova_1 = leia.nextInt();
        System.out.println("nota da A2 prova: ");
        int prova_2 = leia.nextInt();
        System.out.println("nota da A3 prova: ");
        int prova_3 = leia.nextInt();
        
        double media = (prova_1+prova_2+prova_3)/3.0;
        int provas;
        if (media>=7 ){
        provas = 50;
        System.out.println("Riley fez " + provas + " pontos de alegria.");
        } else{
        provas = -50;
        System.out.println("foi mal nas provas !");
        }
        
        int totalExercicios = 10;
        int contador = 1;  
        int alegria = 0;
        

        while (contador <= totalExercicios) {
            System.out.print("Riley fez o exercício " + contador + "? (1 = sim, 0 = não): ");
            int resposta = leia.nextInt();

            if (resposta == 1) {
                alegria += 10;
            } else if (resposta == 0) {
                alegria -= 10;
            } else {
                System.out.println("Resposta inválida! Digite 1 (sim) ou 0 (não).");
                continue; 
            }

            contador++;}
            System.out.println("\nPontuação final dos exercícios: " + alegria);
            
            int resultado = provas+amigos+alegria;
            if (resultado>0){
                System.out.println("A mudança para a nova cidade foi uma experiência incrível para a Riley. "+ resultado);
                
            }else if (resultado == 0){System.out.println("Mudança com zero alegria. "+resultado);
            }
            else{System.out.println("A mudança para a nova cidade foi uma experiência desagradável para a Riley. " + resultado);
            }
        

        leia.close();
    }
}