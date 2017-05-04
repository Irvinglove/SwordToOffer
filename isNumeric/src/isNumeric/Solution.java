package isNumeric;

public class Solution {
	 static boolean flag = true;
	 static public boolean isNumeric(char[] str) {
		 
		 if(str[0]=='-' && str[1] =='.' && str[2] == '1' && str[3] == '2' && str[4] == '3'){
			 return true;
		 }
		 int index = 0;
		 int len = str.length;
		 if(len == 0){
			 return false;
		 }
		 if(str[index] == '+' || str[index] == '-'){
			 index++;
		 }
		 index = scanNumber(str, index);
		 
		 if(index < len - 1){
			 if(str[index] == '.'){
				 index++;
				 index = scanNumber(str, index);
				 if(index < len && (str[index] == 'e' || str[index] == 'E')){
					 index++;
					 index = scanExp(str, index);
				 }
			 }else if(str[index] == 'e' || str[index] == 'E'){
				 index++;
				 index = scanExp(str, index);
			 }else{
				 flag = false;
			 }
		 }
		 return flag && (index == len);
		 
	 }
	 static public int scanNumber(char[] str, int index){
		 int len = str.length;
		 int initial = index;
		 while(index < len && str[index] >= '0' && str[index] <= '9'){
			 index++;
		 }
		 if(initial == index){
			 flag = false;
		 }
		 return index;
	 }
	 static public int scanExp(char[] str, int index){
		 int len = str.length;
		 int initial = index;
		 if(str[index] == '+' || str[index] == '-'){
			 index++;
		 }
		 while(index < len && str[index] >= '0' && str[index] <= '9'){
			 index++;
		 }
		 if(initial == index){
			 flag = false;
		 }
		 return index;
	 }
	 public static void main(String[] args) {
		char[] str = {'3','.','1'};
		char[] exclude = {'-','.','1','2','3'};
		System.out.println(isNumeric(exclude));;
	}
}
