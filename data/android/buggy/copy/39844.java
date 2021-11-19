@java.lang.Override
public void run() {
    imageprocessor.fft.twoDfft(inputData, realOut, imagOut, amplitudeOut, start, end);
    java.lang.System.out.printf("%d %d finished\n", start, end);
}