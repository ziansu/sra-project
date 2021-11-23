@java.lang.Override
protected nl.knaw.huygens.timbuctoo.util.Tuple<java.lang.String, java.lang.Object> to(nl.knaw.huygens.timbuctoo.database.dto.property.ArrayOfLimitedValuesProperty property) throws java.io.IOException {
    return nl.knaw.huygens.timbuctoo.util.Tuple.tuple(property.getName(), property.getValue());
}