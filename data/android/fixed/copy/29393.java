@java.lang.Override
public int compareTo(java.lang.Object another) {
    if (another instanceof com.comp4020.utils.Request)
        return (((com.comp4020.utils.Request) (another)).bookIndex) - (bookIndex);
    
    return 0;
}