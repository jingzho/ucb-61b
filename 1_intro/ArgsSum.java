public class ArgsSum {
  public static void main(String[] args) {
    int n = args.length;
    int sum = 0;
    for (int i = 0; i<n; i += 1) {
      sum = sum + Integer.parseInt(args[i]);
    }
    System.out.println(sum);
  }
}