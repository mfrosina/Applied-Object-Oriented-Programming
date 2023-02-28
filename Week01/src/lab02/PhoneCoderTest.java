package lab02;

public class PhoneCoderTest {
    public static void main(String[] args) {
        PhoneCoder phoneCoder = new PhoneCoder(4);
        int encoded = phoneCoder.encode(1244);
        System.out.println(encoded);
        int decoced = phoneCoder.decode(encoded);
        System.out.println(decoced);
        String toStr = phoneCoder.toString();
        System.out.println(toStr);
    }
}
