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
 * Classe que representa a camada de negócios de ObjetoBusiness
 * 
 * @generated
 **/
@Service("ObjetoBusiness")
public class ObjetoBusiness {



  /**
   * Instância da classe ObjetoDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("ObjetoDAO")
  protected ObjetoDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Objeto post(final Objeto entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    Objeto result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Objeto put(final Objeto entity) throws Exception {
    // begin-user-code  
    // end-user-code
    Objeto result = repository.saveAndFlush(entity);
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
    Objeto entity = this.get(id);
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
  public Objeto get(java.lang.String id) throws Exception {
    // begin-user-code  
    // end-user-code
    Objeto result = repository.findOne(id);
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
  public Page<Objeto> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Objeto> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  public Page<Objeto> generalSearch(java.lang.String search, Pageable pageable) {
    return repository.generalSearch(search, pageable);
  }
  
  /**
   * Searchable fields - Specific search
   * @generated
   */
  public Page<Objeto> specificSearch(java.lang.String sigla, java.lang.String descricao, Pageable pageable) {
    return repository.specificSearch(sigla, descricao, pageable);
  }
  
  /**
   * Foreign Key sistema
   * @generated
   */
  public Page<Objeto> findObjetosBySistema(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Objeto> result = repository.findObjetosBySistema(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
  /**
   * Foreign Key tipoObjeto
   * @generated
   */
  public Page<Objeto> findObjetosByTipoObjeto(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Objeto> result = repository.findObjetosByTipoObjeto(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
  /**
   * Foreign Key user
   * @generated
   */
  public Page<Objeto> findObjetosByUser(java.lang.String instanceId, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Objeto> result = repository.findObjetosByUser(instanceId, pageable);
    // begin-user-code  
    // end-user-code        
    return result;
  }
  
}
