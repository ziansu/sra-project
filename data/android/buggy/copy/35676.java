@org.junit.Test
public void when_5_power_of_3() {
    float result = power.apply(5, 3);
    org.assertj.core.api.Assertions.assertThat(result).isEqualTo(125);
}