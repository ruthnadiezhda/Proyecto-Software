/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Email;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Labtel
 */
public class Email {

    private final String host = "smtp.gmail.com";
    private String user = "sorware.grupo1@gmail.com";
    private String pass = "grupo1.sorware";
    private String to;
    private InternetAddress[] address;
    
    public int sendEmail(String emailTo, String hash, String ipAdd, int localPort,String context) {
        try {
            // Propiedades
            Properties props = new Properties();
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", "587");

            //Nueva sesion con autenticador
            Authenticator autenticador = new Authenticator() {
                public PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(user, pass);
                }
            };

            //Sesion que le paso las propiedades
            Session mailSession = Session.getInstance(props, autenticador);

            //Crea mensaje y emisor
            MimeMessage msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(user));

            //Receptor, se toma de la llamada de la función 
            to = emailTo;
            address = new InternetAddress[]{new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);

            //Asunto y mensaje
            msg.setSubject("SOLICITUD DE RECUPERACIÓN DE CONTRASEÑA");
            msg.setText("Usted ha pedido recuperar su contraseña del Sistema Telecom para Semana de Ingeniería 2019 \n Ingrese a este link para actualizar su contraseña:"
                     + ipAdd + ":" + localPort + "/Grupo_1/ParticipanteServlet?accion=recuperar&hash=" + hash);
            
            

            //Enviar el correo electronico
            Transport transporte = mailSession.getTransport("smtp");
            transporte.connect(host, user, pass);
            transporte.sendMessage(msg, msg.getRecipients(Message.RecipientType.TO));
            transporte.close();


        } catch (AddressException ex) {
            Logger.getLogger(Email.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(Email.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
