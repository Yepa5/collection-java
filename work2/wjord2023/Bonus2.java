import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bonus2 {
    public static boolean isValidEmail(String email){
        // 好像邮箱格式比较丰富可以含有*&之类的（查的邮箱格式），但我还是按照我见过的邮箱写正则
        String emailRE = "^[a-zA-Z]{1,2}[a-zA-Z0-9]{3,9}+@[a-zA-Z0-9]{2,7}+" +
                //匹配@前面应该只有数字和字母
                "(?:\\.[a-zA-Z0-9]+)*(?:\\.[a-zA-Z]{2,3})$";
                // 匹配@后面应该为数字和字母也可以有多个点号（我见过有多个点号的邮箱比如福州大学的学生邮箱）
                // 匹配2到3个大小写字母，表示域名，如cn、com、org、net等(不过我好像只见过.com的)

        Pattern pattern = Pattern.compile(emailRE);

        Matcher matcher = pattern.matcher(email);

        return matcher.matches();

    }

    public static void main(String[] args) {
        // 测试邮箱格式
        String email1 = "test@example.com";
        String email2 = "invalid.email@.com";
        String email3 = "jsu701789@gmail.com";
        String email4 = "&@qq.com";
        String email5 = "2023@icloud.coma";
        String email6 = "test2023@qq.coma";
        String email7 = "test2023@fzu.ed.cn";

        System.out.println(email1 + " is valid: " + isValidEmail(email1));
        System.out.println(email2 + " is valid: " + isValidEmail(email2));
        System.out.println(email3 + " is valid: " + isValidEmail(email3));
        System.out.println(email4 + " is valid: " + isValidEmail(email4));
        System.out.println(email5 + " is valid: " + isValidEmail(email5));
        System.out.println(email6 + " is valid: " + isValidEmail(email6));
        System.out.println(email7 + " is valid: " + isValidEmail(email7));
    }
}
