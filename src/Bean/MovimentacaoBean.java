/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Enumeration;
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
@Table (name = "movimentacao")
public class MovimentacaoBean implements Serializable{
    
    @Id
    @SequenceGenerator(name = "seq_movimentacao", sequenceName="movimentacao_id_seq")
    @GeneratedValue(generator="seq_movimentacao")
    @Column (name ="id")
    private Integer id;
    
    @Column(name="data_rec")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Calendar data_recebido;
    
    @Column(name="data_saida")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Calendar data_saida;
   
    @ManyToOne
    @JoinColumn(name="usuario")
    private UsuarioBean usuario;
    
    /*@ManyToOne
    @Column(name="processo")
    private ProcessoBean processo;
    */
    @Column(name="despacho")
    private String despacho;
    
    @Column(name="status")
    private Integer status;

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
     * @return the data_recebido
     */
    public Calendar getData_recebido() {
        return data_recebido;
    }

    /**
     * @param data_recebido the data_recebido to set
     */
    public void setData_recebido(Calendar data_recebido) {
        this.data_recebido = data_recebido;
    }

    /**
     * @return the data_saida
     */
    public Calendar getData_saida() {
        return data_saida;
    }

    /**
     * @param data_saida the data_saida to set
     */
    public void setData_saida(Calendar data_saida) {
        this.data_saida = data_saida;
    }

    /**
     * @return the usuario
     */
    public UsuarioBean getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(UsuarioBean usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the processo
     */
    
  

    /**
     * @return the despacho
     */
    public String getDespacho() {
        return despacho;
    }

    /**
     * @param despacho the despacho to set
     */
    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.id);
        hash = 73 * hash + Objects.hashCode(this.data_recebido);
        hash = 73 * hash + Objects.hashCode(this.data_saida);
        hash = 73 * hash + Objects.hashCode(this.usuario);
        hash = 73 * hash + Objects.hashCode(this.despacho);
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
        final MovimentacaoBean other = (MovimentacaoBean) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.data_recebido, other.data_recebido)) {
            return false;
        }
        if (!Objects.equals(this.data_saida, other.data_saida)) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        if (!Objects.equals(this.despacho, other.despacho)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
