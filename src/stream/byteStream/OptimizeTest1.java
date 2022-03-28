package stream.byteStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class OptimizeTest1 {

    private static final int BUFFER_SIZE = 4;

    public static void main(String[] args) {

        byte[] inSrc = {0,1,2,3,4,5,6};

        byte[] outSrc = null;

        ByteArrayInputStream inputStream = new ByteArrayInputStream(inSrc);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        System.out.println("Input Source : " + Arrays.toString(inSrc));

        try {
            while (inputStream.available() > 0) {

                int bufferSize = inputStream.available();
                System.out.println("Blocking 없이 읽어올 수 있는 Byte 수 : " + bufferSize);
                byte[] buffer = new byte[bufferSize];
                /**
                 * read 에 byte[] 를 넣으면 buffer 이다.
                 */
                inputStream.read(buffer);
                outputStream.write(buffer);
                System.out.println("Buffer Pool(Before) : " + Arrays.toString(buffer));

                outSrc = outputStream.toByteArray();
                System.out.println("Buffer Pool(After) : " + Arrays.toString(buffer));
                System.out.println("Output Source : " + Arrays.toString(outSrc));

            }
        } catch (IOException ignored) {}

        System.out.println(Arrays.toString(inSrc)); // [0, 1, 2, 3, 4, 5, 6]
        System.out.println(Arrays.toString(outSrc)); // [0, 1, 2, 3, 4, 5, 6]
    }

}
