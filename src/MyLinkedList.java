class MyLinkedlist {
 
    MyMapNode<String,Integer> head = null;

    public void Add(String s1){
        if(this.head == null){
           this.head = new MyMapNode<>(s1,1);
        }
        else{
            MyMapNode<String,Integer> temp = this.head;
            while(temp.next!=null && !temp.key.equals(s1)){
                temp = temp.next;
            }
            if(temp.key.equals(s1)){
                ++temp.value;
            }
            else{
                temp.next = new MyMapNode<>(s1,1);
            }

        }
    
    }

    public void Frequency(){
        MyMapNode<String,Integer> temp = this.head;
        while(temp!=null){
            System.out.println("Word is "+temp.key+" and Value is "+temp.value);
            temp=temp.next;
        }
    }
}
