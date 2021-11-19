public static <T> T avoidNull(T t, T Default) {
    if (t == null)
        return Default;
    else
        return t;
    
}