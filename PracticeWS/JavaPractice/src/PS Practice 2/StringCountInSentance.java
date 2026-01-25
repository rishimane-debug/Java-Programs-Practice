package JavaPrograms;
import java.util.HashMap;
import java.util.Map;

public class StringCountInSentance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Java python Java python selenium Java";
		  String words[] = input.split(" ");
//		  for(String word : words)
//		  {
//			  System.out.print(word);
//		  }
		  
		  HashMap<String, Integer> wordMap = new HashMap<String, Integer>();
		  for(String word : words )
		  {
			  if(wordMap.containsKey(word))
			  {
				wordMap.put(word, wordMap.get(word)+1);  
			  }
			  else
			  {
				  wordMap.put(word, 1);
			  }
		  }
		  System.out.println(wordMap);
		  
		  
		  	for(Map.Entry<String,Integer> entry : wordMap.entrySet())
		  	{
		  		System.out.println(entry.getKey() + ":" + entry.getValue());
		  	}
		
	}

}
