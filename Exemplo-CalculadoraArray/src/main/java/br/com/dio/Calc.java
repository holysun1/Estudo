package br.com.dio;

import java.math.BigDecimal;

@FunctionalInterface
public interface Calc {
    BigDecimal exec(BigDecimal[] numbers);
}
