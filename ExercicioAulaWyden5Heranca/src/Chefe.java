public final class Chefe extends Empregado {
    private double salario;
    public Chefe(String n, String f, double s){
        super(n, f); //nome e familia da superclasse(Empregado)
        setSalario(s);

    }

    public void setSalario(double s) {
        salario = (s > 0 ? s : 0.0);
    }
    public double ganha(){
        return salario;

    }
    public String toString(){
        return "Chefe: " + super.toString();

    }
}
