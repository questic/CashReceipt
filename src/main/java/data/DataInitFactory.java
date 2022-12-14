package data;

import data.utils.InitType;

public class DataInitFactory {
    public DataInit getData(InitType type) {
        if (type == null) {
            return null;
        }

        if (type.equals(InitType.IN_MEMORY)) {
            return new InMemoryDataInit();
        } else if (type.equals(InitType.FROM_FILE)) {
            return new FromFileDataInit();
        }
        return null;
    }
}
