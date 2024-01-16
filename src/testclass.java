
public class testclass implements aritmeticas{
    public static void main(String[] args){

        System.out.println(new testclass().suma(1, 6));
        System.out.println(new testclass().resta(1, 6));
        System.out.println(new testclass().multiplicacion(1, 6));
        System.out.println(new testclass().division(1, 6));
        
    }
    
    public int suma(int x,int y){
        return x + y;

    }
    
    public int resta(int x,int y){
        return x - y;

    }
    
    public int multiplicacion(int x,int y){
        return x * y;

    }
    
    public int division(int x,int y){
        return x / y;

    }
}

interface aritmeticas{
    
    public abstract int suma(int x, int y);
    
    public abstract int resta(int x, int y);

    public abstract int multiplicacion(int x, int y);
    
    public abstract int division(int x, int y);

}
