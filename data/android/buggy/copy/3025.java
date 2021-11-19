@org.junit.Test
public void ElfoVerdeNaoAtiraFlechaENRecebeXP() {
    ElfosVerdes teste = new ElfosVerdes("Arthur");
    assertEquals(0, teste.getExperiencia());
}