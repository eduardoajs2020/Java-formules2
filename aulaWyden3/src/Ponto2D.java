public class Ponto2D {
        private int x;
        private int y;
        public Ponto2D(int a, int b){
            x = a;
            y = b;
        }
    public double distancia(Ponto2D p){
            double distx =p.x -x;
            double disty =p.y -y;
        return Math.sqrt(distx * distx + disty * disty);
    }
}