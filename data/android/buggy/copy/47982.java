@java.lang.Override
public demo.domain.AccountHolder getHolder() {
    demo.domain.AccountHolder holder = accountHolderMapper.findAccountHolderByID(1);
    return holder;
}