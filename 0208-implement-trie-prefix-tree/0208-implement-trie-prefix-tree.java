class Trie {
    Trie[] child=new Trie[26];
    Trie root;
    boolean end;
    public Trie() {
        root=this;
        for(int i=0;i<26;i++)
        child[i]=null;
        end=false;    
    }
    
    public void insert(String word) {
        Trie temp=root;
        int n=word.length();
        for(int i=0;i<n;i++){
            int idx=word.charAt(i)-'a';
            if(temp.child[idx]==null){
                temp.child[idx]=new Trie();
            }
            temp=temp.child[idx];
        }
        temp.end=true;
    }
    
    public boolean search(String word) {
        Trie temp=root;
        int n=word.length();
        boolean val=true;
        for(int i=0;i<n;i++){
            int idx=word.charAt(i)-'a';
            if(temp.child[idx]==null){
                val=false;
                break;
            }
            temp=temp.child[idx];
        }
        if(!temp.end)
        return false;
        return val;
    }
    
    public boolean startsWith(String prefix) {
        Trie temp=root;
        int n=prefix.length();
        boolean val=true;
        for(int i=0;i<n;i++){
            int idx=prefix.charAt(i)-'a';
            if(temp.child[idx]==null){
                val=false;
                break;
            }
            temp=temp.child[idx];
        }
        return val;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */