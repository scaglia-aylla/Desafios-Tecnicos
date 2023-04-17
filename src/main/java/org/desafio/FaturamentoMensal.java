package org.desafio;


import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import com.google.gson.Gson;



public class FaturamentoMensal {
    public static void main(String[] args) throws Exception {
        // Carrega o arquivo JSON da pasta "resources"
        URL url = FaturamentoMensal.class.getResource("/dados.json");
        InputStream is = url.openStream();
        Reader reader = new InputStreamReader(is, StandardCharsets.UTF_8);

        // Converte o JSON em um array de objetos DiaFaturamento
        Gson gson = new Gson();
        DiaFaturamento[] faturamentoMensal = gson.fromJson(reader, DiaFaturamento[].class);

        // Calcula e imprime o menor faturamento diário
        double menorFaturamento = Double.MAX_VALUE;
        for (DiaFaturamento dia : faturamentoMensal) {
            if (dia.getValor() > 0 && dia.getValor() < menorFaturamento) {
                menorFaturamento = dia.getValor();
            }
        }
        System.out.println("Menor faturamento diário: " + menorFaturamento);

        // Calcula e imprime o maior faturamento diário
        double maiorFaturamento = 0.0;
        for (DiaFaturamento dia : faturamentoMensal) {
            if (dia.getValor() > maiorFaturamento) {
                maiorFaturamento = dia.getValor();
            }
        }
        System.out.println("Maior faturamento diário: " + maiorFaturamento);

        // Calcula e imprime o número de dias com faturamento acima da média
        double faturamentoTotal = 0.0;
        int numDias = 0;
        for (DiaFaturamento dia : faturamentoMensal) {
            if (dia.getValor() > 0) {
                faturamentoTotal += dia.getValor();
                numDias++;
            }
        }
        double mediaMensal = faturamentoTotal / numDias;
        int numDiasAcimaMedia = 0;
        for (DiaFaturamento dia : faturamentoMensal) {
            if (dia.getValor() > mediaMensal) {
                numDiasAcimaMedia++;
            }
        }
        System.out.println("Número de dias com faturamento acima da média: " + numDiasAcimaMedia);
    }
}
