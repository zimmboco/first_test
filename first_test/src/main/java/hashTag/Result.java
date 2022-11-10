package hashTag;

import java.util.Objects;

public class Result {
    private final String name;
    private final Integer count;

    public Result(String name, Integer count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public Integer getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Result{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Result result = (Result) o;
        return Objects.equals(name, result.name) &&
                Objects.equals(count, result.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, count);
    }
}
