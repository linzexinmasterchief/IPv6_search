import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;


public class Start {
    public static void main(String[] args) {
        System.out.println("Hello");
        String target_ip = "2aaa:0600:1000:1234:5678:abcd:0123:4321";
        LinkedList<String> ipv6_list = read_csv();
        System.out.println(ipv6_list.get(1));
    }

    public static LinkedList<String> read_csv() {
        LinkedList<String> ipv6_list = new LinkedList<String>();
        try {
            BufferedReader in = new BufferedReader(new FileReader("C:/Users/webDrag0n/Downloads/ipv6_all.csv"));
            String str;
            while ((str = in.readLine()) != null) {
                ipv6_list.add(str);
            }
        } catch (IOException e) {
        }
        return ipv6_list;
    }

    public static int compare(String IPv6_1, String IPv6_2) {
        // TODO: output 1 for IPv6_1 > IPv6_2, -1 for IPv6_1 < IPv6_2, 0 for IPv6_1 = IPv6_2
        return 0;
    }
}
