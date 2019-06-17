
package noduparrayapp;


public class NoDupArrayApp {

  
    public static void main(String[] args) {
         NoDupArray x=new NoDupArray(10);
         
    x.insert(37);
    x.insert(12);
    x.insert(13);
    x.display();
      
        
    
    }
    
}

class NoDupArray {

    private long[] a;//ref to array a
    private int nElems; //number of data items
    
    public NoDupArray(int max){
    this.a=new long[max];
    this.nElems=0;
    }
    
    public boolean find(long searchKey){
        for(int i=0;i<this.nElems;i++){
           if(this.a[i]==searchKey){
        return true;}
            }
        return false;
        }
    
    public void insert(long value){
        
        if(a.length==nElems){
        System.out.println("Array full");
        }
        if(find(value)){
            System.out.println("value already exist");
          
            
        }
        else{
            this.a[this.nElems++]= value;
            nElems++;
            //nElems++;
            System.out.println("Value Inserted");
             }
         }
    public boolean delete(long value){
        for(int i=0;i<nElems;i++){
            if(a[i]==value){
                for(int j=i;j<nElems-1;j++){
                    a[j]=a[j+1];
                }
                nElems--;
                System.out.println("value deleted");
                return true;
            }
            
        }
        System.out.println("Value deleted");
                return false;
       
         }
    
    public void display(){
        for(int i=0;i<nElems;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println(" ");
    }
    
    }
    

