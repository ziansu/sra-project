@com.coffeeshop.api.controller.DeleteMapping(value = "/{id}")
public void delete(@com.coffeeshop.api.controller.RequestBody
com.coffeeshop.api.domain.Person person) {
    personService.removePerson(person);
}