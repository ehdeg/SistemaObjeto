package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;

/**
 * Classe que representa a tabela OBJ_TIPO_OBJETO
 * @generated
 */
@Entity
@Table(name = "\"OBJ_TIPO_OBJETO\"" ,uniqueConstraints=@UniqueConstraint(columnNames={
"sigla" }))
@XmlRootElement
public class TipoObjeto implements Serializable {

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
  @Column(name = "sigla", nullable = true, unique = true, length=20, insertable=true, updatable=true)
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
   * Construtor
   * @generated
   */
  public TipoObjeto(){
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
  public TipoObjeto setId(java.lang.String id){
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
  public TipoObjeto setSigla(java.lang.String sigla){
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
  public TipoObjeto setDescricao(java.lang.String descricao){
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
  public TipoObjeto setObservacao(java.lang.String observacao){
    this.observacao = observacao;
    return this;
  }
  
  /**
   * @generated
   */ 
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    TipoObjeto object = (TipoObjeto)obj;
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