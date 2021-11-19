public static void remove_first(java.util.ArrayList<com.company.Shorty> people) throws java.lang.Exception {
    people.remove(0);
    java.lang.System.out.println("Successfully deleted");
    if ((people.size()) == 0) {
        throw new java.lang.Exception("Empty collection");
    }
}