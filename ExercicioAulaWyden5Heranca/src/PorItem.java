public final class PorItem extends Empregado{
    private double producao; //salario por producao
    private int quantidade; //quantidade produzida

    public PorItem(String n, String f, double p, int q){
        super(n, f); //nome e familia da superclasse(Empregado);
        setProducao(p);
        setQuantidade(q);

    }

    public void setProducao(double p) { producao = (p > 0 ? p : 0.0);}
    public void setQuantidade(int q) {quantidade = (q > 0 ? q : 0);}

    public double ganha(){
        return producao * quantidade;

    }
    public String toString() {
        return "Por item: " + super.toString();

    }
}
