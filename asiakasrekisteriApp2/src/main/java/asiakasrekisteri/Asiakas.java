package asiakasrekisteri;

public class Asiakas{
    private String asiakasnumero;
    private int asiakkaanTyyppi;
    private String etunimi;
    private String sukunimi;
    private String sotu;
    private String sukupuoli;

    public Asiakas(String asiakasnumero, int asiakkaanTyyppi, String etunimi, String sukunimi, String sotu,
            String sukupuoli) {
        this.asiakasnumero = asiakasnumero;
        this.asiakkaanTyyppi = asiakkaanTyyppi;
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.sotu = sotu;
        this.sukupuoli = sukupuoli;
    }

    public String getAsiakasnumero() {
        return asiakasnumero;
    }

    public void setAsiakasnumero(String asiakasnumero) {
        this.asiakasnumero = asiakasnumero;
    }

    public int getAsiakkaanTyyppi() {
        return asiakkaanTyyppi;
    }

    public void setAsiakkaanTyyppi(int asiakkaanTyyppi) {
        this.asiakkaanTyyppi = asiakkaanTyyppi;
    }

    public String getEtunimi() {
        return etunimi;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public String getSotu() {
        return sotu;
    }

    public void setSotu(String sotu) {
        this.sotu = sotu;
    }

    public String getSukupuoli() {
        return sukupuoli;
    }

    public void setSukupuoli(String sukupuoli) {
        this.sukupuoli = sukupuoli;
    }
    

}