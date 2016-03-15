public class uniqueChars {
	
    public static void main(String []args) {
       System.out.println(isUniqueChars2("Hello") );
    }
    
    public static boolean isUniqueChars2(String str) {
		for(int i = 0; i < str.length(); i++){
			int val =  str.charAt(i) - 'a';
			
			for(int j = 0; j < str.length(); j++){
				if(val == str.charAt(i) - 'a'){
					return false;
				}
			}
		}
		return true;
	}
} 
