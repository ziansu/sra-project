@org.springframework.web.bind.annotation.RequestMapping(value = "lights/{id}/dim/{dim:[0-9]+}")
public void dimLight(@org.springframework.web.bind.annotation.PathVariable(value = "id")
final int id, @org.springframework.web.bind.annotation.PathVariable(value = "dim")
final int dimBasisPoints) {
    this.philipsHue.dim(id, dimBasisPoints);
}