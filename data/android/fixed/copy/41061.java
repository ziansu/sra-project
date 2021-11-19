@java.lang.Override
public int compare(org.nschmidt.ldparteditor.data.Primitive o1, org.nschmidt.ldparteditor.data.Primitive o2) {
    if (o1 == me)
        return 1;
    
    if (o2 == me)
        return -1;
    
    if (o1 == o2)
        return 0;
    
    return o1.compareTo(o2);
}