public void createObjForIdentifier(org.opendaylight.yangtools.yang.binding.InstanceIdentifier<?> instanceIdentifier) {
    txDataMap.put(instanceIdentifier, new java.util.concurrent.ConcurrentLinkedDeque<org.opendaylight.yangtools.yang.binding.DataObject>(com.google.common.collect.Sets.newHashSet(new org.opendaylight.distributed.tx.impl.DTXTestTransaction.myDataObj())));
}