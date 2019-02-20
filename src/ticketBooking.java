
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ochieng_Derrick
 */
public class ticketBooking {
    String name;
    int age;
    int origin_Zone;
    int dest_Zone;
    int no_of_days;
    double total_amount_paid;
    double discount ;
    double discountWeek = 0.1;
    double discountMonths = 0.4;
    double discountAge = 0.4;
    
    public ticketBooking(){}
    
    public ticketBooking(String name, int age, int origin_Zone, int dest_Zone, int no_of_days){
        this.name = name;
        this.age = age;
        this.origin_Zone = origin_Zone;
        this.dest_Zone = dest_Zone;
        this.no_of_days = no_of_days;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getOrigin(){
        return this.origin_Zone;
    }
    
    public void setOrigin(int origin_Zone){
        this.origin_Zone = origin_Zone;
    }
    
    public int getDestination(){
        return this.dest_Zone;
    }
    
    public void setDestination(int dest_Zone){
        this.dest_Zone = dest_Zone;
    }
    
    public int getDays(){
        return this.no_of_days;
    }
    
    public void setDays(int no_of_days){
        this.no_of_days = no_of_days;
    }
    
    public double getAmount(){
        if(getOrigin()==1 && getDestination()==2 || getOrigin()== 2 
                && getDestination()==1){
            if(getAge()>0 && getAge()<=10 || getAge()>50){
                if(getDays()>=7 && getDays()<60){
                   total_amount_paid = (200-(discountWeek*200)-(discountAge*200))
                           *getDays();
                }else if(getDays()>=60){
                   total_amount_paid = (200-(discountWeek*200)
                           -(discountMonths*200)-(discountAge*200))*getDays();
                }else{
                   total_amount_paid = (200.0-(discountAge*200))*getDays(); 
                } 
            }else{
                if(getDays()>7 && getDays()<60){
                   total_amount_paid = (200-(discountWeek*200))*getDays();
                }else if(getDays()>=60){
                   total_amount_paid = (200-(discountWeek*200)
                           -(discountMonths*200))*getDays();
                }else{
                   total_amount_paid = 200.0*getDays(); 
                }
            }
        }else if(getOrigin()==1 && getDestination()==3 || getOrigin()== 3 
                && getDestination()==1){
           if(getAge()>0 && getAge()<=10 || getAge()>=50){
               if(getDays()>=7 && getDays()<60){
                 total_amount_paid = (250-(discountWeek*250)-(discountAge*250))
                         *getDays();
               }else if(getDays()>=60){
                 total_amount_paid = (250-(discountWeek*250)-(discountWeek*250)
                         -(discountAge*250))*getDays();
               }else{
                 total_amount_paid = 250.0-(discountAge*100)*getDays(); 
           } 
           }else{
               if(getDays()>=7 && getDays()<60){
                 total_amount_paid = (250-(discountWeek*250))*getDays();
               }else if(getDays()>=60){
                 total_amount_paid = (250-(discountWeek*250)-(0.4*250)
                         -(0.4*250))*getDays();
               }else{
                 total_amount_paid = 250.0*getDays(); 
           }
           }
        }else if(getOrigin()==2 && getDestination()==3 || getOrigin()== 3 
                && getDestination()==2){
            if(getAge()>0 && getAge()<=10 || getAge()>=50){
               if(getDays()>=7 && getDays()<60){
                 total_amount_paid = (450-(discountWeek*450)-(discountAge*450))
                         *getDays();
               }else if(getDays()>=60){
                 total_amount_paid = (450-(discountWeek*450)-(discountAge*450)-
                         (discountMonths*450))*getDays();
               }else{
                 total_amount_paid = 450.0*getDays(); 
           } 
           }else{
               if(getDays()>=7 && getDays()<60){
                 total_amount_paid = (450-(discountWeek*450))*getDays();
               }else if(getDays()>=60){
                 total_amount_paid = (450-(discountWeek*450)
                         -(discountMonths*450))*getDays();
               }else{
                 total_amount_paid = 450.0*getDays(); 
           } 
           }
        }
        return this.total_amount_paid;
    }
    
    public double getDiscount(){
        if(getOrigin()==1 && getDestination()==2 || getOrigin()== 2 
                && getDestination()==1){
            if(getAge()>0 && getAge()<=10 || getAge()>50){
                if(getDays()>=7 && getDays()<60){
                   discount = (discountWeek+discountMonths)*100;
                }else if(getDays()>=60){
                   discount = (discountWeek+discountMonths+discountAge)*100;
                }else{
                   discount = discountAge*100;
                } 
            }else{
                if(getDays()>7 && getDays()<60){
                   
                   discount = discountWeek;
                }else if(getDays()>=60){
                   
                   discount = discountWeek+discountMonths;
                }else{
                   
                   discount = 0;
                }
            }
        }else if(getOrigin()==1 && getDestination()==3 || getOrigin()== 3 
                && getDestination()==1){
           if(getAge()>0 && getAge()<=10 || getAge()>=50){
               if(getDays()>=7 && getDays()<60){
                 
                 discount = (discountWeek+discountAge)*100;
               }else if(getDays()>=60){
               
                 discount = (discountWeek+discountMonths+discountAge)*100;
               }else{
                 
                 discount = discountAge*100;
           } 
           }else{
               if(getDays()>=7 && getDays()<60){
                 total_amount_paid = (250-(discountWeek*250)-(0.4*250))*getDays();
                 discount = (discountWeek+discountAge)*100;
               }else if(getDays()>=60){
                 
                 discount = (discountWeek+discountMonths+discountAge)*100;
               }else{
                 discount=0;
           }
           }
        }else if(getOrigin()==2 && getDestination()==3 || getOrigin()== 3 
                && getDestination()==2){
            if(getAge()>0 && getAge()<=10 || getAge()>=50){
               if(getDays()>=7 && getDays()<60){
                 
                 discount = (discountWeek+discountAge)*100;
               }else if(getDays()>=60){
                 
                 discount = (discountWeek+discountMonths+discountAge)*100;
               }else{
                 discount=(discountAge)*100;
                 
           } 
           }else{
               if(getDays()>=7 && getDays()<60){
                 
                 discount = (discountWeek)*100;
               }else if(getDays()>=60){
                 total_amount_paid = (450-(discountWeek*450)-(0.4*450))*getDays();
                 discount = (discountWeek+discountMonths)*100;
               }else{
                 discount = 0; 
           } 
           }
        }
        return this.discount;
    }
    
 public void generateTicket(){
     
     JOptionPane.showMessageDialog(null, "*******NEW WAVE BUSES PREPAID TICKET*******" +
             "\n"  + "Passenger Name: " + getName() + "\n" +
             "\nTicket Valid For: " + getDays() + "\n" + "\nTotal Amount Paid: " +
             getAmount() + "\n" + "\nDiscount Received: " + getDiscount() + "%" + "\n"
              + "\nThanks for Shopping with us!");
 }
}
