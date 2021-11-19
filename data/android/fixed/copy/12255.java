@java.lang.Override
public java.lang.Long getTotalRating() {
    if ((totalRating) == null)
        totalRating = starCount;
    
    return (totalRating) == null ? 0 : totalRating;
}