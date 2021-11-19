private int convertToStarRating(java.lang.String rating) {
    return rating.isEmpty() ? 0 : ((java.lang.Integer.parseInt(rating)) * (org.melocine.types.MetaData.MAX_RATING)) / 255;
}