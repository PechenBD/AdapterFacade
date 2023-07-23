public class BinOps {
    public String sum(String a, String b) {
        int c = Integer.parseInt(a, 2);
        int d = Integer.parseInt(b, 2);
        int sum = c + d;
        String result = Integer.toBinaryString(sum);
        return result;
    }

    public String mult(String a, String b) {
        int c = Integer.parseInt(a, 2);
        int d = Integer.parseInt(b, 2);
        int mult = c * d;
        String result = Integer.toBinaryString(mult);
        return result;
    }
}
