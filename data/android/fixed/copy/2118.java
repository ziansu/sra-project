public long move() {
    long position = positions[count];
    positions[count] += prime;
    count = ((count) + 1) % (positions.length);
    return position;
}