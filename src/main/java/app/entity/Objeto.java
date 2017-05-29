package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela OBJ_OBJETO
 * @generated
 */
@Entity
@Table(name = "\"OBJ_OBJETO\"" ,uniqueConstraints=@UniqueConstraint(columnNames={
"sigla" ,"sistema" }))
@XmlRootElement
public class Objeto implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1L;
  
  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
  
  /**
  * @generated
  */
  @Column(name = "sigla", nullable = false, unique = true, length=20, insertable=true, updatable=true)
  private java.lang.String sigla;
  
  /**
  * @generated
  */
  @Column(name = "descricao", nullable = true, unique = false, length=100, insertable=true, updatable=true)
  private java.lang.String descricao;
  
  /**
  * @generated
  */
  @Column(name = "observacao", nullable = true, unique = false, length=1000, insertable=true, updatable=true)
  private java.lang.String observacao;
  
  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "dataInclusao", nullable = true, unique = false, insertable=true, updatable=true)
  private java.util.Date dataInclusao;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_sistema", nullable = false, referencedColumnName = "id", insertable=true, updatable=true)
  private Sistema sistema;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_tipoObjeto", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private TipoObjeto tipoObjeto;
  
  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  private User user;
  
  /**
   * Construtor
   * @generated
   */
  public Objeto(){
  }

  
  /**
   * Obtém id
   * return id
   * @generated
   */
  public java.lang.String getId(){
    return this.id;
  }
  
  /**
   * Define id
   * @param id id
   * @generated
   */
  public Objeto setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém sigla
   * return sigla
   * @generated
   */
  public java.lang.String getSigla(){
    return this.sigla;
  }
  
  /**
   * Define sigla
   * @param sigla sigla
   * @generated
   */
  public Objeto setSigla(java.lang.String sigla){
    this.sigla = sigla;
    return this;
  }
  
  /**
   * Obtém descricao
   * return descricao
   * @generated
   */
  public java.lang.String getDescricao(){
    return this.descricao;
  }
  
  /**
   * Define descricao
   * @param descricao descricao
   * @generated
   */
  public Objeto setDescricao(java.lang.String descricao){
    this.descricao = descricao;
    return this;
  }
  
  /**
   * Obtém observacao
   * return observacao
   * @generated
   */
  public java.lang.String getObservacao(){
    return this.observacao;
  }
  
  /**
   * Define observacao
   * @param observacao observacao
   * @generated
   */
  public Objeto setObservacao(java.lang.String observacao){
    this.observacao = observacao;
    return this;
  }
  
  /**
   * Obtém dataInclusao
   * return dataInclusao
   * @generated
   */
  public java.util.Date getDataInclusao(){
    return this.dataInclusao;
  }
  
  /**
   * Define dataInclusao
   * @param dataInclusao dataInclusao
   * @generated
   */
  public Objeto setDataInclusao(java.util.Date dataInclusao){
    this.dataInclusao = dataInclusao;
    return this;
  }
  
  /**
   * Obtém sistema
   * return sistema
   * @generated
   */
  public Sistema getSistema(){
    return this.sistema;
  }
  
  /**
   * Define sistema
   * @param sistema sistema
   * @generated
   */
  public Objeto setSistema(Sistema sistema){
    this.sistema = sistema;
    return this;
  }
  
  /**
   * Obtém tipoObjeto
   * return tipoObjeto
   * @generated
   */
  public TipoObjeto getTipoObjeto(){
    return this.tipoObjeto;
  }
  
  /**
   * Define tipoObjeto
   * @param tipoObjeto tipoObjeto
   * @generated
   */
  public Objeto setTipoObjeto(TipoObjeto tipoObjeto){
    this.tipoObjeto = tipoObjeto;
    return this;
  }
  
  /**
   * Obtém user
   * return user
   * @generated
   */
  public User getUser(){
    return this.user;
  }
  
  /**
   * Define user
   * @param user user
   * @generated
   */
  public Objeto setUser(User user){
    this.user = user;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Objeto object = (Objeto)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }
  
}