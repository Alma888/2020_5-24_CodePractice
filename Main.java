import java.util.Arrays;

//复制的效率System.arraycopy > clone > Arrays.copyOf > for循环。

public class Main {
    public static void main(String[] args) {
        int[] arr1={1,2,2,5};
        int[] arr2=new int[arr1.length];
        System.arraycopy(arr1,0,arr2,0,arr1.length); //方法一：数组复制速度最快

        //int[] arr2=Arrays.copyOf(arr1,arr1.length);   //方法二：

        //arr2=arr1.clone();  //方法三
        //for(int i=0;i<arr1.length;i++){ //方法四
        //    arr2[i]=arr1[i];
        //}
        System.out.println(Arrays.toString(arr2));
    }
}
