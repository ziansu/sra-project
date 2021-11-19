@org.junit.Test
public void typeCheckDefType() {
    com.jetbrains.jetpad.vclang.naming.NamespaceMember member = com.jetbrains.jetpad.vclang.typechecking.TypeCheckingTestCase.typeCheckClass(("\\static \\function x : \\Type0 => Nat\n" + "\\static \\function y : x => zero"));
    org.junit.Assert.assertEquals(2, member.namespace.getMembers().size());
}