package modelo;

public class Calculos {
    
    
    public Double calcular(Double num1, Double num2, String operacao){
        
        Double resultado = 0.0;
        
        if(operacao.equals("+")){
            resultado = num1 + num2;
        }
        if(operacao.equals("-")){
            resultado = num1 - num2;
        }
        if(operacao.equals("*")){
            resultado = num1 * num2;
        }
        if(operacao.equals("/")){
            resultado = num1 / num2;
        }

        
        return resultado;
        
    }
}
