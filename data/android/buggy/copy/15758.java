@java.lang.Override
public int compareTo(Item other) {
    return (this.getProfit()) - (other.getProfit());
}