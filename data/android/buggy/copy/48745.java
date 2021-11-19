@com.ufcg.si1.controller.RequestMapping(value = "/prefeitura", method = RequestMethod.PUT)
public org.springframework.http.ResponseEntity<com.ufcg.si1.prefeitura.Prefeitura> setSituacao(@com.ufcg.si1.controller.RequestBody
com.ufcg.si1.prefeitura.Prefeitura pref, org.springframework.web.util.UriComponentsBuilder ucBuilder) {
    java.lang.System.out.println("requisição chegando");
    prefeitura.setSituacao(pref.getSituacao());
    return new org.springframework.http.ResponseEntity<com.ufcg.si1.prefeitura.Prefeitura>(prefeitura, org.springframework.http.HttpStatus.OK);
}