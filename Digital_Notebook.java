/*Create an application which allows users to input events on a calendar. This is represented by 
 a 5x7 2D array of strings. Due to the fact that the number of days in each month is slightly different
 and that there are less than 35 days in a month, we know that some of our elements are going to be empty.
  We want our application to do a few things:

        Detect which days of which weeks have something planned and alert us about the event.
        Count the number of events for each week
        Count the number of events for each day */


public class Digital_Notebook{
    
    public static void main(String [] args){
        
        String [][] calender={  
            {"Volunteer",null,"Doctor Appointnment",null,null,"visit store",null},
            {null,"Doctor appointment",null,null,null,"visit store","job fair"},
            {"Exam-1",null,"Doctor Appointnment",null,null,"visit store",null},
            {null,"volunteer","Doctor Appointnment",null,null,null,null},
            {"Exam-2",null,"Doctor Appointnment",null,null,"visit store","job fair"},

        };

        //Count the number of events for each week

        int countEvents=0;
        for(int i=0;i<calender.length;i++){

            
            for(int j=0;j<calender[i].length;j++){
                String events=calender[i][j];
                
                
                if(events!=null && !events.equals("")){
                    System.out.println("week : " +(i+1) +" ,  Day : " +(j+1) + " ,  Events : " +events);
                    countEvents++;

                }  
             
                
            }
            System.out.println("total event for  week " + (i+1)+" : " +countEvents);

        }

        //Count the number of events for each day

        String [] days={"Sunday","Monday","Tuesday","Wednesday","Thrusday","Friday","Saturday"};

        int numOfEventPerDay=0;
        for(int i=0;i<calender[0].length;i++){
            for(int j=0;j<calender.length;j++){
                String dayEvents=calender[j][i];
                if(dayEvents !=null && !dayEvents.equals("dayEvents")){
                    numOfEventPerDay++;
                }
            }
            //whithout weekends[Sunday and Saturday]
            if (i!=0 && i!=6){
            
                System.out.println("Number of events per day: "+ days[i]+ "  " + numOfEventPerDay);
            }
            

            
            
            
            }
            
        }

        

    }
