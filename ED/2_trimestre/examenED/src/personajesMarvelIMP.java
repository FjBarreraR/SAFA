public class personajesMarvelIMP implements PersonajesMarvel{
    private String nombre;
    private String alias;
    private Boolean esHeroe;
    private String poderPrincipal;
    private String afiliacion;
    private Double poder;

    public personajesMarvelIMP(String nombre, String alias, Boolean esHeroe, String poderPrincipal, String afiliacion, Double poder) {
        this.nombre = nombre;
        this.alias = alias;
        this.esHeroe = esHeroe;
        this.poderPrincipal = poderPrincipal;
        this.afiliacion = afiliacion;
        this.poder = poder;
    }

    public String getAlias() {
        return alias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoderPrincipal() {
        return poderPrincipal;
    }

    public void setPoderPrincipal(String poderPrincipal) {
        this.poderPrincipal = poderPrincipal;
    }

    public Boolean getEsHeroe() {
        return esHeroe;
    }

    public void setEsHeroe(Boolean esHeroe) {
        this.esHeroe = esHeroe;
    }

    public String getAfiliacion() {
        return afiliacion;
    }

    public void setAfiliacion(String afiliacion) {
        this.afiliacion = afiliacion;
    }

    public Double getPoder() {
        return poder;
    }

    public void setPoder(Double poder) {
        this.poder = poder;
    }

    public String esHeroeSioNo() {
        String SN = "Es Heroe";
        if (esHeroe == true){
            SN = "Es Heroe";
        } else {
            SN = "No es Heroe";
        }
        return SN;
    }

    @Override
    public String toString() {
        return nombre + " (" + alias + "). " + "Su poder principal es el " + poderPrincipal + ". Su afiliación, " + afiliacion + ". " + esHeroeSioNo() + ". Su poder es de " + poder + ".";
    }
}
