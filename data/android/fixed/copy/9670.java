public com.unimelb.swen30006.metromadness.tracks.Line getRandomLine() {
    return lines.get(((int) ((java.lang.Math.random()) * ((lines.size()) - 1))));
}