package day02;

public class Ex08 {
    public static void main(String[] args) {
        Integer []lotto = new Integer[6];
        int j=0;

        while(j!=6) {
            lotto[j] = (int) (Math.random() * 45 + 1);
            for (int i = 0; i < j; i++) {
                if(lotto[j]==lotto[i]) {
                    lotto[j]=null;
                    j=j-1;
                }
            }
            j=j+1;
        }

            //    j=0 u=1
        int min;
        int count=0;
        int tmp=0;
        for(j=count;j<5;j++) {
            for (int i = j + 1; i < 6; i++) {
                if (lotto[j] > lotto[i]){
                   tmp = lotto[j];
                   lotto[j]=lotto[i];
                   lotto[i]=tmp;
                }

            }
        }
        for (int i = 0; i < j; i++) {
            System.out.println(lotto[i]);
        }
    }
}
