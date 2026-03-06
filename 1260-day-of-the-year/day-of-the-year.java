class Solution {
    public int dayOfYear(String date) {
        int numberOfDays = 0;
        int [] monthDays = {0,31,28,31,30,31,30,31,31,30,31,30,31};

        int year = Integer.parseInt(date.substring(0,4));
        int month = Integer.parseInt(date.substring(5,7));
        int dateCon = Integer.parseInt(date.substring(8,10));

        if(!isLeapYear(year)){
            if(month == 1){
                return dateCon;
            }else{
                for(int i=1;i<month;i++){
                    numberOfDays = numberOfDays + monthDays[i] ;
                }
            }

        }else{
              if(month == 1){
                return dateCon;
            }else{
                for(int i=1;i<month;i++){
                    numberOfDays = numberOfDays + monthDays[i]  ;
                }
                if(month >2){
                numberOfDays = numberOfDays+1;
                }
            }

        }
        return numberOfDays + dateCon;
    }
    private boolean isLeapYear(int year){
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            return true;
        }
        return false;
    }
}