public class reverseString {
	
    public static void main(String []args) {
       System.out.println(reverse("hello"));
    }
    
    public static String reverse(String str) {
		char[] data = str.toCharArray();
		char temp; int len = str.length()-1; int i = 0;
		while(i < len){
			temp = data[i];
			data[i] = data[len];
			data[len] = temp;
			i++;
			len--;
		}
		String s = new String(data);
		return s;
	}
}
