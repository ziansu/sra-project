@java.lang.Override
public java.lang.Object getItem(int position) {
    if ((filteredData) == null) {
        return null;
    }else {
        return filteredData.get(position);
    }
}