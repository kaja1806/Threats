
public class Letter implements Runnable {
    public void run() {
        for (int i=0; i<10; i++){
            System.out.println((char)(i+97));
        }
}
}