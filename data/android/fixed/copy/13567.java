@org.junit.Test
public void getBestDateTimePattern_returnsReasonableValue() {
    org.assertj.core.api.Assertions.assertThat(libcore.icu.ICU.getBestDateTimePattern("hm", null)).isEqualTo("hm");
}