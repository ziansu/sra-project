public void decDownvote() {
    if ((java.lang.Integer.parseInt(ratingDownvotes)) > 0) {
        this.ratingDownvotes = java.lang.String.valueOf(((java.lang.Integer.parseInt(ratingDownvotes)) - 1));
    }
}