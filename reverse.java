class reverse {
    static void reversearray(int[] arr) {
        int left=0,right=arr.length-1;
        while(left<right) {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String[] arge) {
        int [] arr={1,3,5,7,9};
        reversearray(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}