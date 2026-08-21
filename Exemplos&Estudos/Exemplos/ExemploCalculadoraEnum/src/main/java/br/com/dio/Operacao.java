package br.com.dio;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Optional;

public enum Operacao {
    SOMA("+") {
        @Override
        public BigDecimal executar(BigDecimal x, BigDecimal y) {
            return x.add(y);
        }
    },
    SUBTRACAO("-") {
        @Override
        public BigDecimal executar(BigDecimal x, BigDecimal y) {
            return x.subtract(y);
        }
    },
    MULTIPLICACAO("*") {
        @Override
        public BigDecimal executar(BigDecimal x, BigDecimal y) {
            return x.multiply(y);
        }
    },
    DIVISAO("/") {
        @Override
        public BigDecimal executar(BigDecimal x, BigDecimal y) {
            if (y.compareTo(BigDecimal.ZERO) == 0) {
                throw new ArithmeticException("Divisão por zero!");
            }
            // Define 4 casas decimais e arredondamento padrão financeiro
            return x.divide(y, 4, RoundingMode.HALF_UP);
        }
    };

    private final String simbolo;

    Operacao(String simbolo) { this.simbolo = simbolo; }
    public String getSimbolo() { return simbolo; }
    public abstract BigDecimal executar(BigDecimal x, BigDecimal y);

    public static Optional<Operacao> obterPorOpcao(int opcao) {
        return switch (opcao) {
            case 1 -> Optional.of(SOMA);
            case 2 -> Optional.of(SUBTRACAO);
            case 3 -> Optional.of(MULTIPLICACAO);
            case 4 -> Optional.of(DIVISAO);
            default -> Optional.empty(); // Retorna o container vazio
        };
    }
}