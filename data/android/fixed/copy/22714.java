private static java.lang.String getSize(java.lang.String list_name) {
    if (com.kerbybit.chattriggers.objects.ListHandler.lists.containsKey(list_name))
        return (com.kerbybit.chattriggers.objects.ListHandler.lists.get(list_name).size()) + "";
    
    return "0";
}