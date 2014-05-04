/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.mapping.Collection;

/**
 *
 * @author Admin
 */

@Entity
@Table (name = "tipificacao")
public class TipificacaoBean implements Serializable{
    
    @Id
    @SequenceGenerator(name = "seq_tipificacao", sequenceName="tipificacao_id_seq")
    @GeneratedValue(generator="seq_tipificacao")
    @Column (name ="id")
    private Integer id;
    
    @Column(name="artigo")
    private String artigo;
    
    @Column(name="lei")
    private String lei;
    

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the artigo
     */
    public String getArtigo() {
        return artigo;
    }

    /**
     * @param artigo the artigo to set
     */
    public void setArtigo(String artigo) {
        this.artigo = artigo;
    }

    /**
     * @return the lei
     */
    public String getLei() {
        return lei;
    }

    /**
     * @param lei the lei to set
     */
    public void setLei(String lei) {
        this.lei = lei;
    }

    /**
     * @return the processos
     */

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.id);
        hash = 13 * hash + Objects.hashCode(this.artigo);
        hash = 13 * hash + Objects.hashCode(this.lei);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TipificacaoBean other = (TipificacaoBean) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.artigo, other.artigo)) {
            return false;
        }
        if (!Objects.equals(this.lei, other.lei)) {
            return false;
        }
        return true;
    }
    
}