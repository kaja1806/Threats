public class PokingMan implements Runnable {
    private Thread bearThread;

    publiv PokingMan(Thread bearThread){
        this.bearThread= bearThread;
    }

    @Override
    public void run(){
        System.out.println("Man is walking");
        System.out.println("Man sees a bear, wishes to poke a bear");

        bearThread.interrupt();
        System.out.println("RIP");
    }
}