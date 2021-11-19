public static void addSource(java.lang.String id) {
    database.MongoFacade facade = new database.MongoFacade("web_search_pages");
    model.Source s = facade.getSourceWithId(id);
    main.SourceRep.id2source.put(id, s);
}