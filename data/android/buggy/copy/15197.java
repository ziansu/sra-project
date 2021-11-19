protected static void relationEnumeration(uk.ac.shef.dcs.sti.core.algorithm.smp.TColumnColumnRelationEnumerator relationLearner, uk.ac.shef.dcs.sti.core.algorithm.smp.TAnnotation tabAnnotations, uk.ac.shef.dcs.sti.core.algorithm.smp.Table table, int subjectColumnIndex) throws uk.ac.shef.dcs.sti.STIException {
    uk.ac.shef.dcs.sti.core.algorithm.smp.SMPInterpreter.LOG.info("\t\t>> relation enumeration...");
    relationLearner.runRelationEnumeration(tabAnnotations, table, subjectColumnIndex);
}