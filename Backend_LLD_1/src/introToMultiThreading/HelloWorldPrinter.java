package introToMultiThreading;

public class HelloWorldPrinter implements Runnable{
    public void print(){
        System.out.println("Hello World Printer "+Thread.currentThread().getName());
    }

    @Override
    public void run() {
        print();
    }
}
