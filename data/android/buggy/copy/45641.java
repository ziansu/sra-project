@java.lang.Override
public int getDistance(eyeinterestanalyzer.clustering.ClusteringStringItem otherItem) {
    return eyeinterestanalyzer.LevenshteinDistance.getLevenshteinDistanceDelimitedString(this.stringValue, otherItem.getStringValue());
}