@java.lang.Override
public long getSourceCount(java.lang.String schema, java.lang.String entity, gobblin.source.workunit.WorkUnit workUnit, java.util.List<gobblin.source.extractor.watermark.Predicate> predicateList) throws gobblin.source.extractor.exception.RecordCountException {
    throw new gobblin.source.extractor.exception.RecordCountException("GetSourceCount with query is not supported! Please set source.querybased.skip.count.calc to true.");
}