package repository.utils;

import model.Idable;
import model.Product;

public class FindById implements Specification<Idable>{
    private int id;

    public FindById(int id) {
        this.id = id;
    }

    @Override
    public boolean isExist(Idable impl) {
        return impl.getId() == id;
    }
}
