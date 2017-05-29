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
 * Classe que representa a camada de negócios de SistemaBusiness
 * 
 * @generated
 **/
@Service("SistemaBusiness")
public class SistemaBusiness {



  /**
   * Instância da classe SistemaDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("SistemaDAO")
  protected SistemaDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Sistema post(final Sistema entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    Sistema result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Sistema put(final Sistema entity) throws Exception {
    // begin-user-code  
    // end-user-code
    Sistema result = repository.saveAndFlush(entity);
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
    Sistema entity = this.get(id);
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
  public Sistema get(java.lang.String id) throws Exception {
    // begin-user-code  
    // end-user-code
    Sistema result = repository.findOne(id);
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
  public Page<Sistema> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Sistema> result = repository.list(pageable);
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
  public Page<Sistema> generalSearch(java.lang.String search, Pageable pageable) {
    return repository.generalSearch(search, pageable);
  }
  
  /**
   * Searchable fields - Specific search
   * @generated
   */
  public Page<Sistema> specificSearch(java.lang.String sigla, java.lang.String descricao, Pageable pageable) {
    return repository.specificSearch(sigla, descricao, pageable);
  }
  
}
