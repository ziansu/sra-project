@java.lang.Override
public boolean match(com.mckoi.odb.util.FileInfo file) {
    java.lang.String item_name = file.getItemName();
    return (pre_string_sz != 0) && (!(item_name.startsWith(pre_string)));
}