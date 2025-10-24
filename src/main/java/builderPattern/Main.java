package builderPattern;

public class Main {
    public static void main(String[] args) {
        BuilderPattern builderPattern = BuilderPattern.builder()
                .name("Kareem")
                .age(26)
                .build();

        System.out.println(builderPattern);
    }
}
