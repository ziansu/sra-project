@java.lang.Override
public void afterTextChanged(android.text.Editable arg0) {
    if ((arg0.length()) > 0)
        arrTemp[holder.ref] = java.lang.Double.parseDouble(arg0.toString());
    
}