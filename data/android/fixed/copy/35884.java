@com.coffeeshop.api.controller.DeleteMapping(value = "/{id}")
public void delete(@com.coffeeshop.api.controller.PathVariable
java.lang.Long id) {
    personService.removePerson(new com.coffeeshop.api.domain.Person(id));
}