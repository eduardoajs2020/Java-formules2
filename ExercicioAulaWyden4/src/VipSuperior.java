public final class VipSuperior extends Ingresso{
    private double valorIngresso;

    public VipSuperior(double valor, int data, String localizacao, double v){
        super(valor, data, localizacao);
        setVipSuperior(v);
    }
    public void setVipSuperior(double v){
        valorIngresso = (v > 0 ? v : 0.0);

    }

    @Override
    public double venda() {
        return valorIngresso *2;
    }

    @Override
    public String toString() {
        return "Ingresso Vip Superior: " + super.toString();
    }
}
