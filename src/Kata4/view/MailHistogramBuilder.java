/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kata4.view;

import Kata4.model.Histogram;
import Kata4.model.Mail;
import java.util.List;

/**
 *
 * @author ALberto del Rosario Déniz
 */
public class MailHistogramBuilder {
    public static Histogram<String> build(List<Mail> list){
        Histogram<String> histogram = new Histogram<>();
        list.forEach(email->{
            histogram.increment(email.getDomain());
        });
        return histogram;
    }
}
