package sort;

public class es1 {
    public static void main(String[] args) {
        int[] arr ={7,3,6,4,5,9,6,2,1};
        ord1(arr);
        stampArr(arr);

    }

    public static void ord1(int[] arr){
        for(int j=0;j<arr.length-1;j++) {
            //设定第0项为最小值
            int minum = j;
            int min =arr[j];
            for (int i = j+1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    minum = i;
                }
            }
            int tmp = arr[j];
            arr[j] = min;
            arr[minum] = tmp;
        }
    }
    public static void stampArr(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
