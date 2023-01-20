public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int tabla = 10;
        for(int i =1; i<=tabla; i++){
            for(int j= 1; j<=tabla; j++){
                System.out.println(i +"x" + j + "=" + i*j);
                if(j==10){
                    System.out.println("\n");
                    
                }
            }
        }

    }
}