@com.ufcg.si1.controller.RequestMapping(value = "/prefeitura", method = RequestMethod.GET)
public org.springframework.http.ResponseEntity<com.ufcg.si1.prefeitura.Prefeitura> getSituacao() {
    java.lang.System.out.println("requisição chegando");
    return new org.springframework.http.ResponseEntity<com.ufcg.si1.prefeitura.Prefeitura>(prefeitura, org.springframework.http.HttpStatus.OK);
}