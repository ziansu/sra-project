@org.junit.Test
public void shouldBindToView() {
    org.assertj.core.api.Assertions.assertThat(presenter.getView()).isSameAs(view);
}