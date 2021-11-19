public static boolean existsIn(java.lang.String[] a, java.lang.String b) {
    for (java.lang.String c : a)
        if (c.equalsIgnoreCase(b))
            return true;
        
    
    return false;
}