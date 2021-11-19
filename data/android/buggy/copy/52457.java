@org.springframework.web.bind.annotation.RequestMapping(value = "type", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public void saveType(@org.springframework.web.bind.annotation.RequestBody
it.adfor.rapportino.controller.Type type) {
    if ((typeRepository.findByName(type.getName())) == null)
        typeRepository.save(new it.adfor.rapportino.controller.Type(type.getName()));
    else
        throw new java.lang.RuntimeException();
    
}