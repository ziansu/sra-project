@java.lang.SafeVarargs
@javax.annotation.Nonnull
public static <R extends org.lenskit.api.Result> org.lenskit.api.ResultList newResultList(R... results) {
    return new org.lenskit.results.BasicResultList(com.google.common.collect.ImmutableList.copyOf(results));
}