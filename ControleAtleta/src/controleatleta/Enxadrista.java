
package controleatleta;

import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author cleitoncsg
 */
public class Enxadrista extends Atleta{

    private boolean experiencia;
    private Double nivelObservacao;
    private char categoria; // Infanto, Juvenil ou Adulto
    private int jogadasNinjas;
    private int rating;
    private int totalVitorias;
    private int totalEmpates;
    private int totalDerrotas;
    private ArrayList<Premiacao> premiacoes;
    private ArrayList<Enxadrista> enxadrista;
 

    public ArrayList<Enxadrista> getEnxadrista() {
        return enxadrista;
    }

    public void setEnxadrista(ArrayList<Enxadrista> enxadrista) {
        this.enxadrista = enxadrista;
    }
      
    public Enxadrista(String nome) {
        super(nome);
   
    }

  
    public boolean isExperiencia() {
        return experiencia;
    }

    public void setExperiencia(boolean experiencia) {
        this.experiencia = experiencia;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int pecasBrancas) {
        this.rating = rating;
    }

    public Double getNivelObservacao() {
        return nivelObservacao;
    }

    public void setNivelObservacao(Double nivelObservacao) {
        this.nivelObservacao = nivelObservacao;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public int getJogadasNinjas() {
        return jogadasNinjas;
    }

    public void setJogadasNinjas(int jogadasNinjas) {
        this.jogadasNinjas = jogadasNinjas;
    }

    public int getTotalVitorias() {
        return totalVitorias;
    }

    public void setTotalVitorias(int totalVitorias) {
        this.totalVitorias = totalVitorias;
    }

    public int getTotalEmpates() {
        return totalEmpates;
    }

    public void setTotalEmpates(int totalEmpates) {
        this.totalEmpates = totalEmpates;
    }

    public int getTotalDerrotas() {
        return totalDerrotas;
    }

    public void setTotalDerrotas(int totalDerrotas) {
        this.totalDerrotas = totalDerrotas;
    }

    public ArrayList<Premiacao> getPremiacoes() {
        return premiacoes;
    }

    public void setPremiacoes(ArrayList<Premiacao> premiacoes) {
        this.premiacoes = premiacoes;
    }
     
}
