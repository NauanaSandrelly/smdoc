/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Admin
 */

@Entity
@Table (name = "situacao")
public class SituacaoBean implements Serializable{
    
    @Id
    @SequenceGenerator(name = "seq_situacao", sequenceName="situacao_id_seq")
    @GeneratedValue(generator="seq_situacao")
    @Column (name ="id")
    private Integer id;
    
    @ManyToOne
    @JoinColumn(name="tiposituacao")
    private TipoSituacaoBean tiposituacao;
    
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column (name="data")
    private Calendar data;
    
    @Column(name="observacao")
    private String observacao;
    
    
    /*@ManyToOne
    @JoinColumn(name="id_processo")
    private ProcessoBean processo;
*/
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
     * @return the tiposituacao
     */
    public TipoSituacaoBean getTiposituacao() {
        return tiposituacao;
    }

    /**
     * @param tiposituacao the tiposituacao to set
     */
    public void setTiposituacao(TipoSituacaoBean tiposituacao) {
        this.tiposituacao = tiposituacao;
    }

    /**
     * @return the data
     */
    public Calendar getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Calendar data) {
        this.data = data;
    }

    /**
     * @return the observacao
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * @param observacao the observacao to set
     */
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    /**
     * @return the processo
     */
 

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.id);
        hash = 71 * hash + Objects.hashCode(this.tiposituacao);
        hash = 71 * hash + Objects.hashCode(this.data);
        hash = 71 * hash + Objects.hashCode(this.observacao);
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
        final SituacaoBean other = (SituacaoBean) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.tiposituacao, other.tiposituacao)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (!Objects.equals(this.observacao, other.observacao)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
