/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Aluno
 */
public class Controle {

    public String executar(String numero1, String numero2, String operacao) {

        Validacao validacao = new Validacao();
        validacao.validar(numero1, numero2, operacao);
        String mensagem = validacao.mensagem;
        if (mensagem.equals("")) {
            Double num1 = validacao.num1; 
            Double num2 = validacao.num2; 
            Calculos calculos = new Calculos();
            Double resultado = calculos.calcular(num1, num2, operacao);
            mensagem = resultado.toString();
        }
        
        return mensagem;
    }

}
