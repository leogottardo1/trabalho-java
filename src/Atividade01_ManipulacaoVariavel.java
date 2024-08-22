public class Atividade01_ManipulacaoVariavel {
    public static void main(String[] args) {
        //DADOS DAS PESSOAS
        int IdadePessoa = 23;
        int IdadePessoa2 = 20;
        double AlturaPessoa = 1.75;
        String NomePessoa = "Gustavo";
        boolean Estudante = true;

        //SOMA DE IDADE
        //MULTIPLICACAO DA ALTURA

        Integer SomaIdade = IdadePessoa + IdadePessoa2;
        double Alturadobrada = AlturaPessoa * 2;

        //O QUE VAI APARECE PARA O USUARIOS
        System.out.println("Olá " + NomePessoa);
        System.out.println("Idade: " + IdadePessoa);
        System.out.println("Altura: " + AlturaPessoa);
        System.out.println("Nome: " + NomePessoa);
        System.out.println("É estudante  " + Estudante);
        System.out.println("Soma das Idades: " + SomaIdade);
        System.out.println("Altura Dobrada " + Alturadobrada);

    }
}