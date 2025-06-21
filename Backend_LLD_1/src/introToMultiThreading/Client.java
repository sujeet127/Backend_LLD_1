package introToMultiThreading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = List.of(8,1,3,4,9,2,0);
        ExecutorService executorService = Executors.newCachedThreadPool();
        Sorter sorter=new Sorter(list,executorService);
        Future<List<Integer>> sortedArray = executorService.submit(sorter);
        System.out.println("Sorted Array : "+sortedArray.get());





    }
}
