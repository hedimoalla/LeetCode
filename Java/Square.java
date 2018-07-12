public class Square {
    public static boolean isPerfectSquare(int num) {
        if (num <= 0) 
            return false;
        int lo = 1, hi = num;
        while (lo < hi) {
            int mid = lo + (hi-lo) / 2;
            if (num / mid > mid) lo = mid + 1;
            else hi = mid;
        }
        return lo * lo == num; 
    }
    public static void main(String[] args){
        int num = 16;
        System.out.println("Input for "+ num + " is "+ isPerfectSquare(num));
    }
}
/*
16
lo = 1
hi = 16

while 1 < 16
    int mid = 1 + (16-1)/2 = 8
    if (16/8 > 8)
        lo = mid + 1
    else
        hi = 8
    return 1*1 == 16

*/