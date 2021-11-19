@org.junit.Test
public void factor7() throws cop5555sp15.SimpleParser.SyntaxException {
    java.lang.System.out.println("factor7");
    java.lang.String input = "class A {def C={->x= &y; z = !y;};} ";
    java.lang.System.out.println(input);
    parseIncorrectInput(input, cop5555sp15.AND);
}