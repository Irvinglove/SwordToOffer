import java.util.ArrayList; 
import java.util.Collections;
import java.util.Comparator; 
public class Solution {     
	static public String PrintMinNumber(int []numbers){
		int n;   
		String s="";
		ArrayList<Integer> list= new ArrayList<Integer>();
		n=numbers.length;  
		for(int i=0;i<n;i++){
			list.add(numbers[i]);       
		}
		//重写sort的compare函数，通过比较s1和s2的大小来决定str1和str2的顺序
		Collections.sort(list,new Comparator<Integer>(){
			public int compare(Integer str1,Integer str2){    
				String s1=str1+""+str2;    
				String s2=str2+""+str1;         
				return s1.compareTo(s2);
			}   
		});      
		for(int j:list){
			s+=j;
		}         
	 return s; 
	} 
	public static void main(String[] args) {
		/*int[] numbers = {3,32,321};
		System.out.println(PrintMinNumber(numbers));*/
		String s1 = "a";
		String s2 = "b";
		System.out.println(s1.compareTo(s2));
	}
}