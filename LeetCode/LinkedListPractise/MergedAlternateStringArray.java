package LinkedListPractise;
class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] char1=word1.toCharArray();
        char[] char2=word2.toCharArray();
        int n1 = char1.length;
        int n2 = char2.length;
        char[] res = new char[n1+n2];
        int i=0, j=0, k=0;
        while(i<n1 && j<n2){
            res[k++]=char1[i++];
            res[k++]=char2[j++];
        }
        while(i<n1){
            res[k++]=char1[i++];
        }
        while(j<n2){
            res[k++]=char2[j++];
        }

        //String merged =  new String(res);
        return new String(res);
    }
}


//these Programs wont run (no OG main()) its just copied n pasted from leetcode