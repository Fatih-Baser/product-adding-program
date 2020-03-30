
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile razy chcesz uruchomić pętlę?");
        int n = scanner.nextInt();
        Product[] produkty = new Product[n];
        ArrayList<String> oldSentences = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("test1.txt"));
        String s = "";
        while ((s = br.readLine()) != null) {
            System.out.println(s);
            oldSentences.add(s);
        }

        for (int i = 0; i < n; i++) {
            produkty[i] = new Product();
            String f;

            System.out.println("Prosze napisać produkt =");
            f = scanner.next();
            produkty[i].setProdukt(f);
            System.out.print("prosze napisać marka =");
            f = scanner.next();
            produkty[i].setMarka(f);
            System.out.println("Prosze napisać waga =");
            f = scanner.next();
            produkty[i].setWaga(f);
            System.out.println("Prosze napisać ceny = ");
            f = scanner.next();
            produkty[i].setCena(f);
            System.out.println("Prosze napisać kawałek= ");
            
            f = scanner.next();
            produkty[i].setKawałek(f);
        }
        try ( Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("test1.txt"), "utf-8"))) {
            for (String sentence : oldSentences) {
                writer.write(sentence + '\n');

            }
            for (Product produkt : produkty) {
                writer.write(produkt.toString() + '\n');

            }
        }
         
          }
    }


