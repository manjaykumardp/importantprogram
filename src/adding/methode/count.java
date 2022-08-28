package adding.methode;

public class count {
 boolean count0s1s(int[] arr){
   int count =0;
     for(int i=0;i< arr.length;i++) {

         if (arr[i] == 0) {
             count++;
         }

     }
             for(int i =0;i<count;i++) {
                 arr[i] = 0;

                 for ( int j = count; j < arr.length; j++) {
                     arr[j] = 1;

                     if (arr[i] == arr[j]){
                         return true;
                     }else {

                     }
                 }
             }
             return false;

}

    public static void main(String[] args) {
        int arr[]= {0,0,0,0,1,1,1,1};
        count c = new count();
        c.count0s1s(arr);
    }
}
