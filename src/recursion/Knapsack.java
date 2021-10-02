package recursion;

class Knapsack {

	  public int solveKnapsack(int[] profits, int[] weights, int capacity) {
	    // TODO: Write your code here
	    int maxProfit=0;
	    int curr=weights[0];
	    int profitOne=profits[0];
	    for(int i=1; i<weights.length;i++){
	      if(curr+weights[i]<capacity){
	    	  maxProfit+=profits[i];
	        System.out.println("Profit = "+profits[i]+profitOne+" : Weights = "+weights[i]+curr);
	      }else{
	        curr=weights[i];
	        profitOne=profits[i];
	      }

	    }
	    return maxProfit;
	  }

	  public static void main(String[] args) {
	    Knapsack ks = new Knapsack();
	    int[] profits = {1, 6, 10, 16};
	    int[] weights = {1, 2, 3, 5};
	    int maxProfit = ks.solveKnapsack(profits, weights, 7);
	    System.out.println("Total knapsack profit ---> " + maxProfit);
	    maxProfit = ks.solveKnapsack(profits, weights, 6);
	    System.out.println("Total knapsack profit ---> " + maxProfit);
	  }
	}
