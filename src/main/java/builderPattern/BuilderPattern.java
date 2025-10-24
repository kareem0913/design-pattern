package builderPattern;

import java.util.Objects;

public class BuilderPattern {

    private final String name;
    private final int age;

    public BuilderPattern(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private String name;
        private int age;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public BuilderPattern build(){
            return new BuilderPattern(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BuilderPattern that = (BuilderPattern) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "BuilderPattern{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
