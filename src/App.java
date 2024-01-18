public class App {
    public static void main(String[] args) throws Exception {
        String s = args[0];
        char[] c = s.toCharArray();
        for(int i=s.length();i>0;i--){
            System.out.print(c[i-1]);
        }
    }
}
