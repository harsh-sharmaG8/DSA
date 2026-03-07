package Date_22_feb;

public class most_water {
    public static int maxArea(int[] height) {
        int s=0;
        int n=height.length-1;
        int e=n;
        int area=0;
        while(s<e){
            int heightof= Math.min(height[s],height[e]);
            int distance= e-s;
            int curnt_area=heightof*distance;
            area= Math.max(curnt_area, area);
            if(height[s]<height[e]){
                s++;
            }
            else{
                e--;
            }
        }
        return area;
    }

    public static void main(String[] args) {
        int arr[] ={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
}

