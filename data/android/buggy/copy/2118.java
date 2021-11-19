public long move() {
    positions[count] += prime;
    long position = positions[count];
    count = ((count) + 1) % (positions.length);
    return position;
}