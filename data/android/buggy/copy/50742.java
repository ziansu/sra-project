@java.lang.Override
public void init(main.GameContainer gc) throws main.SlickException {
    pop = new main.AntPopulation(100);
    main.NeuralNet.Net net = new main.NeuralNet.Net(2, 4, 2);
    net.printNet();
}