package strings;

public class StringStringBuilderStringBuffer {
    // It is all about performance...

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String result = "";

        for(int i = 0; i < 100_000; i++) {
            result += "a";
        }

        System.out.println(result);
        System.out.println("Time spent on this action: " + (System.currentTimeMillis() - start) + "ms");
        // About 1500ms spent for this concatenation - it's a lot

        // Now try with StringBuilder
        long startStringBuilder = System.currentTimeMillis();
        StringBuilder resultStringBuilder = new StringBuilder();

        for(int i = 0; i < 100_000; i++) {
            resultStringBuilder.append("a");
        }

        System.out.println(resultStringBuilder);
        System.out.println("Time spent on this action: " + (System.currentTimeMillis() - startStringBuilder) + "ms");
    }
}
