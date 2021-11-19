@org.testng.annotations.Test
public void stringReverse() {
    java.lang.String name = "Reverse";
    for (int i = (name.length()) - 1; i >= 0; i--) {
        java.lang.System.out.println(name.charAt(i));
    }
}