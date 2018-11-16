package orca.Strategy;

public class pow implements IStrategy {
    @Override
    public int caculate(int a, int b) {
        if(b == 0){
            return 1;
        }else if(b == 1){
            return a;
        }else if(b > 1){

            int result = 1 ;

            for(int i = 0 ; i < b ; i ++){
                result = result * a ;
            }

            return result;

        }else if ( b == -1) {
            return -a;

        }else {

            int result = 1 ;

            for(int i = 0 ; i > b ; i --){
                result = result * a ;
            }

            return 1 / result ;

        }
    }
}
