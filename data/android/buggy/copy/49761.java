@java.lang.Override
public void steppedOnYou(main.Robot r) {
    main.Skeleton.printLastCalledFunction(r.id, new java.lang.String[]{ r.id , main.Skeleton.getClassName(r) });
    robots.add(r);
    r.killRobot();
}