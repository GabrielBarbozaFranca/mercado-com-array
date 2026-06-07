import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos produtos deseja cadastrar?");
        int n = sc.nextInt();
        sc.nextLine();

        String[] nome = new String[n];
        double[] valor = new double[n];

        for (int i = 0; i < n; i++){
            System.out.println("Produto " + (i + 1));
            System.out.println("Nome: ");
            nome[i] = sc.nextLine();
            System.out.println("Preço: ");
            valor[i] = sc.nextDouble();
            sc.nextLine();
        }

        double soma = 0;
        
        for (int i = 0; i < valor.length; i++){
            soma += valor[i];
        }
        double media = soma / valor.length;
        double menor = valor[0];
        double maior = valor[0];
        
        for (int i = 1; i < valor.length; i++){
            if (valor[i] < menor){
                menor = valor[i];
            } if (valor[i] > maior){
                maior = valor[i];
            }
        }

        int acima = 0;
        for (int i = 0; i < valor.length; i++){
            if (valor[i] > media){
                acima++;
            } 
        }
        System.out.println("=== PRODUTOS ===");
        for (int i = 0; i < nome.length; i++){
            System.out.println(nome[i] + " - " + "R$" + valor[i]);
        }

        System.out.println(" ");
        System.out.println("Produto mais barato - " + nome[0] + "  R$" + menor);
        System.out.println("Produto mais caro - " + nome[0] +  "  R$" +  maior);
        System.out.println("Total - " + soma);
        System.out.println("Média - " + media);
        System.out.println("Produtos acima da média: " + acima);
        
    }
}
