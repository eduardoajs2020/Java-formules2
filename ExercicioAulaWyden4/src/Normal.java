public final class Normal extends Ingresso{
    private double valorIngresso;

    public Normal(double valor, int data, String localizacao, double p){
        super(valor, data, localizacao);
        setPopular(p);
    }
    public void setPopular(double p){
        valorIngresso = (p >0 ? p : 0.0);

    }

    @Override
    public double venda() {
        return valorIngresso;
    }

    @Override
    public String toString() {
        return "Ingresso Normal: " + super.toString();
    }
}

