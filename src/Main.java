public class Main {
    public static void main(String[] args) {

        System.out.println("Gustavo");

        // TipoDaVariavel nomeDaVariavel = ValorDaVariavel
        // String é um TEXTO
        String nome = "Gustavo";
        char sexo = 'M';

        // [] -> Diz que é um array
        // {} - > Indicar um objeto
        char[] textoChar = {'5'};

        //Guardar Valores Reais
        double altura = 1.74;
        Double peso = 90.0;
        float alturaPessoa2 = 1.80f;
        Float alturaPessoa3 = 1.83f;

        // Guardar Valores Inteiros
        int numeroCasa = 20;
        Integer numeroAlunos = 75;
        Long numeroGolsDoBraitWaith = 3l;

        //Operadores aritmeticos
        // + para soma
        // - para subtração
        // * para multiplicacao
        // / para divisão

        Integer soma = 5 + 5;
        Integer subtracao = 5 - 2;
        Integer multiplicacao = 5 * 5;
        Integer dividir = 5 / 5;

        Integer resultadoSoma = soma + subtracao;
        Integer resultadodoSubtrair = soma - subtracao;
        Integer resultadodoMultiplicar = soma * subtracao;
        Integer resultadoDivisao = soma / subtracao;

        System.out.println("Valor da divisão é : " + resultadoDivisao);
        System.out.println("Valor da multiplicao é : " + resultadodoMultiplicar);
        System.out.println("Valor da soma é : " + resultadoSoma);
        System.out.println("Valor da subtracao é : " + resultadodoSubtrair);

    }
}