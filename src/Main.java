import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap();
        String key = "abc";
        System.out.println(key.hashCode());
        System.out.println(hash(key));
        int2bin1(key.hashCode());
        int2bin1(hash(key));
        map.put("abc","ABC");
        map.put("wsx","WSX");
        map.get("abc");

    }

    static final int hash(Object key) {
        int h;
        //计算key的hashCode, h = Objects.hashCode(key)
        //h >>> 16表示对h无符号右移16位，高位补0，然后h与h >>> 16按位异或
        //即 hashCode的后16位与前16位亦或，前16位不变
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }


    public static void int2bin1(int num) {
        int i;
        for(i = 1; i < 33; i++) {
            if((int)(num & 0x80000000) == (int)(0x80000000)){
                System.out.print(1);
            }
            else {
                System.out.print(0);
            }
            num = num << 1;
            if(i % 4 ==0) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

}
