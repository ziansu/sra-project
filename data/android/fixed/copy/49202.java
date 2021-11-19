public static void writeRelation(relations_identification.Relation relation) {
    java.lang.String relations = relation.toString();
    io.Writer.appendLineToFile(relations, "relations_backup/initial_relations.txt");
}