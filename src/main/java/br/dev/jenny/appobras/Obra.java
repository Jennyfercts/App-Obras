package br.dev.jenny.appobras;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sesi2dia
 */
public class Obra {
    String proprietario;
    String local;
    String cidade;
    String uf;

    List<Comodo> listaComodos = new ArrayList<>();
    
    public Obra() {
    }

    public Obra(String proprietario, String local, String cidade, String uf) {
        this.proprietario = proprietario;
        this.local = local;
        this.cidade = cidade;
        this.uf = uf;
    }
    
    public double calcularTotalObra(){
        double areaTotal = 0;
        
        for (Comodo comodoAtual : listaComodos){
            areaTotal += comodoAtual.calcularArea();
            //areaTotal = areaTotal + comodoAtual.calcularArea();
        }
        
        return areaTotal;
    }

    @Override
    public String toString() {
        return String.format("|  %10s | %10s | %15s | %2s |      %02.2f |\n",
                proprietario,
                local,
                cidade,
                uf,
                this.calcularTotalObra());
    }
    
    
}
