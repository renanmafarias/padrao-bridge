package bridge.main;

public class Bolo extends TipoSobremesa {

    public Bolo(float precoBase) {
        super(precoBase);
    }

    public float calcularPrecoFinal() {
        return this.precoBase + this.sabor.precoAdicional();
    }
}
