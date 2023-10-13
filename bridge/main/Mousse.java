package bridge.main;

public class Mousse extends TipoSobremesa {

    public Mousse(float precoBase) {
        super(precoBase);
    }

    public float calcularPrecoFinal() {
        return this.precoBase + this.sabor.precoAdicional();
    }
}
