package introToMultiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    List<Integer> list;
    ExecutorService executorService;
    Sorter(List<Integer> list,ExecutorService executorService) {
        this.list = list;
        this.executorService=executorService;

    }
    @Override
    public List<Integer> call() throws Exception {
        if(list.size()<=1){
            return list;
        }
        int mid = list.size()/2;
        List<Integer> leftArray = list.subList(0,mid);
        List<Integer> rightArray = list.subList(mid,list.size());

        //create two object of sorter as thread accept task i.e class object
        Sorter leftSortedArray = new Sorter(leftArray,executorService);
        Sorter rightSortedArray = new Sorter(rightArray,executorService);

        //ExecutorService executorService=Executors.newFixedThreadPool(2);
        Future<List<Integer>> leftFuture = executorService.submit(leftSortedArray);
        Future<List<Integer>> rightFuture = executorService.submit(rightSortedArray);

        //get the list from future like subscribe
        List<Integer> leftSortedList = leftFuture.get();
        List<Integer> righSortedtList = rightFuture.get();

        // merge these two list
        System.out.println("Merging two arrays");
        System.out.println("Left: "+leftSortedList);
        System.out.println("Right: "+righSortedtList);
        System.out.println("Thread: "+Thread.currentThread().getName());




        int i=0,j=0;
        List<Integer> sortedList = new ArrayList<>();
        while(i<leftSortedList.size() && j<righSortedtList.size()){
            if(leftSortedList.get(i)<righSortedtList.get(j)){
                sortedList.add(leftSortedList.get(i++));
            }else {
                sortedList.add(righSortedtList.get(j++));
            }
        }
        //for remaining list
        while (i<leftSortedList.size()){
            sortedList.add(leftSortedList.get(i++));
        }
        while (j<righSortedtList.size()){
            sortedList.add(righSortedtList.get(j++));
        }
    return sortedList;

    }
}
