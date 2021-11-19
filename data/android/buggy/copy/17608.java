@org.springframework.web.bind.annotation.RequestMapping(value = "/update", method = org.springframework.web.bind.annotation.RequestMethod.PUT)
public fr.univbrest.dosi.bean.Formation updateFormation(@org.springframework.web.bind.annotation.RequestBody
fr.univbrest.dosi.bean.Formation updatedFormation) {
    return this.service.updateFormation(updatedFormation.getCodeFormation(), updatedFormation);
}