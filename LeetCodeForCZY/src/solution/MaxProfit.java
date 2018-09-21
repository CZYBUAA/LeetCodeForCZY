package solution;

public class MaxProfit {
	public int maxProfit(int[] prices) {
		int[] indexArray=new int[prices.length];
		for(int i=0;i<prices.length;i++) {
			indexArray[i]=i;
		}
		//将数组排序,同时另一个数组记录原下标的信息
		for(int i=0;i<prices.length;i++) {
			int min=prices[i];
			int minIndex=i;
			for(int j=i+1;j<prices.length;j++) {
				if(prices[j]<min) {
					minIndex=j;
					min=prices[j];
				}
			}
			if(minIndex!=i) {
				int temp=prices[i];
				prices[i]=prices[minIndex];
				prices[minIndex]=temp;
				
				int tempIndex=indexArray[i];
				indexArray[i]=indexArray[minIndex];
				indexArray[minIndex]=tempIndex;
			}
		}
		
		for(int i=0;i<prices.length;i++) {
			System.out.print(indexArray[i]);
		}
		System.out.println();
		for(int i=0;i<prices.length;i++) {
			System.out.print(prices[i]);
		}
		
		//获取最佳结果
		int min=0;
		int max=prices.length-1;
		while(min<max) {
			if(indexArray[min]<indexArray[max])
				return prices[max]-prices[min];
			if(min!=max-1) {
				if(indexArray[min+1]<indexArray[max])
					return prices[max]-prices[min+1];
				if(indexArray[min]<indexArray[max-1])
					return prices[max-1]-prices[min];
			}
			max--;
			min++;
		}
		
        return 0;
    }
}
