/* SUPERCLASSE -> classe abstrata(todos os seus métodos serão implementados em suas subclasses, através do polimorfismo);*/

public abstract class Empregado {
    private String nome;
    private String familia;

    public Empregado(String n, String f) {
        nome = n;
        familia = f;

    }

    public String getNome() {
        return nome;
    }

    public String getFamilia() {
        return familia;
    }
    public String toString() {
        return nome + " " + familia;

    }
    public abstract double ganha(); //Método abstrato(não é implementado aqui, mas somente nas subclasses com suas peculiaridades);
}
