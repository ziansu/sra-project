private void advanceNoteCounter() {
    (streamNoteLengthCounter)--;
    if ((streamNoteLengthCounter) <= 0) {
        streamNoteLengthCounter = currentNoteLength;
        fetchNextByte();
    }
}