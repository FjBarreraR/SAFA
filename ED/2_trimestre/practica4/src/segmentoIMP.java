public class segmentoIMP implements Segemento{
    private Punto3dIMP extremo1;
    private Punto3dIMP extremo2;

    public Punto3dIMP getExtremo1() {
        return extremo1;
    }

    public void setExtremo1(Punto3dIMP extremo1) {
        if (extremo1!=null){
            this.extremo1 = extremo1;
        }
    }

    public Punto3dIMP getExtremo2() {
        return extremo2;
    }

    public void setExtremo2(Punto3dIMP extremo2) {
        if (extremo2!=null){
            this.extremo2 = extremo2;
        }
    }

    public Double distanciaEntreExtremos(Punto3dIMP extremo1, Punto3dIMP extremo2) {
        return extremo1.distanciaOtroPunto(extremo2);
    }

    @Override
    public String toString() {
        return "[" + extremo1 + ", " + extremo2 + "]";
    }
}
