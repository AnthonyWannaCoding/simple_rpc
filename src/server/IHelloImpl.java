package server;

public class IHelloImpl implements IHello{

    @Override
    public String sayHello(String string) {
        return "GoodDay ".concat(string);
    }
}
