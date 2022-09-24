public abstract class Ingresso{

    private double valor;
    private int data;
    private String localizacao;

    public Ingresso(double valor, int data, String localizacao) {
        this.valor = valor;
        this.data = data;
        this.localizacao = localizacao;
    }

    public double getValor() {
        return valor;
    }

    public int getData() {
        return data;
    }
    public String getLocalizacao() {
        return localizacao;

    }
   public String toString() {
        return " " + data + " " + localizacao;

   }
   public abstract double venda();
}