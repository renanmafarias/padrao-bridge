package bridge.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MousseTest {

    @Test
    void deveRetornarPrecoFinalMousseDeChocolate() {
        Sabor sabor = new Chocolate();
        Mousse mousse = new Mousse(12.0f);
        mousse.setSabor(sabor);
        assertEquals(22.0f, mousse.calcularPrecoFinal(), 0.01f);
    }

    @Test
    void deveRetornarPrecoFinalMousseDeLimao() {
        Sabor sabor = new Limao();
        Mousse mousse = new Mousse(12.0f);
        mousse.setSabor(sabor);
        assertEquals(18.0f, mousse.calcularPrecoFinal(), 0.01f);
    }

    @Test
    void deveRetornarPrecoFinalMousseDeMaracuja() {
        Sabor sabor = new Maracuja();
        Mousse mousse = new Mousse(12.0f);
        mousse.setSabor(sabor);
        assertEquals(20.0f, mousse.calcularPrecoFinal(), 0.01f);
    }
}