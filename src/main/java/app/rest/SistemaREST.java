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
 * Controller para expor serviços REST de Sistema
 * 
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/Sistema")
public class SistemaREST {

  /**
   * Classe de negócio para manipulação de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("SistemaBusiness")
  private SistemaBusiness sistemaBusiness;

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
  public Sistema post(@Validated @RequestBody final Sistema entity) throws Exception {
    return sistemaBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Sistema put(@Validated @RequestBody final Sistema entity) throws Exception {
    return sistemaBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{sistemaId}")
  public Sistema put(@Validated @RequestBody final Sistema entity, @PathVariable("sistemaId") java.lang.String sistemaId) throws Exception {
    return sistemaBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{sistemaId}")
  public void delete(@PathVariable("sistemaId") java.lang.String sistemaId) throws Exception {
    sistemaBusiness.delete(sistemaId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET)
  public HttpEntity<PagedResources<Sistema>> listParams(Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(sistemaBusiness.list(pageable)), HttpStatus.OK);    
  }

  /**
   * OneToMany Relationship GET - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{sistemaId}/Objeto/generalSearch")    
  public HttpEntity<PagedResources<Objeto>> findObjetoGeneralSearch(java.lang.String search, @PathVariable("sistemaId") java.lang.String sistemaId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(sistemaBusiness.findObjetoGeneralSearch(search, sistemaId, pageable)), HttpStatus.OK);
  }
  
  /**
   * OneToMany Relationship GET - Searchable fields - Specific search
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{sistemaId}/Objeto/specificSearch")    
  public HttpEntity<PagedResources<Objeto>> findObjetoSpecificSearch(@PathVariable("sistemaId") java.lang.String sistemaId, java.lang.String sigla, java.lang.String descricao, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(sistemaBusiness.findObjetoSpecificSearch(sistemaId, sigla, descricao, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{sistemaId}/Objeto")    
  public HttpEntity<PagedResources<Objeto>> findObjeto(@PathVariable("sistemaId") java.lang.String sistemaId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(sistemaBusiness.findObjeto(sistemaId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE 
   * @generated
   */  
  @RequestMapping(method = RequestMethod.DELETE, value="/{sistemaId}/Objeto/{objetoId}")    
  public void deleteObjeto(@PathVariable("objetoId") java.lang.String objetoId) throws Exception {
    this.objetoBusiness.delete(objetoId);
  }
  
  /**
   * OneToMany Relationship PUT
   * @generated
   */  
  @RequestMapping(method = RequestMethod.PUT, value="/{sistemaId}/Objeto")
  public Objeto putObjeto(@Validated @RequestBody final Objeto entity, @PathVariable("sistemaId") java.lang.String sistemaId) throws Exception {
    return this.objetoBusiness.put(entity);
  }  
  
  /**
   * OneToMany Relationship POST
   * @generated
   */  
  @RequestMapping(method = RequestMethod.POST, value="/{sistemaId}/Objeto")
  public Objeto postObjeto(@Validated @RequestBody final Objeto entity, @PathVariable("sistemaId") java.lang.String sistemaId) throws Exception {
    Sistema sistema = this.sistemaBusiness.get(sistemaId);
    entity.setSistema(sistema);
    return this.objetoBusiness.post(entity);
  }

  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/generalSearch")
  public HttpEntity<PagedResources<Sistema>> generalSearch(java.lang.String search, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(sistemaBusiness.generalSearch(search, pageable)), HttpStatus.OK);
  }
  
  /**
   * Searchable fields - Specific search
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/specificSearch")
  public HttpEntity<PagedResources<Sistema>> specificSearch(java.lang.String sigla, java.lang.String descricao, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(sistemaBusiness.specificSearch(sigla, descricao, pageable)), HttpStatus.OK);
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{sistemaId}")
  public Sistema get(@PathVariable("sistemaId") java.lang.String sistemaId) throws Exception {
    return sistemaBusiness.get(sistemaId);
  }
}
