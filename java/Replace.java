public class Replace {
    public static void main(String[] args){
        String Sentence="my town is cool place and is a summer resort";
        // Sentence=Sentence.replaceAll("is","was");  //replace alloccurences
        Sentence=Sentence.replaceFirst("is","was");//replace only first occurence
        System.out.println(Sentence);
    }
    
}
