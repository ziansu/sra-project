@org.junit.Test
public void shouldLoseIfPopulationIsWipedOut() {
    com.hamurabi.City city = new com.hamurabi.City(10);
    city.setDeathCount(100);
    org.assertj.core.api.Assertions.assertThat(calculator.isGameOver(city)).isTrue();
}