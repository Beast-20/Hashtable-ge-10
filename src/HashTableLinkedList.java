public class HashTableLinkedList {
    public static void main(String[] args) {
        String s1 = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

        String s2 = s1.toLowerCase();
        String[] s3 = s2.split("\\s+");


        MyLinkedlist Hashlist = new MyLinkedlist();
    
        for (String word:s3){
            Hashlist.Add(word);
        }
        
        Hashlist.Frequency();
        Hashlist.remove("avoidable");
        Hashlist.Frequency();
    
    }
}
