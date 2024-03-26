package javapilharecordes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Quiqu
 */
public class Recorde {
        private LocalDate dataRecorde;
        private String nome ;
        private double tempo;
        
        
    public Recorde(String nome, LocalDate dataRecorde,  double tempo) {
        this.dataRecorde = dataRecorde;
        this.nome = nome;
        this.tempo= tempo;
    }
    
    public Recorde(){
        
    }

    public LocalDate getDataRecorde() {
        return dataRecorde;
    }

    public void setDataRecorde(LocalDate dataRecorde) {
        this.dataRecorde = dataRecorde;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTempo() {
        return tempo;
    }
 
    public void setTempo(double tempo) {
        this.tempo = tempo;
    }
    
    @Override
    public String toString() {
     DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
     LocalDate dataTeste = dataRecorde;
    return "Nome do Atleta: " + nome + ", \nData do Recorde: " + format.format(dataTeste) + ", \nTempo: " + tempo + " segundos"+"\n-----------------------------------------------";
}
            

}
