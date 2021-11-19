@org.junit.Test
public void expressions2() throws cop5555sp15.SimpleParser.SyntaxException {
    java.lang.System.out.println("expressions2");
    java.lang.String input = "class A {def C={->x=x+1/2*3--4; z = 3-4-5;};} ";
    java.lang.System.out.println(input);
    parseCorrectInput(input);
}