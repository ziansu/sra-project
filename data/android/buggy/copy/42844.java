@org.junit.Test
public void shouldRemoveAMovieGenreFromTheProfile() {
    model.users.User user = model.builders.UserBuilder.anyUser().build();
    user.addMovieGenre(model.ACTION);
    user.removeMovieGenre(model.ACTION);
    org.junit.Assert.assertFalse(user.likeMovieGenre(model.ACTION));
}