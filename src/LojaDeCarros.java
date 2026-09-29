import com.carro.entity.Carro;

import java.util.Scanner;

public class LojaDeCarros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Limite de Carros para cadastrar "maximo 50"
        System.out.println("Digite quantos carros deseja cadastrar (maximo 50): ");
        int quantidade = scanner.nextInt();
        double somaTotalDeCarro =0;
        scanner.nextLine();

        if (quantidade > 50) {
            System.out.println("Erro: limite máximo");
            return;
        }else if (quantidade <= 0) {
            System.out.println("Erro: quantidade deve ser maior que zero");
            return;
        }
        //Guardando em Vetor
        Carro[] listaDeCarro = new Carro[quantidade];
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Cadastro de carros " + (i + 1) + ": ");

            System.out.println("Digite o modelo do carro: ");
            String modelo = scanner.nextLine();

            System.out.print("Digite o valor do carro: R$ ");
            double preco = scanner.nextDouble();
            scanner.nextLine();
            System.out.println();

            // Adiciona o carro ao vetor e acumula o valor do preço
            listaDeCarro[i] = new Carro(modelo, preco);
            somaTotalDeCarro += listaDeCarro[i].getPreco();
        }

        System.out.println("====================================");
        System.out.println("=====Relatório de Carros============");
        System.out.println("====================================");

        //Lista dos Carros Cadastrados
        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Carro %d: %s | Preço: R$ %.2f%n", (i + 1), listaDeCarro[i].getModelo(), listaDeCarro[i].getPreco());
        }

        System.out.println();//pula lihas

        //Total de Carros na tela
        System.out.println("Soma total de carros : R$ " + somaTotalDeCarro);
        scanner.close();
    }
}
