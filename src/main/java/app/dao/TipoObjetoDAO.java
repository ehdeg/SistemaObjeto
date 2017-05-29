package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("TipoObjetoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface TipoObjetoDAO extends JpaRepository<TipoObjeto, java.lang.String> {

  /**
   * Obtém a instância de TipoObjeto utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM TipoObjeto entity WHERE entity.id = :id")
  public TipoObjeto findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de TipoObjeto utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM TipoObjeto entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from TipoObjeto c")
  public Page<TipoObjeto> list(Pageable pageable);
  

    
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Objeto entity WHERE entity.tipoObjeto.id = :id AND (entity.sigla like concat('%',coalesce(:search,''),'%') OR entity.descricao like concat('%',coalesce(:search,''),'%'))")
  public Page<Objeto> findObjetoGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Objeto entity WHERE entity.tipoObjeto.id = :id AND (:sigla is null OR entity.sigla like concat('%',:sigla,'%')) AND (:descricao is null OR entity.descricao like concat('%',:descricao,'%'))")
  public Page<Objeto> findObjetoSpecificSearch(@Param(value="id") java.lang.String id, @Param(value="sigla") java.lang.String sigla, @Param(value="descricao") java.lang.String descricao, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Objeto entity WHERE entity.tipoObjeto.id = :id")
  public Page<Objeto> findObjeto(@Param(value="id") java.lang.String id, Pageable pageable);

  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM TipoObjeto entity WHERE entity.sigla like concat('%',coalesce(:search,''),'%') OR entity.descricao like concat('%',coalesce(:search,''),'%')")
  public Page<TipoObjeto> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM TipoObjeto entity WHERE (:sigla is null OR entity.sigla like concat('%',:sigla,'%')) AND (:descricao is null OR entity.descricao like concat('%',:descricao,'%'))")
  public Page<TipoObjeto> specificSearch(@Param(value="sigla") java.lang.String sigla, @Param(value="descricao") java.lang.String descricao, Pageable pageable);
  
}
