
public class Threads {
    public static void main(String [] args) {


Thread numberThread = new Thread(new Numbers());
    Thread letterThread = new Thread(new Letters());

numberThread.start();
letterThread.start();

