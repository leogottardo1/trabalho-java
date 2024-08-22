public class Atividade02_ManipulacaoVariavel {
public static void main(String[] args) {

    //DADOS SOLICITADOS
    String Nomepessoa = "Cleiton";
    int Idadepessoa = 25;
    double SalarioMensal = 5000.00;
    int MesesTrabalhado = 8;
    int ProdutosComprados = 20;
    double Desconto = 2000.00;
    double produto = 200.00;


    //OPERACOES

    double SalarioAnual = 5000.00 * 12;
    double SalarioTrabalhado = SalarioMensal * MesesTrabalhado;
    double SalarioLiquido = SalarioAnual - Desconto;
    double MediadeGastos = ProdutosComprados * produto;

    // O QUE VAI APARECER

    System.out.println("Nome: " + Nomepessoa); System.out.println("Salário Anual Líquido é de: " + SalarioLiquido);


    }
}



