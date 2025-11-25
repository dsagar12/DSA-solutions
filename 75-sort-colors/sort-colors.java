class Solution {
    public void sortColors(int[] arr) {
        
        // int low=0,mid=0,high=arr.length-1;
        // while(mid<=high){
        //     if(arr[mid]==0){
        //         int temp=arr[mid];
        //         arr[mid]=arr[low];
        //         arr[low]=temp;
        //         low++;
        //         mid++;
        //     }else if(arr[mid]==1){
        //         mid++;
        //     }else{
        //         int temp=arr[mid];
        //         arr[mid]=arr[high];
        //         arr[high]=temp;
                
        //         high--;
        //     }
        // }
        int n=arr.length;
        int zero=0;
        int one=0;
        int two=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zero++;
            }else if(arr[i]==1){
                one++;
            }else{
                two++;
            }
        }
        int count=0;
       while(count<n){
            while(zero!=0){
                arr[count]=0;
                zero--;
                count++;
            }
            while(one!=0){
                arr[count]=1;
                one--;
                count++;
            }while(two!=0){
                arr[count]=2;
                two--;
                count++;
            }
       }
       
        
    }
}