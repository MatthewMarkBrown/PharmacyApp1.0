package ac.ca.cput;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class PharmacyApplication {
    private ServerSocket sSocket;
    private Socket client;
    private String i;

    public void run(){
        try{
            System.out.println("Awe");
            sSocket = new ServerSocket(1996, 10);

            client = sSocket.accept();

            ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(client.getInputStream());
            i = (String)in.readUTF();
            System.out.println(i);


        }catch(Exception e){
            System.out.println("Tsek");
        }
    }




    @Bean
public RestTemplate restTemplate() {
    return new RestTemplate();
}

    public static void main(String[] args) {
    SpringApplication.run(PharmacyApplication.class, args);

    PharmacyApplication phm = new PharmacyApplication();
    phm.run();
    }
}
