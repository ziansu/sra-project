@org.junit.Test
public void shouldLoseIfPopulationIsWipedOut() {
    org.assertj.core.api.Assertions.assertThat(calculator.isGameOver(city)).isTrue();
}