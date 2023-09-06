/*
this is the python --> java translation of the algorithm (if you can call it an algorithm)
used in https://github.com/whynotlol1/python-light-level-simulation/tree/main
 */


public class Main {
    public static void main(String[] args) {
        int[] BOUNDS = {250, 250};
        float[][] SurfaceArea = new float[BOUNDS[0]][BOUNDS[1]];
        int[] LightSourcePosition = {50, 50};
        float LightSourcePower = 0.0f;
        //I won't add the part where you change position, so light source speed is unneeded here

        float Radius1 = 100 * LightSourcePower;
        float Radius2 = 300 * LightSourcePower;
        float Radius3 = 500 * LightSourcePower;
        float Radius4 = 700 * LightSourcePower;

        for(int i = 0; i < SurfaceArea.length; i ++) {
            for(int j =0; j < SurfaceArea[0].length; j ++) {
                double Distance = Math.sqrt((i - LightSourcePosition[0]) ^ 2 + (LightSourcePosition[1]) ^ 2);
                if(Distance <= Radius1) {
                    SurfaceArea[i][j] = 1.0f;
                } else if(Radius2 >= Distance && Distance > Radius1) {
                    SurfaceArea[i][j] = 0.75f;
                } else if(Radius3 >= Distance && Distance > Radius2) {
                    SurfaceArea[i][j] = 0.5f;
                } else if(Radius4 >= Distance && Distance > Radius3) {
                    SurfaceArea[i][j] = 0.25f;
                } else {
                    SurfaceArea[i][j] = 0.0f;
                }
            }
        }
    }
}
