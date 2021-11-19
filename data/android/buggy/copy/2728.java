@java.lang.Override
public java.lang.Boolean getItem(int position) {
    return myList.get(position).isAvailable().equals("true");
}