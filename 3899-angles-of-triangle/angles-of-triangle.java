class Solution {
    public double[] internalAngles(int[] sides) {
        double a=sides[0];
        double b=sides[1];
        double c=sides[2];

        if(a+b <=c || a+c <=b || b+c <=a){
            return new double[0];
        }
        double angleA=Math.toDegrees(Math.acos((b*b + c*c - a*a) / (2*b*c)));
        double angleB=Math.toDegrees(Math.acos((a*a + c*c - b*b) / (2*a*c)));
        double angleC=Math.toDegrees(Math.acos((a*a + b*b - c*c) / (2*a*b)));

        double[] result = new double[]{angleA,angleB,angleC};
        Arrays.sort(result);
        return result;
    }
}
