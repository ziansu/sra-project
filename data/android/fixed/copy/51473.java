@org.springframework.web.bind.annotation.RequestMapping(value = "/rooms/{id}", method = org.springframework.web.bind.annotation.RequestMethod.DELETE, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
public org.springframework.http.ResponseEntity<java.lang.String> deletRoom(@org.springframework.web.bind.annotation.RequestHeader
java.lang.String authToken, @org.springframework.web.bind.annotation.PathVariable(value = "id")
java.lang.String id) {
    roomservice.delete(id);
    org.springframework.http.HttpHeaders httpHeaders = new org.springframework.http.HttpHeaders();
    return new org.springframework.http.ResponseEntity<java.lang.String>(httpHeaders, org.springframework.http.HttpStatus.ACCEPTED);
}