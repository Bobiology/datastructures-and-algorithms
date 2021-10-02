package codility;

public class BinaryString {
	public static void main(String[] args) {
		String S="0101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101010101";
		//S="1";
		System.out.println("INT: "+Integer.parseInt("5",10));
		//System.out.println(getCount(S));
	}
	static int getCounter(String S) {
		int decimal = Integer.parseInt(S,2);
		System.out.println("DECIMAL "+decimal);
		System.out.println("BINARY "+Integer.toBinaryString(decimal));
		System.out.println("BIT COUNT "+Integer.bitCount(decimal));
		System.out.println("HIGHEST ONE BIT "+Integer.highestOneBit(decimal));
		System.out.println("LOWEST ONE BIT "+Integer.lowestOneBit(decimal));

		int count=0;
		while(decimal !=0) {
			if(decimal %2==0) {
				decimal/=2;
			}else {
				decimal--;
			}
			count++;
		}
		return count;
		
	}
	
	static int getCount(String S) {
        int firstOccur = S.indexOf("1");
        return firstOccur == -1 ? 0 : S.replace("0", "").length()+ S.length() - firstOccur - 1;
	}

}
