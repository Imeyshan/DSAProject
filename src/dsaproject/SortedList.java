/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dsaproject;

/**
 *
 * @author Imeyshan
 */
public class SortedList {
    
    public static SortedList classObject;
    ListHouse[] theArray = null;
   
   
   
   
    public static SortedList getInstantOf() {
        if (classObject == null) {
            classObject = new SortedList();
            return classObject;
        } else {
            return classObject;
        }

    }

    private SortedList() {
        theArray = new ListHouse[5];
         HouseFile hf=new HouseFile();
        ListHouse[] ar = hf.Work_With_JSONReader();
       
             theArray=ar;
        
       
      }
    

    public void insert(ListHouse list) {
        for (int i = 0; i < theArray.length; i++) {
            if (theArray[i] == null) {

                theArray[i] = list;
               return;
            }

        }

       ListHouse[] newArray = new ListHouse[theArray.length * 2];

        for (int i = 0; i < theArray.length; ++i) {
            newArray[i] = theArray[i];
        }

        int tempsize = theArray.length;
        theArray = newArray;

        for (int i = tempsize; i < theArray.length; i++) {
            theArray[i] = list;

        }
        
      

    }
       
 
    
    
    public ListHouse [] find(int lotNumber)
    {
        for (ListHouse theArray1 : theArray) {
            if (theArray1 != null) {
                if (theArray1.getLotNumber() == lotNumber) {
                    return theArray;
                }
            }
        }
        return null;
    }
    
        
        
        
        
        
        public ListHouse[] bubbleSort(){
      
     
           ListHouse []templist=new ListHouse[theArray.length];
           
            for (int i = 0; i < templist.length; i++) {
                if (theArray[i]!=null) {
                     templist[i]=theArray[i].Copy();
                }
               
                
            }
           
         
		for(int i =templist.length - 1; i > 1; i--){

			
			for(int j = 0; j < i; j++){
				
                                  
                                
                            if (templist[j]!=null) {
                                
                            
			
                                         
                                      if(templist[j].compareTo(templist[j+1])==1){
					
			               
                                          ListHouse temp= templist[j];
                                          
                                         templist[j]=templist[j+1];
                                          templist[j+1]=temp;
									
					
				        }
                                      
                                     
                            }
                            }
				
			
			
		}
                
                return templist;
                
             
		
	}
	
	
	
        
        
        
        
        
        
        
        
        
        
    
        public void remove(ListHouse ListHouse)
        {
           
                for (int i = 0; i < theArray.length; i++) {
                    
                    if (theArray[i]!=null) {
                                         
                
                if (ListHouse.compareTo(theArray[i])==0) {
                    
                    theArray[i]=null;
                   
                    for (int j = i; j < theArray.length; j++) {
                         if (theArray[i]!=null) {
                             theArray[i]=theArray[i+1];                          
                             
                          }
                        
                          }
                    
                                        
                    }
                    
                    
                    
                }
                    
                }
            
            
        }
        
        
        
        public boolean isAvalbible(ListHouse list){
            
            
            for (int i = 0; i < theArray.length; i++) {
                
                if (theArray[i]!=null) {    
                
                if (list.compareTo(theArray[i])==0) {
                  return true;
                    
                } 
                }
                
            }
            
            return false;
            
        }
        
        
        
        

   
    

}

