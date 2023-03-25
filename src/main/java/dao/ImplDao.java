package dao;

import org.springframework.stereotype.Repository;

@Repository
public class ImplDao implements IDao{



    @Override
    public int getData() {
        System.out.println("version base de donnes");
        int data=19;
        return data;
    }
}
