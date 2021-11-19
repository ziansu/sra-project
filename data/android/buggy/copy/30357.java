@org.openmrs.module.muzimabiometrics.web.controller.RequestMapping(value = "scannerException.form", method = RequestMethod.POST)
public void setException(@org.openmrs.module.muzimabiometrics.web.controller.RequestBody
java.lang.String request) {
    java.lang.System.out.println(("scanner exception found+++++++++++++++++++++++++++++++++++" + request));
    scannerException = request;
}