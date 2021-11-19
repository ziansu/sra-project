public uk.ac.mdx.cs.ie.acontextlib.IContextReceiver remove(java.lang.String appkey) {
    uk.ac.mdx.cs.ie.acontextlib.IContextReceiver result = mReceiverMap.remove(appkey);
    mReceivers = ((uk.ac.mdx.cs.ie.acontextlib.ContextReceiver[]) (mReceiverMap.values().toArray()));
    return result;
}