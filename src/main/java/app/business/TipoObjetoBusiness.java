package app.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.*;
import app.dao.*;
import app.entity.*;

/**
 * Classe que representa a camada de negócios de TipoObjetoBusiness
 * 
 * @generated
 **/
@Service("TipoObjetoBusiness")
public class TipoObjetoBusiness {



  /**
   * Instância da classe TipoObjetoDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("TipoObjetoDAO")
  protected TipoObjetoDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public TipoObjeto post(final TipoObjeto entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    TipoObjeto result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public TipoObjeto put(final TipoObjeto entity) throws Exception {
    // begin-user-code  
    // end-user-code
    TipoObjeto result = repository.saveAndFlush(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  public void delete(java.lang.String id) throws Exception {
    TipoObjeto entity = this.get(id);
    // begin-user-code  
    // end-user-code
    this.repository.delete(entity);
    // begin-user-code  
    // end-user-code        
  }
  
  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  public TipoObjeto get(java.lang.String id) throws Exception {
    // begin-user-code  
    // end-user-code
    TipoObjeto result = repository.findOne(id);
    // begin-user-code
    // end-user-code
    return result;
  }

  // CRUD
  
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public Page<TipoObjeto> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<TipoObjeto> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  /**
   * @generated modifiable
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   */  
  public Page<Objeto> findObjetoGeneralSearch(java.lang.String search, java.lang.String id,  Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Objeto> result = repository.findObjetoGeneralSearch(search, id,  pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation - Searchable fields - Specific search
   */  
  public Page<Objeto> findObjetoSpecificSearch(java.lang.String id, java.lang.String sigla, java.lang.String descricao, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Objeto> result = repository.findObjetoSpecificSearch(id, sigla, descricao, pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<Objeto> findObjeto(java.lang.String id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Objeto> result = repository.findObjeto(id, pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  public Page<TipoObjeto> generalSearch(java.lang.String search, Pageable pageable) {
    return repository.generalSearch(search, pageable);
  }
  
  /**
   * Searchable fields - Specific search
   * @generated
   */
  public Page<TipoObjeto> specificSearch(java.lang.String sigla, java.lang.String descricao, Pageable pageable) {
    return repository.specificSearch(sigla, descricao, pageable);
  }
  
}
