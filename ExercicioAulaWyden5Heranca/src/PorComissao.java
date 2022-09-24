public final class PorComissao extends Empregado {
    private double salario;
    private double comissao; //comissao por item vendido
    private int vendas;     //numero de itens vendidos


    public PorComissao(String n, String f, double s, double c, int v) {
        super(n, f); //nome e familia da superclasse(Empregado)
        setSalario(s);
        setComissao(c);
        setVendas(v);

    }

    public void setSalario(double s) {salario = (s > 0 ? s : 0.0);}
    public void setComissao(double c) { comissao = (c > 0 ? c : 0.0);}
    public void setVendas(int v) { vendas = (v > 0 ? v : 0);}

    public double ganha(){
        return salario + comissao * vendas;

    }
    public String toString() {
        return "Por comissao: " + super.toString();

    }
}
