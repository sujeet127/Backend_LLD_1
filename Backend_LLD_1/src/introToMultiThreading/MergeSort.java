package introToMultiThreading;

import java.util.Arrays;
import java.util.concurrent.Callable;

public class MergeSort implements Callable<Integer[]> {
    private Integer [] ar;
    private int l;
    private int r;

    MergeSort(Integer [] ar, int l, int r) {
        this.ar = ar;
        this.l = l;
        this.r = r;
    }

    public Integer[] mergeSort(Integer []ar,int l,int r){
        if(l<r){
            int m=(l+r)/2;
            mergeSort(ar,l,m);
            mergeSort(ar,m+1,r);
            merge(ar,l,m,r);
        }
        return ar;
    }
    public void merge(Integer []ar,int l,int m,int r){
        int n1=m-l+1;
        int n2=r-m;
        int [] left=new int[n1];
        int [] right=new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=ar[l+i];
        }
        for(int j=0;j<n2;j++){
            right[j]=ar[m+j+1];
        }
        int i=0,j=0,k=l;
        while(i<n1&&j<n2){
            if(left[i]<=right[j]){
                ar[k++]=left[i++];
            }
            else{
                ar[k++]=right[j++];
            }
        }
        while(i<n1){
            ar[k++]=left[i++];
        }
        while(j<n2){
            ar[k++]=right[j++];
        }

    }

    @Override
    public Integer[] call() throws Exception {

        return mergeSort(ar,l,r);
    }
}
