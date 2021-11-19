@java.lang.Override
public E get(int arg0) {
    if (arg0 >= (index))
        return null;
    
    return ((E) (data[arg0]));
}