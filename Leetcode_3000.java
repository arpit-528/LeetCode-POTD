class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double currentdiag = 0;
        double maxdiag = 0;
        int area = 0;
        for(int i = 0; i<dimensions.length; i++) {
            currentdiag = Math.sqrt((double)dimensions[i][0] * dimensions[i][0] + (double)dimensions[i][1] * dimensions[i][1]); 
           // maxdiag = Math.max(maxdiag, currentdiag);
           if(maxdiag < currentdiag) {
            maxdiag = currentdiag;
            area = dimensions[i][0] * dimensions[i][1];
           } else if(currentdiag == maxdiag){
            area = Math.max(area, dimensions[i][0] * dimensions[i][1]);
           }

        }
      return area;
    }
}
