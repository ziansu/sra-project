@MPS.controllers.RequestMapping(value = "/view")
@MPS.controllers.ResponseBody
public java.util.List<MPS.models.Enterprises> list() {
    java.util.List enterprises = enterpriserepo.findAll();
    java.lang.System.out.println(enterprises.get(0));
    return enterprises;
}