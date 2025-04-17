import java.util.HashMap;

public class PO1RansomNote {
    public static void main(String[] args) {

    }
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer>map=new HashMap<>();
        int count=0;
        for (int i = 0; i < magazine.length(); i++) {
            char c=magazine.charAt(i);
            if (map.containsKey(c)){

                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        for (int i = 0; i <ransomNote.length() ; i++) {
            char c=ransomNote.charAt(i);
            count=0;
            if (map.containsKey(c)&&map.get(c)>0){
                map.put(c,map.get(c)-1);
                count++;
            }else{
                return false;
            }
        }
        return true;
    }
}
