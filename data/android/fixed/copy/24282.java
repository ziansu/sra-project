@controllers.RequestMapping(value = "/{id}", method = RequestMethod.GET)
public org.springframework.http.ResponseEntity<model.Client> getById(@controllers.PathVariable
int id) {
    model.Client client = service.get(id);
    java.lang.System.out.println(client);
    if (client == null)
        return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.NOT_FOUND);
    else
        return new org.springframework.http.ResponseEntity(client, org.springframework.http.HttpStatus.OK);
    
}