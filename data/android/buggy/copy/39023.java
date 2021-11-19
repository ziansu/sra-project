@controller.RequestMapping(value = "/inputparameter", method = RequestMethod.POST)
public controller.ResponseEntity<java.lang.Void> saveInputParameter(@controller.RequestBody
controller.InputParameter inputParameter) {
    java.lang.System.out.println(("DETTE FUNKET!" + (inputParameter.getParameter())));
    java.lang.System.out.println(inputParameter.getType());
    return new controller.ResponseEntity<java.lang.Void>(HttpStatus.CREATED);
}