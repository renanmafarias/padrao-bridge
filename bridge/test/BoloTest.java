package bridge.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoloTest {

    @Test
    void deveRetornarPrecoFinalBoloDeChocolate() {
        Sabor sabor = new Chocolate();
        Bolo bolo = new Bolo(25.0f);
        bolo.setSabor(sabor);
        assertEquals(35.0f, bolo.calcularPrecoFinal(), 0.01f);
    }

    @Test
    void deveRetornarPrecoFinalBoloDeLimao() {
        Sabor sabor = new Limao();
        Bolo bolo = new Bolo(25.0f);
        bolo.setSabor(sabor);
        assertEquals(31.0f, bolo.calcularPrecoFinal(), 0.01f);
    }

    @Test
    void deveRetornarPrecoFinalBoloDeMaracuja() {
        Sabor sabor = new Maracuja();
        Bolo bolo = new Bolo(25.0f);
        bolo.setSabor(sabor);
        assertEquals(33.0f, bolo.calcularPrecoFinal(), 0.01f);
    }
}