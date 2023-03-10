package Questao4;

public class Main {

    public static final Double FATURAMENTO_SP = 67836.43;
    public static final Double FATURAMENTO_RJ = 36678.66;
    public static final Double FATURAMENTO_MG = 29229.88;
    public static final Double FATURAMENTO_ES = 27165.48;
    public static final Double FATURAMENTO_OUTROS = 19849.53;

    public static void main(String[] args) {

        //Soma do faturamento total para conversão em porcentagem
        Double faturamentoTotal = FATURAMENTO_SP + FATURAMENTO_RJ + FATURAMENTO_MG + FATURAMENTO_ES + FATURAMENTO_OUTROS;

        //Conversão de cada faturamento em porcentagem
        Double porcentagemSP = (FATURAMENTO_SP * 100) / faturamentoTotal;
        Double porcentagemRJ = (FATURAMENTO_RJ * 100) / faturamentoTotal;
        Double porcentagemMG = (FATURAMENTO_MG * 100) / faturamentoTotal;
        Double porcentagemES = (FATURAMENTO_ES * 100) / faturamentoTotal;
        Double porcentagemOUTROS = (FATURAMENTO_OUTROS * 100) / faturamentoTotal;

        //Saidas com percentual de participação de cada um dos faturamentos
        System.out.printf("O faturamento total foi de: %.2f%%\n", faturamentoTotal);
        System.out.printf("A participacao em %% de SP foi de: %.2f%%\n", porcentagemSP);
        System.out.printf("A participacao em %% de RJ foi de: %.2f%%\n", porcentagemRJ);
        System.out.printf("A participacao em %% de MG foi de: %.2f%%\n", porcentagemMG);
        System.out.printf("A participacao em %% de ES foi de: %.2f%%\n", porcentagemES);
        System.out.printf("A participacao em %% dos demais foi de: %.2f%%\n", porcentagemOUTROS);
    }
}
