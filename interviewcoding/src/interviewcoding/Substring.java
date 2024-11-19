package interviewcoding;

import java.util.ArrayList;
import java.util.List;

public class Substring {

	public static void main(String[] args) {
		String s="1010101";int k=2;
		countKConstraintSubstrings(s,k);
	}
	    public static int countKConstraintSubstrings(String s, int k) {
	        int count = 0;
	        int oneCount = 0;
	        int zeroCount = 0;
	        for (int right = 0, left = 0; right < s.length(); right++) {
	            char c = s.charAt(right);
	            if (c == '0') {
	                zeroCount++;
	            } else {
	                oneCount++;
	            }
	            while (zeroCount > k && oneCount > k) {   
	                if (s.charAt(left) == '0') {
	                    zeroCount--;
	                } else {
	                    oneCount--;
	                }
	                left++;
	            }
	            count += right - left + 1;
	        }
	        return count;
	    }
	}

