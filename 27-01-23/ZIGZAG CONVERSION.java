//5)ZIGZAG CONVERSION 

//SOLUTION IN JAVA 

class Solution 
{
    public String convert(String s, int numRows)
    {
        if (numRows==1)
        {
            return s;
        } 
        int n=s.length();
        int parts=(int) Math.ceil(n / (2 * numRows - 2.0));
        int numCols=parts*(numRows-1);
        char[][] matrix=new char[numRows][numCols];
        for(char[] row: matrix)
        {
            Arrays.fill(row,' ');
        }
        int currRow=0; 
        int currCol=0;
        int csi=0;
        while(csi<n) 
        {
            while(currRow<numRows && csi<n)
            {
                matrix[currRow][currCol]=s.charAt(csi);
                currRow++;
                csi++;
            } 
            currRow-=2;
            currCol++;
            while (currRow>0 && currCol<numCols && csi<n)
            {
                matrix[currRow][currCol] = s.charAt(csi);
                currRow--;
                currCol++;
                csi++;
            }
        }     
        StringBuilder res=new StringBuilder();
        for(char[] row: matrix)
        {
            for(char character: row) {
                if(character!=' ') {
                    res.append(character);
                }
            }
        }      
        return res.toString();
    }
}
