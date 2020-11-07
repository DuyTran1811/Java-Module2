package day19StringRegex.TH1.BT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlDanTri {
    static String regex = "title=\"(.*?)\"";

    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuilder buffer = new StringBuilder();

            String content;
            while ((content = bufferedReader.readLine()) != null) {
                buffer.append(content);
            }
            content = buffer.toString();
            bufferedReader.close();

            content = content.replaceAll("\\n+", " ");
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(content);

            while (matcher.find()) {
                System.out.println(matcher.group(1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
