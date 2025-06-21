package introToMultiThreading;

public class NumberPrinter implements Runnable{
    private int noToPrint;
    public NumberPrinter(int number){
        this.noToPrint=number;
    }
    @Override
    public void run() {
        System.out.println("Number: "+noToPrint+" thread : "+Thread.currentThread().getName());

    }
}
