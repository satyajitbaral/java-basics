package common;

import java.util.Arrays;

public class LuckyNumber {


    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};

        int result[] = new int[arr.length];
        boolean shouldProcced = true;

        int pointer = 2;
        int remainingSize = arr.length;
        System.out.println(Arrays.toString(arr));



        while(shouldProcced){
            int j=0;

            if(remainingSize >= pointer){
                result = new int[remainingSize - remainingSize/pointer];


                for(int i = 1;i<=remainingSize;i++){
                    if(i % pointer != 0){
                        result[j++] = arr[i-1]; //started the loop from 1
                    }
                }
                System.out.println("------"+pointer+"-----");
                System.out.println(Arrays.toString(result));
                pointer++;
                arr = result;
                remainingSize = result.length;
            }else{
                shouldProcced = false;
            }
        }

        System.out.println(Arrays.toString(result));







    }


}
