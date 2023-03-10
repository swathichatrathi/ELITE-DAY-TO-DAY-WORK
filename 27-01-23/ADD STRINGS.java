//10)ADD STRINGS 

//SOLUTION IN JAVA 

class Solution
{
    public String addStrings(String num1, String num2)
    {
        int n1=num1.length()-1;
        int n2=num2.length()-1;
        int sum=0;
        StringBuilder res=new StringBuilder();
        while (n1>=0 || n2>=0 || sum>0)
        {
            if (n1>=0)
            {
                sum+=num1.charAt(n1)-'0';
                n1=n1-1;
            }
            if (n2>=0)
            {
                sum+=num2.charAt(n2)-'0';
                n2=n2-1;
            }
            res.append(sum%10);
            sum=sum/10;
        }
        return res.reverse().toString();
    }
}
