package br.com.dio;

import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int numeroDeThreads = 10;
        int repeticoesPorThread = 1_000_000; // Cada thread vai dar 1 milhão de appends

        // ==========================================
        // TESTE 1: STRINGBUFFER
        // ==========================================
        var bufferConcat = new StringBuffer();
        var bufferStart = OffsetDateTime.now();

        List<Thread> threadsBuffer = new ArrayList<>();
        for (int i = 0; i < numeroDeThreads; i++) {
            Thread t = new Thread(() -> {
                for (int j = 0; j < repeticoesPorThread; j++) {
                    bufferConcat.append("X");
                }
            });
            threadsBuffer.add(t);
            t.start();
        }

        // Espera todas as threads terminarem
        for (Thread t : threadsBuffer) t.join();
        var bufferEnd = OffsetDateTime.now();

        System.out.printf("StringBuffer -> Tempo: %s ms | Tamanho Final Esperado: 10000000 | Tamanho Real: %d\n",
                Duration.between(bufferStart, bufferEnd).toMillis(), bufferConcat.length());


        // ==========================================
        // TESTE 2: STRINGBUILDER
        // ==========================================
        var builderConcat = new StringBuilder();
        var builderStart = OffsetDateTime.now();

        List<Thread> threadsBuilder = new ArrayList<>();
        for (int i = 0; i < numeroDeThreads; i++) {
            Thread t = new Thread(() -> {
                for (int j = 0; j < repeticoesPorThread; j++) {
                    builderConcat.append("X");
                }
            });
            threadsBuilder.add(t);
            t.start();
        }

        // Espera todas as threads terminarem
        for (Thread t : threadsBuilder) t.join();
        var builderEnd = OffsetDateTime.now();

        System.out.printf("StringBuilder -> Tempo: %s ms | Tamanho Final Esperado: 10000000 | Tamanho Real: %d\n",
                Duration.between(builderStart, builderEnd).toMillis(), builderConcat.length());
    }
}