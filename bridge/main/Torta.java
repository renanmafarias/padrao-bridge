package bridge.main;

public class Torta extends TipoSobremesa {

    public Torta(float precoBase) {
        super(precoBase);
    }

    public float calcularPrecoFinal() {
        return this.precoBase + this.sabor.precoAdicional();
    }
}
