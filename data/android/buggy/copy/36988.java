private int getUserEditorRank() {
    return ((int) (((1000 + (new java.util.Random().nextInt(1000))) / (com.mapswithme.maps.editor.Editor.nativeGetStats()[0])) / 10));
}