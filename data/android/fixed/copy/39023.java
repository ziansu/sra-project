@controller.RequestMapping(value = "/inputparameter", method = RequestMethod.POST)
public controller.ResponseEntity<java.lang.Void> saveInputParameter(@controller.RequestBody
controller.InputParameter inputParameter) {
    return new controller.ResponseEntity<java.lang.Void>(HttpStatus.CREATED);
}