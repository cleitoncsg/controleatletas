
package br.unb_fga.enxadrista.control;

import br.unb_fga.enxadrista.model.Enxadrista;
import java.util.ArrayList;

/**
 *
 * @author cleitoncsg
 */
public class ControleEnxadrista {
    private ArrayList<Enxadrista> listaEnxadristas;

    public ControleEnxadrista() {
        this.listaEnxadristas = new ArrayList<Enxadrista>();
    }
    
    public ArrayList<Enxadrista> getListaEnxadristas() {
        return listaEnxadristas;
    }
    
    public void adicionar(Enxadrista novoEnxadrista) {
        listaEnxadristas.add(novoEnxadrista);
    }
    
    public void remover(Enxadrista novoEnxadrista) {
        listaEnxadristas.remove(novoEnxadrista);
    }
    
    public Enxadrista pesquisar(String nome) {
        for (Enxadrista e: listaEnxadristas) {
            if (e.getNome().equalsIgnoreCase(nome))
                return e;
        }
        return null;
    }
    
}
