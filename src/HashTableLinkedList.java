public class HashTableLinkedList {
    public static void main(String[] args) {
        String s1 = "To be or not to be";

        String s2 = s1.toLowerCase();
        String[] s3 = s2.split("\\s+");


        MyLinkedlist Hashlist = new MyLinkedlist();
    
        for (String word:s3){
            Hashlist.Add(word);
        }
        Hashlist.Frequency();
    
    }
}
