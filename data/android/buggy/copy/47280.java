@example.api.ApiMethod(description = "add color item")
@example.api.RequestMapping(value = "/color/{colors}", method = RequestMethod.PUT)
public void addColorByPath(@example.api.ApiPathParam(name = "colors", description = "color list")
@example.api.PathVariable
java.util.List<example.api.RestServer.Color> colors) {
    for (example.api.RestServer.Color color : colors) {
        colorTable.put(color.name, ("#" + (color.code)));
    }
}