package exception.basic.checkeed;

public class Client {
    public void call() throws MyCheckedException {

        //문제상황
        throw new MyCheckedException("ex");
    }
}
