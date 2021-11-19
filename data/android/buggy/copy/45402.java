@java.lang.Override
public int compareTo(BBNode other) {
    double temp = (this.lb.value) - (other.lb.value);
    if (temp > 0)
        return 1;
    else
        if (temp < 0)
            return -1;
        else
            return 0;
        
    
}