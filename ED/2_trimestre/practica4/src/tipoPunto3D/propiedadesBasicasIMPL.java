package tipoPunto3D;

public class propiedadesBasicasIMPL implements propiedadesBasicas{
    private Integer x;
    private Integer y;
    private Integer z;

    public propiedadesBasicasIMPL() {
    }

    public propiedadesBasicasIMPL(Integer x, Integer y, Integer z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getZ() {
        return z;
    }

    public void setZ(Integer z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
