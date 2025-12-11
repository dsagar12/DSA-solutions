class Solution {
    private int findIndex(int[] d, int target) {
    int left = 0, right = d.length - 1;
    int ans = -1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (d[mid] <= target) {
            ans = mid;       
            left = mid + 1;  
        } else {
            right = mid - 1;
        }
    }

    return ans;  
}

    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n=profit.length;
        Integer[] arr=new Integer[n];
        for(int i=0;i<n;i++){
            arr[i]=i;
        }
        Arrays.sort(arr,(a,b)->difficulty[a]-difficulty[b]);
        int[] p=new int[n];
        int[] d=new int[n];
        for(int i=0;i<n;i++){
            p[i]=profit[arr[i]];
            d[i]=difficulty[arr[i]];
        }
        arr[0]=p[0];
        int max=p[0];
        for(int i=1;i<n;i++){
            max=Math.max(max,p[i]);
            arr[i]=max;
        }
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(d[i],i);
        }
        int profits=0;
        int m=worker.length;
       
       for (int i = 0; i < m; i++) {
    int idx = findIndex(d, worker[i]);  
    if (idx != -1) {
        profits += arr[idx];   
    }
}

        return profits;


    }
}