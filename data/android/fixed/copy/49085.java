public static mainForm.MIDIEvent programChange(int deltaPPQ, int programNumber, int patchNumber) {
    return new mainForm.MIDIEvent(deltaPPQ, new int[]{ 192 + programNumber , patchNumber });
}