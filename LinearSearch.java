public class LinearSearch {
    public static int search(int[] num,int ele){
        for (int i = 0; i < num.length; i++) {
            if(num[i]==ele)
                return i;

        }
        return -1;

    }
    public static void main(String[] args) {
        int[] num = {0, 1, 10, 3, 12};
        System.out.println(search(num,10));
    }
}
