@org.example.Benchmark
public int reverse_uncached_bound() {
    int sum = 0;
    for (int i = (items.length) - 1; i >= 0; i--) {
        sum += i;
    }
    return sum;
}