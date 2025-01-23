public class FechaIMP implements Fecha {
    private Integer dia;
    private Integer mes;
    private Integer anyo;

    public Integer getDia() {
        return dia;
    }

    public Integer getMes() {
        return mes;
    }

    public Integer getAnyo() {
        return anyo;
    }

    public FechaIMP() {
    }

    public FechaIMP(Integer dia, Integer mes, Integer anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anyo;
    }
}
