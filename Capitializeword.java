public class Capitializeword {
    public static void main(String[] args) {
        String a="i love programming";
        String ans=convert(a);
        System.out.print(ans);
    }
    public static String convert(String str) {
            
		StringBuilder sb = new StringBuilder(str);

		boolean flag = true;
		for (int i = 0; i < sb.length(); i++) {
			if (flag == true && Character.isLowerCase(sb.charAt(i))) {
				sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
			}
			if (Character.isSpaceChar(sb.charAt(i))) {
				flag = true;
			} else {
				flag = false;
			}
		}

		return sb.toString();
	}
}
