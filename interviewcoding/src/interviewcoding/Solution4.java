package interviewcoding;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution4 {
			public static void main(String[] args) {
				Solution4 s4=new Solution4();
				s4.countAndSay(4);
		}
			 public String countAndSay(int n) {
				  if(n == 1) return "1"; 
			        String prev = countAndSay(n - 1); 
			        StringBuilder str = new StringBuilder();
			        int i = 0;
			        while(i < prev.length()) {
			            char curr = prev.charAt(i);
			            int j = 0;
			            while(i+j < prev.length() && prev.charAt(i+j) == curr) j++;
			            str.append(j);
			            str.append(curr);
			            i += j;
			        }
			        return str.toString();
			    }
			
	}

