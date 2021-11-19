@org.junit.Test
public void testEither() {
    typeCheckClass(("\\static \\data Either (A B : \\Type0) | inl A | inr B\n" + ((("\\static \\function fun {A B : \\Type0} (e : Either A B) : \\Set0 <= \\elim e\n" + "  | inl _ => Nat\n") + "  | inr _ => Nat\n") + "\\static \\function test : fun (inl {Nat} {Nat} 0) => 0")));
}