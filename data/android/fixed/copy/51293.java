@org.springframework.web.bind.annotation.ResponseBody
@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.http.ResponseEntity<br.com.marketchase.models.resources.AnuncioResource> save(@org.springframework.web.bind.annotation.RequestBody
br.com.marketchase.models.resources.AnuncioResource resource) {
    anuncioService.save(resource);
    return new org.springframework.http.ResponseEntity<br.com.marketchase.models.resources.AnuncioResource>(resource, org.springframework.http.HttpStatus.CREATED);
}