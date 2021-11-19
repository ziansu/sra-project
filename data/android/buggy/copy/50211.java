@java.lang.Override
public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
    kaaass.echess.Chess c = kaaass.echess.Chess.point(x, y);
    c.action = this.action.clone();
    c.attack = this.attack.clone();
    return c;
}