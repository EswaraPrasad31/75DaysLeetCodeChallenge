class WordDictionary {

    class Trie{
        Trie[] child=new Trie[26];
        boolean isEnd=false;
    }
    private Trie root;

    public WordDictionary() {
        root=new Trie();    
    }
    
    public void addWord(String word) {
        Trie node=root;
        for(char c:word.toCharArray()){
            int index=c-'a';
            if(node.child[index]==null){
                node.child[index]=new Trie();
            }
            node=node.child[index];
        }
        node.isEnd=true;
    }
    
    public boolean dfs(String word,int i,Trie node){
        if(node==null)
        return false;
        if(i==word.length()){
            return node.isEnd;
        }
        char c=word.charAt(i);
        if(c!='.'){
            return dfs(word,i+1,node.child[c-'a']);
        }
        for(int j=0;j<26;j++){
            if(node.child[j]!=null){
                if(dfs(word,i+1,node.child[j])){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean search(String word) {
        return dfs(word,0,root);
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */