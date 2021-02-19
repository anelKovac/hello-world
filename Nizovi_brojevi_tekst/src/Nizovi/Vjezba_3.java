package Nizovi;

/**
 * Izlistavanje svih elemenata niza koristeci while pelju
 */
class Vjezba_3 {
    public static void main(String[] args) {
        int[] arr = {1,2, 3, 4, 5, 6, 7, 8, 9, 10};

        int x = 0;
        while(x < arr.length){
            System.out.println(arr[x]);
            x++;
        }
    }
}
