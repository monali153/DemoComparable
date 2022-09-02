import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentRegistrationMain {

    public static void main(String[] args) {

        List<Integer> registrationList = Arrays.asList(595959, 552468, 596959, 596945, 552467);

        System.out.println(registrationList);

        Collections.sort(registrationList);

        System.out.println(registrationList);
    }
}
