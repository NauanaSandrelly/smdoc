/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.io.Serializable;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.hibernate.mapping.Collection;

@Entity
@Table (name = "processo")
public class ProcessoBean implements Serializable{
    @Id
    @SequenceGenerator(name = "seq_processo", sequenceName="processo_id_seq")
    @GeneratedValue(generator="seq_processo")
    
    @Column(name="id")
    private Integer id_processo;
    
    @Column(name="numero")
    private String numero;
    
    @Column(name="qt_volumes")
    private Integer qt_vol;
    
    @Column(name="qt_apensos")
    private Integer qt_apensos;
    
    @Column(name="data_vencimento")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar data;
    
    @ManyToMany
    @JoinColumn(name="tipificacao")
    @JoinTable(name = "tipificao_has_processo", joinColumns={@JoinColumn(name="idprocesso")}, 
            inverseJoinColumns ={@JoinColumn(name="idtipificacao")})
    private TipificacaoBean tipificacoes;
   
    @ManyToOne
    @JoinColumn(name="usuario")
    private UsuarioBean usuario;
    
    @Column(name="descricao")
    private String descricao;
    
    @ManyToOne
    @JoinColumn(name="situacao")
    private SituacaoBean situacao;
    
    
    public Integer getId_processo() {
        return id_processo;
    }

    /**
     * @param id_processo the id_processo to set
     */
    public void setId_processo(Integer id_processo) {
        this.id_processo = id_processo;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the qt_vol
     */
    public Integer getQt_vol() {
        return qt_vol;
    }

    /**
     * @param qt_vol the qt_vol to set
     */
    public void setQt_vol(Integer qt_vol) {
        this.qt_vol = qt_vol;
    }

    /**
     * @return the qt_apensos
     */
    public Integer getQt_apensos() {
        return qt_apensos;
    }

    /**
     * @param qt_apensos the qt_apensos to set
     */
    public void setQt_apensos(Integer qt_apensos) {
        this.qt_apensos = qt_apensos;
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
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    /**
     * @return the situacao
     */
    public SituacaoBean getSituacao() {
        return situacao;
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(SituacaoBean situacao) {
        this.situacao = situacao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id_processo);
        hash = 97 * hash + Objects.hashCode(this.numero);
        hash = 97 * hash + Objects.hashCode(this.qt_vol);
        hash = 97 * hash + Objects.hashCode(this.qt_apensos);
        hash = 97 * hash + Objects.hashCode(this.data);
        hash = 97 * hash + Objects.hashCode(this.tipificacoes);
        hash = 97 * hash + Objects.hashCode(this.usuario);
        hash = 97 * hash + Objects.hashCode(this.descricao);
        hash = 97 * hash + Objects.hashCode(this.situacao);
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
        final ProcessoBean other = (ProcessoBean) obj;
        if (!Objects.equals(this.id_processo, other.id_processo)) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        if (!Objects.equals(this.qt_vol, other.qt_vol)) {
            return false;
        }
        if (!Objects.equals(this.qt_apensos, other.qt_apensos)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (!Objects.equals(this.tipificacoes, other.tipificacoes)) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.situacao, other.situacao)) {
            return false;
        }
        return true;
    }
    


    /**
     * @return the tipificacoes
     */
    public TipificacaoBean getTipificacoes() {
        return tipificacoes;
    }

    /**
     * @param tipificacoes the tipificacoes to set
     */
    public void setTipificacoes(TipificacaoBean tipificacoes) {
        this.tipificacoes = tipificacoes;
    }

   


}