class Solution {
    public boolean lemonadeChange(int[] bills) {
        int coinOf5 = 0;
        int coinOf10 = 0;
        for(int bill: bills){
            if(bill == 5)
            coinOf5++;
            else if(bill == 10){
                if(coinOf5>0){
                    coinOf10++;
                coinOf5--;

                }else{
                    return false;
                }
            }else{
                if(coinOf10>0 && coinOf5>0){
                    coinOf10--;
                    coinOf5--;
                }else{
                    if(coinOf5>=3){
                       coinOf5-=3; 
                    }else{
                        return false;
                    }
                }
            }

        }
        return true; 
    }
}