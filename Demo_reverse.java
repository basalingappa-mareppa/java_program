public class Demo_reverse {
    public static void main(String[]arg)
    {
        String str="Chinari";
        String ev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            ev=ev+str.charAt(i);
        }
        System.out.println(ev);
    }
}
