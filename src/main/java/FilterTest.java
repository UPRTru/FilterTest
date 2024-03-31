import java.util.Arrays;

public class FilterTest implements Filter {
    Class filterClass;

    @Override
    public Object apply(Object o) {
        if (o == null || filterClass != o.getClass()) {
            return false;
        } else {
            return true;
        }
    };

    public Object[] filter(Object[] array, Class filterClass) {
        this.filterClass = filterClass;
        return Arrays.stream(array).filter(o -> (boolean) this.apply(o)).toArray();
    }
}
