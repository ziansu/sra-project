@pl.ttsoft.editems.controllers.PutMapping(value = "/[id]")
public org.springframework.http.ResponseEntity<pl.ttsoft.editems.dto.externalVariable.ExternalVariableTO> updateVariable(@pl.ttsoft.editems.controllers.RequestBody
pl.ttsoft.editems.dto.externalVariable.ExternalVariableTO variable) {
    return new org.springframework.http.ResponseEntity(service.edytuj(variable), org.springframework.http.HttpStatus.OK);
}