package app.rest;

import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.*;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.*;
import org.springframework.beans.factory.annotation.*;
import java.util.*;
import app.entity.*;
import app.business.*;

/**
 * Controller para expor serviços REST de Objeto
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/Objeto")
public class ObjetoREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("ObjetoBusiness")
  private ObjetoBusiness objetoBusiness;

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public Objeto post(@Validated @RequestBody final Objeto entity) throws Exception {
    return objetoBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Objeto put(@Validated @RequestBody final Objeto entity) throws Exception {
    return objetoBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{objetoId}")
  public Objeto put(@Validated @RequestBody final Objeto entity, @PathVariable("objetoId") java.lang.String objetoId) throws Exception {
    return objetoBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{objetoId}")
  public void delete(@PathVariable("objetoId") java.lang.String objetoId) throws Exception {
    objetoBusiness.delete(objetoId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Objeto>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(objetoBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/generalSearch")
  public HttpEntity<PagedResources<Objeto>> generalSearch(java.lang.String search, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(objetoBusiness.generalSearch(search, pageable)), HttpStatus.OK);
  }
  
  /**
   * Searchable fields - Specific search
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/specificSearch")
  public HttpEntity<PagedResources<Objeto>> specificSearch(java.lang.String sigla, java.lang.String descricao, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(objetoBusiness.specificSearch(sigla, descricao, pageable)), HttpStatus.OK);
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{objetoId}")
  public Objeto get(@PathVariable("objetoId") java.lang.String objetoId) throws Exception {
    return objetoBusiness.get(objetoId);
  }

  /**
   * Foreign Key sistema
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/Sistema/{sistemaId}")    
  public HttpEntity<PagedResources<Objeto>> findObjetosBySistema(@PathVariable("sistemaId") java.lang.String sistemaId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(objetoBusiness.findObjetosBySistema(sistemaId, pageable)), HttpStatus.OK);
  }

  /**
   * Foreign Key tipoObjeto
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/TipoObjeto/{tipoObjetoId}")    
  public HttpEntity<PagedResources<Objeto>> findObjetosByTipoObjeto(@PathVariable("tipoObjetoId") java.lang.String tipoObjetoId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(objetoBusiness.findObjetosByTipoObjeto(tipoObjetoId, pageable)), HttpStatus.OK);
  }

  /**
   * Foreign Key user
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/User/{userId}")    
  public HttpEntity<PagedResources<Objeto>> findObjetosByUser(@PathVariable("userId") java.lang.String userId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(objetoBusiness.findObjetosByUser(userId, pageable)), HttpStatus.OK);
  }
}
