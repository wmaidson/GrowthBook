public class OperadoresLogicos {

    public static void main(String[] args) {

        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r;
        boolean q;
        boolean s;
        boolean t;

        r = (x<y && y<z)?true:false;
        System.out.println(r);

        q = (x<y && y==z)?true:false;
        System.out.println(q);
        s = (x<y || y==z)?true:false;
        System.out.println(s);

        t = (x<y ^ y==z)?true:false;
        System.out.println(t);

    }
}
