package orca.StrategySecond;

public class MRTStrategy implements IStrategy {
    @Override
    public int calculate(int km) {

//        小於十公里20元，超過每五公里五元

        int result = 0 ;

        if(km <= 0) return  result ;

        if(km <= 20) {
            result = 20 ;
        }

        if(km > 20){
            int count = (( km - 20 ) / 5 ) + 1 ;
            result = result * count ;
        }

        return result;

    }
}
