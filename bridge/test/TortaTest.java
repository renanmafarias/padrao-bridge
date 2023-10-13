package bridge.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TortaTest {

    @Test
    void deveRetornarPrecoFinalTortaDeChocolate() {
        Sabor sabor = new Chocolate();
        Torta torta = new Torta(16.0f);
        torta.setSabor(sabor);
        assertEquals(26.0f, torta.calcularPrecoFinal(), 0.01f);
    }

    @Test
    void deveRetornarPrecoFinalTortaDeLimao() {
        Sabor sabor = new Limao();
        Torta torta = new Torta(16.0f);
        torta.setSabor(sabor);
        assertEquals(22.0f, torta.calcularPrecoFinal(), 0.01f);
    }

    @Test
    void deveRetornarPrecoFinalTortaDeMaracuja() {
        Sabor sabor = new Maracuja();
        Torta torta = new Torta(16.0f);
        torta.setSabor(sabor);
        assertEquals(24.0f, torta.calcularPrecoFinal(), 0.01f);
    }
}