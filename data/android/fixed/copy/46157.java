@java.lang.Override
public void writeType(org.raml.emitter.types.TypeRegistry registry, org.raml.utilities.IndentedAppendable writer, org.raml.api.RamlMediaType ramlMediaType, org.raml.api.RamlResourceMethod method, org.raml.api.RamlEntity type) throws java.io.IOException {
    writeBody(registry, writer, ramlMediaType, type);
}