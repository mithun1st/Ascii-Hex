
package ascii.hex;


public class ahC {

    public String sfr(String s) {
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            if(!" ".equals(String.valueOf(s.charAt(i)))){
                t+=String.valueOf(s.charAt(i));
            }
        }
        if(t.length()%2!=0){
            t=t.substring(0,t.length()-1);
        }
        return t;
    }
    
    public String h2a(String s){
        int n=Integer.parseInt(s, 16);
        char c=(char)Integer.parseInt(String.valueOf(n));
        return String.valueOf(c);
    }
    
    public String a2h(String s){
        int n=(char)(s.charAt(0));
        return Integer.toHexString(n);
    }
    
    public String c2a(String s){
        char c=s.charAt(0);
        return String.valueOf((int)c);
    }
    
    public String a2c(String s){
        int n=Integer.parseInt(s);
        return (String.valueOf((char)n));
    }

}
