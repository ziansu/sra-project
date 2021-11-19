public static com.arangodb.entity.CollectionType valueOf(int type) {
    switch (type) {
        case 2 :
            return com.arangodb.entity.CollectionType.DOCUMENT;
        case 3 :
            return com.arangodb.entity.CollectionType.EDGE;
    }
    return null;
}