@java.lang.Override
protected void describeMismatchSafely(com.twitter.model.User item, org.hamcrest.Description mismatchDescription) {
    mismatchDescription.appendText("a user banned status was ").appendValue((!(item.isAccountNonLocked())));
}