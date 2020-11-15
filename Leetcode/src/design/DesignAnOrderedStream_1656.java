package design;

import java.util.ArrayList;
import java.util.List;

public class DesignAnOrderedStream_1656 {
	
	 private int ptr;
	    private String stream[];

	    public DesignAnOrderedStream_1656(int n) {
	        ptr = 0;
	        stream = new String[n];
	    }
	    
	    public List<String> insert(int id, String value) {
	        
	        stream[id-1] = value;
	        List<String> list = new ArrayList();
	        int i;
	        for(i=ptr; i<stream.length; i++){
	            if(stream[i]==null)break;
	            list.add(stream[i]);
	        }
	        ptr = i;
	        return list;
	        
	    }

}
