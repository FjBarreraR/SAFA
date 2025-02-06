public class Punto3dIMP implements Punto3D{
    private Double x, y, z;

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        if (x==null){
            this.x = 0.0;
        }else {
            this.x = x;
        }
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        if (y==null){
            this.y = 0.0;
        }else {
            this.y = y;
        }
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        if (z==null){
            this.z = 0.0;
        }else {
            this.z = z;
        }
    }

    public Double distanciaOtroPunto(Punto3D punto) {
        return Math.sqrt(Math.pow((punto.getX()-this.x), 2) + Math.pow((punto.getY()-this.y), 2) + Math.pow((punto.getZ()-this.z), 2));
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
