@java.lang.Override
public int quantityDropped(java.util.Random prng) {
    return (prng.nextInt(4)) | 1;
}