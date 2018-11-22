package Kata4.main;

import Kata4.model.Histogram;
import Kata4.model.Mail;
import Kata4.view.HistogramDisplay;
import Kata4.view.MailHistogramBuilder;
import Kata4.view.MailListReader;
import java.util.List;

public class KATA4 {
    
    private List<Mail> mailList;
    private Histogram<String> histogram;
    
    public static void main(String[] args) {
        KATA4 kata = new KATA4();
        kata.control();
    }
    private void control(){
        input();
        process();
        output();
    }
    
    private void input(){
        MailListReader reader = new MailListReader("emails.txt");
        mailList = reader.read();
    }
    
    private void process(){
        histogram = MailHistogramBuilder.build(mailList);
    }
    
    private void output(){
        new HistogramDisplay(histogram).execute();
    }
}
