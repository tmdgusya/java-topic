package stream.byteStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteArrayInputAndOutputStreamExample {

    public static void main(String[] args) {
        byte[] inSrc = {0,1,2,3,4,5,6};
        byte[] outSrc = null;

        ByteArrayInputStream inputStream = new ByteArrayInputStream(inSrc);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        int data;

        /**
         * read() Method 는 1 Byte 씩 읽어오는 역할을 한다.
         * -1 의 경우는 읽어올 데이터가 없는 경우를 뜻한다.
         */
        while ((data = inputStream.read()) != -1) {
            outputStream.write(data);
        }

        outSrc = outputStream.toByteArray();

        System.out.println(Arrays.toString(inSrc));
        System.out.println(Arrays.toString(outSrc));
    }

}
