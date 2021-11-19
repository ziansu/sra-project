@java.lang.Override
public int compareTo(model.MathElement o) {
    java.lang.System.out.println(((("Comparing, " + (this)) + " to ") + o));
    return (mXStart) - (o.getXStart());
}