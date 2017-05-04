import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
public class Solution {
    
	static public void Permutation(char[] str,int j)  
	{  int len = str.length;
	    if(j == len)  
	        System.out.println(str); 
	    else  
	    {  
	        for(int i = j; i < len; i++)  
	        {  
	        	char temp = str[i];
	            str[i] = str[j];
	            str[j] = temp;
	        	
	            Permutation(str, j+1);
	            
	            char temp2 = str[i];
	            str[i] = str[j];
	            str[j] = temp2;
	            
	              
	        }  
	    }  
	}  
	  

    public static void main(String[] args) {
		char[] str = {'a','a','c'};
		Permutation(str,0);
	}
}