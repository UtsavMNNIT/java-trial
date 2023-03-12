package Array;

class Calc{
    int add(int arr[]){
        int result=0;
        for(int n:arr){
            result=result+n;
        }
        return result;
    }
}


public class additionarray{
public static void main(String[] args) 
{
    int arr[]={1,2,3,4,5,6};
    Calc obj= new Calc();
    int answer=obj.add(arr);
    System.out.println(answer);
    
} 

}












