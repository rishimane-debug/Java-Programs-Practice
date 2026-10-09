// Online Java Compiler (Editor)
// Write and run Java online using this editor.
import java.util.*;

class Main {

    public static List<Boolean> validateIPAddress(String[] ips)
    {
        List<Boolean> result = new ArrayList<>();
        if(ips == null)
        {
            result.add(false);
            return result;
        }

        for(String ip : ips)
            {
                if(ip == null){
                result.add(false);
                continue;
            }

        String[] splitIp = ip.split("\\.", -1);
            if(splitIp.length != 4)
            {
                result.add(false);
                continue;
            }
        boolean isValid = true;
        for(String segment : splitIp)
            {
                if(!segment.matches("\\d+") || segment.length() > 3)
                {
                    isValid = false;
                    break;
                }
                int num = Integer.parseInt(segment);
                if(num < 0 || num > 255 || (segment.length() > 1 && segment.charAt(0) == '0'))
                {
                    isValid = false;
                    break;
                }
                
            }
        result.add(isValid);
    }
        return result;
    }
    public static void main(String[] args) {
        String[] ips = {
    "192.168.1.1",       
    "0.0.0.0",           
    "255.255.255.255",   
    "256.1.1.1",         
    "192..1.1",          
    "192.168.01.1",      
    "192.168.a.1",       
    "192.168.1.",        
    null                 
};
         System.out.println(validateIPAddress(ips));   
    }
}
