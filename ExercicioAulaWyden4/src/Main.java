import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args){


        String sai = "";
        DecimalFormat df = new DecimalFormat("0.00");
        Normal n = new Normal(100.00, 2022, "Lugar comum", 100);
        VipSuperior vs = new VipSuperior(100.00, 2022, "Lugar Vip Superior", 100);
        VipInferior vi = new VipInferior(100.00, 2022, "Lugar Vip Inferior", 100);

        sai += n + " Custa hoje $" + df.format(n.venda()) + "\n";
        sai += vs + " Custa hoje $" + df.format(vs.venda()) + "\n";
        sai += vi + " Custa hoje $" + df.format(vi.venda()) + "\n";


        System.out.println(sai);

    }

}
