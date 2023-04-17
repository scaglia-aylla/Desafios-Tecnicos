package org.desafio;

public class FaturamentoEstados {
    public static void main(String[] args) {
        // Define o valor de faturamento de cada estado
        double faturamentoSP = 67836.43;
        double faturamentoRJ = 36678.66;
        double faturamentoMG = 29229.88;
        double faturamentoES = 27165.48;
        double faturamentoOutros = 19849.53;

        // Calcula o valor total de faturamento
        double faturamentoTotal = faturamentoSP + faturamentoRJ + faturamentoMG + faturamentoES + faturamentoOutros;

        // Calcula o percentual de representação de cada estado no faturamento total
        double percentualSP = (faturamentoSP / faturamentoTotal) * 100;
        double percentualRJ = (faturamentoRJ / faturamentoTotal) * 100;
        double percentualMG = (faturamentoMG / faturamentoTotal) * 100;
        double percentualES = (faturamentoES / faturamentoTotal) * 100;
        double percentualOutros = (faturamentoOutros / faturamentoTotal) * 100;

        // Imprime o resultado formatado com duas casas decimais
        System.out.println("Percentual de representação de cada estado no faturamento mensal:");
        System.out.printf("SP: %.2f%%\n", percentualSP);
        System.out.printf("RJ: %.2f%%\n", percentualRJ);
        System.out.printf("MG: %.2f%%\n", percentualMG);
        System.out.printf("ES: %.2f%%\n", percentualES);
        System.out.printf("Outros: %.2f%%\n", percentualOutros);
    }
}
