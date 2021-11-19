@java.lang.Override
public int compareTo(Item other) {
    if (((this.getProfit()) - (other.getProfit())) > 0) {
        return 1;
    }else {
        return 0;
    }
}