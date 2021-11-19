@org.junit.Test
public void bestGuessForString_simpleClass() {
    com.google.common.truth.Truth.assertThat(dagger.internal.codegen.writer.ClassName.bestGuessFromString(java.lang.String.class.getName())).isEqualTo(dagger.internal.codegen.writer.ClassName.create("java.lang", "String"));
}