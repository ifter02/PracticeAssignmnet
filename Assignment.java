public class Assignment{
    public static void main(String args[]){
        double ac;
        double ti;
        double iv;
        double ip;
        double fp;

        ac = -9.81;
        ti = 10;
        iv = 0;
        ip = 0;
        fp = 0.5 * ac * Math.pow(ti,2) + iv * ti + iv;

        System.out.println("The position will now be: " +fp);

    }
}