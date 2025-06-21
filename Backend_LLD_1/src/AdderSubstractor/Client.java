package AdderSubstractor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value value = new Value();
        value.setValue(0);

        Adder adder=new Adder(value);
        Substractor substractor=new Substractor(value);

        ExecutorService executorService= Executors.newCachedThreadPool();
        Future<Void>adderFuture =executorService.submit(adder);
        Future<Void>substractorFuture =executorService.submit(substractor);

        adderFuture.get();
        substractorFuture.get();
        executorService.shutdown();
        System.out.println("Final value after Adder-Subsractor: "+value.getValue());

    }
}
