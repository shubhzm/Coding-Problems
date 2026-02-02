package String;

public class ALternetMergeString {

	 public String mergeAlternately(String word1, String word2) {
	        char[] a1 = word1.toCharArray();
	        char[] a2 = word2.toCharArray();

	        StringBuilder s = new StringBuilder();
	        int n1 = a1.length;
	        int n2 = a2.length;
	        int n = Math.max(n1, n2);

	        // Loop over the max length
	        for (int i = 0; i < n; i++) {
	            if (i < n1) s.append(a1[i]);  // append from word1 if available
	            if (i < n2) s.append(a2[i]);  // append from word2 if available
	        }

	        return s.toString();
	    }
    public static void main(String[] args) {
 ALternetMergeString at=new ALternetMergeString();
    	String word1 = "abc";
        String word2 = "pqr";
        System.out.println(at.mergeAlternately(word1, word2));  // Output: "apbqcr"
    }
}
