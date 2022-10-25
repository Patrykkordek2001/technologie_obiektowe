package waluta;

public class Waluta implements IWaluta{
    private String nazwa;
    private String kod;
    private double wspolczynnik;
    private double wskaznik;

    public String wezNazwe(){return nazwa;}
    public void ustawNazwe(String nazwa){this.nazwa = nazwa;}
    public String wezKod(){return kod;}
    public void ustawKod(String kod){this.kod = kod;}
    public double wezWspolczynnik(){return wspolczynnik;}
    public void ustawWspolczynnik(double wspolczynnik){this.wspolczynnik = wspolczynnik;}
    public double wezWskaznik(){return wskaznik;}
    public void ustawWskaznik(double wskaznik){this.wskaznik = wskaznik;}



}
