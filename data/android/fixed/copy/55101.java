@java.lang.Override
public void endQueryResult() throws eu.semagrow.stack.modules.sails.semagrow.TupleQueryResultHandlerException {
    latch.countDown();
    java.lang.System.out.println(count);
}