package modelo;

public class Validacao {

    public Double num1;
    public Double num2;
    public String mensagem = "";

    public void validar(String numero1, String numero2, String operacao) {
        try {
            this.num1 = Double.valueOf(numero1);
            this.num2 = Double.valueOf(numero2);

            if (num2 == 0.0 && operacao.equals("/")) {
                mensagem = "impossivel dividir por 0";
            }

        } catch (NumberFormatException e) {
            mensagem = "Digite um numero valido";
        }

    }
}
