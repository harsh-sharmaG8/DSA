package Date_21_feb;

public class sell_buy_stock {
    public static int maxProfit(int[] arr) {
        int min=arr[0]; //like hum ne start me min yhi tha isi se kha ri da arr[0]
        int profit=0;
        for(int i=1; i< arr.length; i++){
            int cost= arr[i]- min;
            profit= Math.max(cost,profit);
            min = Math.min(min, arr[i]);


        }
        return profit;

    }

    public static void main(String[] args) {
        int[] arr ={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));

    }
}

