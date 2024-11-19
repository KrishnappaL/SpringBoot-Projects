package interviewcoding;

import java.util.Arrays;

public class GuessStatisticsMessage {

	public static void main(String[] args) {
		GuessStatisticsMessage guess=new GuessStatisticsMessage();
		int[] g= {1,2,3};
		int[] s= {1,3};
		guess.findContentChildren(g,s);
	}
	
    public int findContentChildren(int[] g, int[] s) {
    	Arrays.sort(g);
    	Arrays.sort(s);
    	int max=0;
    	int cookieEndIndex=s.length-1;
    	int childGreedyEndIndex=g.length-1;
    	while(cookieEndIndex>0 && childGreedyEndIndex>0) {
    		if(s[cookieEndIndex]>=g[childGreedyEndIndex])
    			cookieEndIndex--;
    		max++;
    	}
    	childGreedyEndIndex--;
    	return max;
    }
}
