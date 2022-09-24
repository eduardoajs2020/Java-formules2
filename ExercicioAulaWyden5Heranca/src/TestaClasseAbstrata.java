import java.text.DecimalFormat;

public class TestaClasseAbstrata {
    public static void main(String[] args) {

        Empregado e;
        String sai = "";
        DecimalFormat df = new DecimalFormat("0.00");
        Chefe c = new Chefe("Joao", "Silva ", 3000.00);
        PorComissao pc = new PorComissao("Maria", "Souza ", 400.00, 3.00, 150);
        PorItem pi = new PorItem("Pedro", "Cabral ", 2.50, 200);
        PorHora ph = new PorHora("Marta", "Ferreira" , 13.75, 40.50);
        e = c;
        sai += e.toString() + "ganha $" + df.format(e.ganha()) + "\n";
        e = pc;
        sai += e.toString() + "ganha $" + df.format(e.ganha()) + "\n";
        e = pi;
        sai += e.toString() + "ganha $" + df.format(e.ganha()) + "\n";
        e = ph;
        sai += e.toString() + "ganha $" + df.format(e.ganha()) + "\n";

        System.out.println(sai);
    }
}