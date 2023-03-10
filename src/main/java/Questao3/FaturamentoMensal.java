package Questao3;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class FaturamentoMensal {
    public static void main(String[] args) throws IOException, ParseException {
        JSONParser parser = new JSONParser();

        //Para Captura em caso de excessão
        try {
            //Lendo o JSON do arquivo externo
            JSONArray jsonArray = (JSONArray) parser.parse(new FileReader("src/main/java/Questao3/dados.json"));

            //Variáveis para cálculo das informações relevantes
            double totalFaturamento = 0.0;
            double menorFaturamento = Double.MAX_VALUE;
            double maiorFaturamento = Double.MIN_VALUE;
            int diasAcimaDaMedia = 0;

            // Loop pelos faturamentos diários
            for (Object obj : jsonArray) {

                JSONObject jsonObject = (JSONObject) obj;
                double faturamento = Double.parseDouble(jsonObject.get("valor").toString());
                totalFaturamento += faturamento;

                // Cálculo do menor e maior faturamento
                if (faturamento < menorFaturamento) {
                    menorFaturamento = faturamento;
                }
                if (faturamento > maiorFaturamento) {
                    maiorFaturamento = faturamento;
                }
            }

            // Cálculo da média de faturamento mensal
            double mediaFaturamento = totalFaturamento / jsonArray.size();

            // Loop pelos faturamentos diários para contagem dos dias acima da média
            for (Object obj : jsonArray) {
                JSONObject jsonObject = (JSONObject) obj;
                double faturamento = Double.parseDouble(jsonObject.get("valor").toString());
                if (faturamento > mediaFaturamento) {
                    diasAcimaDaMedia++;
                }
            }

            // Impressão das informações relevantes
            System.out.println("Menor valor de faturamento: " + menorFaturamento);
            System.out.println("Maior valor de faturamento: " + maiorFaturamento);
            System.out.println("Número de dias acima da média: " + diasAcimaDaMedia);
        }catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
