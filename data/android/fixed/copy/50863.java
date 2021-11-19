@org.springframework.web.bind.annotation.RequestMapping(value = "/statements", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = "application/json")
@org.springframework.web.bind.annotation.ResponseBody
public jena.JenaStatement statement(@org.springframework.web.bind.annotation.PathVariable(value = "id")
int id) {
    return statementArrayList.get(id);
}