private java.lang.String stars(int rating) {
    java.lang.String stars = "";
    for (int i = 0; i < rating; ++i) {
        stars += "*";
    }
    return stars;
}