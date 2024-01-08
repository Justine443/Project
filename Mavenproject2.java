/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.DataHandler;


/**
 *
 * @author ANDRE1
 */
public class Mavenproject2 {

    public static void main(String[] args) {


    /**
     * @param args the command line arguments
     */
   
       // Set the properties for the SMTP server
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.required", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        

        
        
        // Set the username and password for authentication
        String username = "kryzshelm@gmail.com";
        String password = "jrfa ndcb qsck focr";

        // Create a Session object with authentication
        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

         System.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        System.setProperty("javax.net.debug", "ssl");
        System.setProperty("mail.smtp.ssl.ciphers", "TLS_RSA_WITH_AES_128_CBC_SHA");
        
        try {
            // Create a MimeMessage object
            Message message = new MimeMessage(session);

            // Set the sender's and recipient's email addresses
            message.setFrom(new InternetAddress("kryzshelm@gmail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("justineandreimparong@gmail.com"));

            // Set the email subject and body
            message.setSubject("Hello?");
            message.setText("Hello.");

            // Send the email
            Transport.send(message);

            System.out.println("Email sent successfully!");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
       
        
    }
    }

