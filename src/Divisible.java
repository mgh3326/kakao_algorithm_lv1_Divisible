import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Divisible {

    public int[] divisible(int[] array, int divisor) {//arry 사용
//        //ret에 array에 포함된 정수중, divisor로 나누어 떨어지는 숫자를 순서대로 넣으세요.
//        List<Integer> mList=new ArrayList<Integer>();
//        int num=0;
//        int j=0;
//        for(int i=0;i<array.length;i++)
//            if(array[i]%divisor ==0)
//                mList.add(array[i]);
//        int[] ret = convertIntegers(mList);
////        for(int i=0;i<array.length;i++)
////        {
////            if(array[i]%divisor ==0)
////                ret[j++]=array[i];
////        }
//
//        return ret;
        return Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();//한줄 풀이
    }
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        Divisible div = new Divisible();
        int[] array = {5, 9, 7, 10};
        System.out.println( Arrays.toString( div.divisible(array, 5) ));
    }
}