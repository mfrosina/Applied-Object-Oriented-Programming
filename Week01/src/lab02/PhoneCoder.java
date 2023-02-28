package lab02;

public class PhoneCoder {
    private int key;

    public PhoneCoder()
    {
        this(1);
    }
    public PhoneCoder(int key)
    {
        setKey(key);
    }
    public double getKey() {
        return key;
    }

    public void setKey(int key) {
        if(key > 0 && key < 10) {
            this.key = key;
        }
        else {
            this.key = 1;
        }
    }

    public int encode(int phoneNumber)
    {
        int encoded = 0;
        while(phoneNumber != 0)
        {
            int digit = phoneNumber % 10;
            phoneNumber /= 10;
            digit = (digit + key) % 10;
            encoded = encoded * 10 + digit;
        }
        int saveEncoded = 0;
        int d4 = encoded % 10;
        encoded /= 10;
        int d3 = encoded % 10;
        encoded /= 10;
        int d2 = encoded % 10;
        encoded /= 10;
        int d1 = encoded % 10;
        encoded /= 10;

        saveEncoded = (saveEncoded * 10) + d2;
        saveEncoded = (saveEncoded * 10) + d1;
        saveEncoded = (saveEncoded * 10) + d4;
        saveEncoded = (saveEncoded * 10) + d3;

        return saveEncoded;
    }
    public int decode(int encoded)
    {
        int temp = 0;
        while(encoded != 0)
        {
            int digit = encoded % 10;
            encoded /= 10;
            if(digit < key)
            {
                digit = (digit - key) + 10;
            }
            else {
                digit = (digit - key);
            }
            temp = (temp * 10) + digit;
        }
        int decoded = 0;
        int d4 = temp % 10;
        temp /= 10;
        int d3 = temp % 10;
        temp /= 10;
        int d2 = temp % 10;
        temp /= 10;
        int d1 = temp % 10;
        temp /= 10;

        decoded = decoded * 10 + d2;
        decoded = decoded * 10 + d1;
        decoded = decoded * 10 + d4;
        decoded = decoded * 10 + d3;

        return decoded;
    }
    public String toString()
    {
        String result;
        result = "PhoneCoder: " + key;
        return result;
    }
}
