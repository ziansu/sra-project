private org.bson.BsonObjectId fromElement(org.smof.element.Element value, org.smof.parsers.SerializationContext serContext) {
    dispatcher.insertChild(value);
    final org.bson.BsonObjectId id = toBsonObjectId(value);
    serContext.put(value, SmofType.OBJECT, id);
    return id;
}