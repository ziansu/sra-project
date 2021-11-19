public static hypercard.parts.FieldPart fromGeometry(hypercard.parts.CardPart parent, java.awt.Rectangle geometry) {
    hypercard.parts.FieldPart field = new hypercard.parts.FieldPart(hypercard.parts.fields.FieldStyle.OPAQUE, parent);
    field.initProperties(geometry);
    return field;
}