public final class VipInferior extends Ingresso{
    private double valorIngresso;

    public VipInferior(double valor, int data, String localizacao, double v1){
        super(valor, data, localizacao);
        setVipInferior(v1);
    }
    public void setVipInferior(double v1){
        valorIngresso = (v1 > 0 ? v1 : 0.0);

    }

    @Override
    public double venda() {
        return valorIngresso *1.5;
    }

    @Override
    public String toString() {
        return "Ingresso Vip Inferior: " + super.toString();
    }
}

