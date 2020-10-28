
package cr.ac.ucenfotec.bl.entidades;

import java.util.Objects;

public class Motor {
    
    private String serie;
    private String numCilindros;
    
    public Motor (){
    
    }
    
    public Motor (String serie, String numCilindros){
    this.serie = serie;
    this.numCilindros = numCilindros;
    }
    
    /**
     * @return the serie
     */
    
    public String getSerie() {
        return serie;
    }
    
    /**
     * @return the numCilindros
     */
    
    public String getNumCilindros() {
        return numCilindros;
    }

    /**
     * @param serie the serie to set
     */
    public void setSerie(String serie) {
        this.serie = serie;
    }

    /**
     * @param numCilindros the numCilindros to set
     */
    public void setNumCilindros(String numCilindros) {
        this.numCilindros = numCilindros;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.serie);
        hash = 41 * hash + Objects.hashCode(this.numCilindros);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Motor other = (Motor) obj;
        if (!Objects.equals(this.serie, other.serie)) {
            return false;
        }
        if (!Objects.equals(this.numCilindros, other.numCilindros)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Motor{" + "serie=" + serie + ", numCilindros=" + numCilindros + '}';
    }
    
    
    
}
