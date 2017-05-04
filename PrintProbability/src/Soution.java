import java.util.Arrays;

public class Soution {
	
	static int globalSize = 6;
	static public double[] PrintProbability(int num){
		//1、递归法 
		//@param original      总的色子数
		//@param current       当前处理的是第几个
		//@param sum           已经前面的色子数和
		//@param probabilities 不同色子数出现次数的计数数组
		//@param max           色子的最大值
		int maxNum = 6 * num;
		double total = Math.pow(globalSize, num);
		double[] appearCount = new double[maxNum - num + 1];
		Probability(appearCount, num);
		for(int i = num; i <= maxNum; i++){
			appearCount[i - num] = appearCount[i - num] / total;
		}
		return appearCount;
	}
	static public void Probability(double[] appearCount, int num){
		for(int i = 1; i <= globalSize; i++){
			Probability(appearCount, i, num, num);
		}
	}
	static public void Probability(double[] appearCount, int sum, int original, int cur){
		if(cur == 1){
			appearCount[sum - original]++;
		}else{
			for(int i = 1; i <= globalSize; i++){
				Probability(appearCount, sum + i, original, cur - 1);
			}
			
		}
	}
	static public double[] PrintProbability2(int num){
		int maxNum = 6 * num;
		int flag = 0;
		double total = Math.pow(globalSize, num);
		double[] appearCount0 = new double[maxNum + 1];
		double[] appearCount1 = new double[maxNum + 1];
		double[][] appearCount = new double[2][];
		appearCount[0] = appearCount0;
		appearCount[1] = appearCount1;
		for(int i = 1; i <= globalSize; i++){
			appearCount[flag][i] = 1;
		}
		for(int k = 2; k <= num; k++){
			for(int i = k; i <= k * globalSize;i++){
				for(int j = 1; j <= globalSize && j <= i; j++){
					appearCount[1 - flag][i] += appearCount[flag][i - j];
				}
			}
			flag = 1 - flag;
		}
		for(int i = num; i <= maxNum; i++){
			appearCount[flag][i] = appearCount[flag][i] / total;
		}
		return appearCount[flag];
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(PrintProbability(2)));
	}
}
