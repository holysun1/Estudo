package br.com.dio;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;


public enum Operation {
    SUM(n -> Arrays.stream(n).reduce(BigDecimal.ZERO, BigDecimal::add), " + " ),
    SUB(n -> Arrays.stream(n).reduce(BigDecimal::subtract).orElse(BigDecimal.ZERO), " - "),
    MULT(n -> Arrays.stream(n).reduce(BigDecimal.ONE, BigDecimal::multiply), " * " ),
    DIV(n -> Arrays.stream(n)
            .reduce((n1, n2) -> n1.divide(n2, 4, RoundingMode.HALF_UP))
            .orElse(BigDecimal.ZERO)," / " );

    private final Calc operationCallback;

    public String getSignal() {
        return signal;
    }

    private final String signal;

    Operation(Calc operationCallback, String signal) {
        this.operationCallback = operationCallback;
        this.signal = signal;
    }
    public Calc getOperationCallback() {
        return operationCallback;
    }

    public BigDecimal exec(BigDecimal[] numbers) {
        return this.operationCallback.exec(numbers);
    }

    public String formatEquation(BigDecimal[] numbers) {
        if(numbers == null || numbers.length == 0) return "";
        StringBuilder sb = new StringBuilder();
        sb.append(numbers[0]);
        for (int i = 1; i < numbers.length; i++) {
            BigDecimal current = numbers[i];
            //OPERAÇÃO SUBTRAÇÃO E NUMERO NEGATIVO
            if(this == SUB && current.signum()<0){
                // ALTERA O SINAL DE ( - ) PARA O SINAL DE ( + )
                sb.append(" + ").append(current.negate());
            }else if ( current.signum() < 0){ //OUTRAS FUNÇÕES - MULTIPLICAÇÃO / DIVISÃO / SOMA
                //ISOLA O NÚMERO ENTRE PARENTESES. EXEMPLO ( -22 )
                sb.append(this.signal).append("(").append(current).append(")");
            }else{
                //NORMAL PARA NÚMEROS POSITIVOS
                sb.append(this.signal).append(current);;
            }
        }
        //RETORNA A STRING NOVA
        return sb.toString();
    }

}
