package AdderSubstractor;

import java.util.concurrent.Callable;

public class Substractor implements Callable<Void> {
    private Value value;
    public Substractor(Value value) {
        this.value=value;
    }

    @Override
    public Void call() throws Exception {
        for (int i = 1; i <= 100; i++) {
            value.setValue(value.getValue()-i);
        }
        return null;
    }
}
