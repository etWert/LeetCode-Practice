class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<Character>();
        char c;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='(')
                st.push(s.charAt(i));
            else if(s.charAt(i)=='}'||s.charAt(i)==']'||s.charAt(i)==')')
            {
                if(st.isEmpty())
                    return false;
                c=st.pop();
                System.out.println(c);
                if(c=='{'&&s.charAt(i)!='}'||c=='['&&s.charAt(i)!=']'||c=='('&&s.charAt(i)!=')')
            {             
                   System.out.println(i);
                    return false;
            }
            }
        }
        return st.isEmpty();
    }
}