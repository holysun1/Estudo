package br.com.dio;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public record Box(long amount, LocalDate validate, BigDecimal price) {
    public BigDecimal finalPrice() {
        var unitPrice = price().divide(BigDecimal.valueOf(amount),2, RoundingMode.HALF_UP );
        var finalPrice = unitPrice.add(unitPrice.multiply(new BigDecimal("0.20")));
        return unitPrice.add(finalPrice);
    }
}