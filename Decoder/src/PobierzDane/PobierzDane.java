package PobierzDane;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class PobierzDane implements IPobierzDane {
    private URL url;
    private InputStream is = null;
    private BufferedReader br;
    private String line;

     public void pobierz(String link)

    {


        try {
            url = new URL(link);
            is = url.openStream();  // throws an IOException
            br = new BufferedReader(new InputStreamReader(is));

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (MalformedURLException mue) {
            mue.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            try {
                if (is != null) ((InputStream) is).close();
            } catch (IOException ioe) {
            }
        }
    }
    }

