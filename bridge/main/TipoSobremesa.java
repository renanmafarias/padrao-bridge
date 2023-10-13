package bridge.main;

public abstract class TipoSobremesa {

    protected Sabor sabor;

    protected float precoBase;

    public TipoSobremesa(float precoBase) {
        this.precoBase = precoBase;
    }

    public void setSabor(Sabor sabor) {
        this.sabor = sabor;
    }

    public void setPrecoBase(float precoBase) {
        this.precoBase = precoBase;
    }

    public abstract float calcularPrecoFinal();
}
