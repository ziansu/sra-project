@java.lang.Override
public int compareTo(interfaces.IElement o) {
    if (this.equals(o))
        return 0;
    else
        if (o != null)
            return o.toString().compareTo(this.toString());
        else
            return -1;
        
    
}