private org.bson.BsonObjectId fromElement(org.smof.element.Element value, org.smof.parsers.SerializationContext serContext) {
    final org.bson.BsonObjectId id = toBsonObjectId(value);
    serContext.put(value, SmofType.OBJECT, id);
    dispatcher.insertChild(value);
    return id;
}