package codility;

public class NimGame {
	public static void main(String[] args) {
		int a=7;
		System.out.println(new NimGame().canWinNim(a));
	}
    public boolean canWinNim(int n) {
    	return n%4>0;  
    }
}
