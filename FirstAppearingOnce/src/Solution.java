public class Solution
{     
    int[] hashtable=new int[256];
    StringBuffer s=new StringBuffer();
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        s.append(ch);
        if(hashtable[ch]==0)
            hashtable[ch]=1;
        else hashtable[ch]+=1;
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
      char[] str=s.toString().toCharArray();
      for(char c:str)
      {
          if(hashtable[c]==1)
              return c;
      }
      return '#';
    }
}