class Date
{
    int month;
    int day;
    Date(int m, int d){
        this.month=m;
        this.day=d;
    }
    int daysInMonth(){
        if(month==1 || month==3 ||month==5 ||month==7 ||month==8 ||month==10 ||month==12){
            return 31;
        }else if(month==4 ||month==6 ||month==9 ||month==11){
            return 30;
        }else{
            return 28;
        }
    }
    int getDay(){
        return day;
    }
    int getMonth(){
        return month;
    }
    void nextDay(){
        if(month==1 || month==3 ||month==5 ||month==7 ||month==8 ||month==10){
            if(day == 31){
                day=1;
                month++;
            }else{
                day++;
            }
        }else if(month==12){
            if(day == 31){
                month=1;
                day=1;
            }else{
                day++;
            }
        }else if(month==4 ||month==6 ||month==9 ||month==11){
            if(day==30){
                month++;
                day=1;
            }else{
                day++;
            }
        }else if(month==2){
            if(day==28){
                month++;
                day=1;
            }else{
                day++;
            }
        }
    }
    @Override
    public String toString(){
        return month+"/"+day;
    }
    int absoluteDay(){
        int mm=1;
        int dd=0;
        while(mm < month){
            if(mm==2){
                dd+=28;
                mm++;
            }else if(mm==1||mm == 3||mm==5||mm==7||mm==8||mm==10||mm==12){
                dd+=31;
                mm++;
            }else if(mm==4||mm==6||mm==9||mm==11){
                dd+=30;
                mm++;
            }
        }
        dd+=day;
        return dd;
    }
}