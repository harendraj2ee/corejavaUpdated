
public class StringReverse {

	public static void main(String[] args) {
		
//		String s="           harendra      kumar sah village saran bihar";
//		String str="";
//		int len = s.length();
//		for(int i=0; i<len; i++) {
//			char ch = s.charAt(i);
//			str=ch+str;
//		}
//		System.out.println("Reverse String >> "+str);
//		for (String removeSpace : str.split(" ")) {
//			System.out.print(removeSpace);
//		}
		String str = " 			#@@@abcde    fghijklmnopqrst uooiie               ellsfsfs fdsvwsaxyz";
		str=str.replaceAll(" ", "");
		System.out.println("strrrrr .>> "+str);
        String revStr = "";

        for(int i=0; i<str.length();i++){
        	char ch=str.charAt(i);
        	if(revStr.indexOf(ch)==-1) {
        		revStr =ch+revStr;
        	}
//            if(revStr.indexOf(str.charAt(i))==-1){
//                revStr = str.charAt(i)+revStr;
//            }
        }
        System.out.println(revStr);

	}

}
