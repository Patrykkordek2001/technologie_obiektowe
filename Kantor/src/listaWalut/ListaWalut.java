package listaWalut;

import waluta.IWaluta;

import java.util.ArrayList;
import java.util.List;

public class ListaWalut implements IListaWalut {

    List<IWaluta> waluty;
    public ListaWalut(){
        waluty = new ArrayList<IWaluta>();
    }

    public StringBuilder PokazWaluty(){
        StringBuilder str = new StringBuilder("");

        for(IWaluta wal: waluty){
            str.append("Nazwa waluty: ").append(wal.wezNazwe());
            str.append("Kod: ").append(wal.wezKod());
            str.append("Wskaznik: ").append(wal.wezWskaznik());
            str.append("Wspolczynnik: ").append(wal.wezWskaznik());str.append("\n\n\n");
        }
        return str;
    }


}
