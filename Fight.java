
import java.util.Random;

public class Fight {
    public void ft(){
        Random r=new Random();
        int num=0;
        int num2=0;
        for (int i =1; i <6; i++) {

            if (r.nextDouble()< 0.7) {
                num++;
            }
            if(r.nextDouble()<0.65){
                num2++;
            }
            System.out.println("The score of the penalty shootout in the first round of " +i+ " is"+" "+num+":"+num2);
        }
        int limita=6;
        while (true){
            if(num2==num){
                limita++;
                for (int i =6; i <limita; i++) {
                    if (r.nextDouble()< 0.7) {
                        num++;
                    }
                    if(r.nextDouble()<0.65){
                        num2++;
                    }
                    System.out.println("The score of the penalty shootout in the first round of "+i+" is"+" "+num+":"+num2   );
                }
            }
        else{
            System.out.println("One team won, and that's the final record");
            break;
        }
        }
    }
}

