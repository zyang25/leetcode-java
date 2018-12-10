package com.zyang25.code.stack;

public class L844BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
    	if(process(S).toString().equals(process(T).toString()))
    		return true;
    	
    	return false;
    }
    
    private StringBuilder process(String S) {
    	StringBuilder sb = new StringBuilder();
    	
    	for (Character c : S.toCharArray()) {
    		if(c == '#'){
                if( sb.length() > 0 )
				    sb.setLength(sb.length() - 1);
            }
			else
				sb.append(c);
		}
    	
    	return sb;
    }
    
    public static void main(String[] args) {
    	L844BackspaceStringCompare s = new L844BackspaceStringCompare();
    	System.out.println(s.backspaceCompare(new String("a#b"), new String("c#bccdsdafdsa")));
    }
}
