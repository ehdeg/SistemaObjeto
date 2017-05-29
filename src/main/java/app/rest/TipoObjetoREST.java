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
 * Controller para expor serviços REST de TipoObjeto
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/TipoObjeto")
public class TipoObjetoREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("TipoObjetoBusiness")
  private TipoObjetoBusiness tipoObjetoBusiness;

  /**
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
  public TipoObjeto post(@Validated @RequestBody final TipoObjeto entity) throws Exception {
    return tipoObjetoBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public TipoObjeto put(@Validated @RequestBody final TipoObjeto entity) throws Exception {
    return tipoObjetoBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{tipoObjetoId}")
  public TipoObjeto put(@Validated @RequestBody final TipoObjeto entity, @PathVariable("tipoObjetoId") java.lang.String tipoObjetoId) throws Exception {
    return tipoObjetoBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{tipoObjetoId}")
  public void delete(@PathVariable("tipoObjetoId") java.lang.String tipoObjetoId) throws Exception {
    tipoObjetoBusiness.delete(tipoObjetoId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<TipoObjeto>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(tipoObjetoBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * OneToMany Relationship GET - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{tipoObjetoId}/Objeto/generalSearch")    
  public HttpEntity<PagedResources<Objeto>> findObjetoGeneralSearch(java.lang.String search, @PathVariable("tipoObjetoId") java.lang.String tipoObjetoId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(tipoObjetoBusiness.findObjetoGeneralSearch(search, tipoObjetoId, pageable)), HttpStatus.OK);
  }
  
  /**
   * OneToMany Relationship GET - Searchable fields - Specific search
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{tipoObjetoId}/Objeto/specificSearch")    
  public HttpEntity<PagedResources<Objeto>> findObjetoSpecificSearch(@PathVariable("tipoObjetoId") java.lang.String tipoObjetoId, java.lang.String sigla, java.lang.String descricao, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(tipoObjetoBusiness.findObjetoSpecificSearch(tipoObjetoId, sigla, descricao, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{tipoObjetoId}/Objeto")    
  public HttpEntity<PagedResources<Objeto>> findObjeto(@PathVariable("tipoObjetoId") java.lang.String tipoObjetoId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(tipoObjetoBusiness.findObjeto(tipoObjetoId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{tipoObjetoId}/Objeto/{objetoId}")    
  public void deleteObjeto(@PathVariable("objetoId") java.lang.String objetoId) throws Exception {
    this.objetoBusiness.delete(objetoId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{tipoObjetoId}/Objeto")
  public Objeto putObjeto(@Validated @RequestBody final Objeto entity, @PathVariable("tipoObjetoId") java.lang.String tipoObjetoId) throws Exception {
    return this.objetoBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{tipoObjetoId}/Objeto")
  public Objeto postObjeto(@Validated @RequestBody final Objeto entity, @PathVariable("tipoObjetoId") java.lang.String tipoObjetoId) throws Exception {
    TipoObjeto tipoObjeto = this.tipoObjetoBusiness.get(tipoObjetoId);
    entity.setTipoObjeto(tipoObjeto);
    return this.objetoBusiness.post(entity);
  }

  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/generalSearch")
  public HttpEntity<PagedResources<TipoObjeto>> generalSearch(java.lang.String search, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(tipoObjetoBusiness.generalSearch(search, pageable)), HttpStatus.OK);
  }
  
  /**
   * Searchable fields - Specific search
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/specificSearch")
  public HttpEntity<PagedResources<TipoObjeto>> specificSearch(java.lang.String sigla, java.lang.String descricao, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(tipoObjetoBusiness.specificSearch(sigla, descricao, pageable)), HttpStatus.OK);
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{tipoObjetoId}")
  public TipoObjeto get(@PathVariable("tipoObjetoId") java.lang.String tipoObjetoId) throws Exception {
    return tipoObjetoBusiness.get(tipoObjetoId);
  }
}
