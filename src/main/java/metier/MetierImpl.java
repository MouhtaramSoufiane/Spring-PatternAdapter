package metier;

import dao.IDao;
import org.springframework.stereotype.Service;

@Service
public class MetierImpl implements IMetier {
    //    @Autowired
//    @Qualifier("vws")
    private IDao dao;//Couplsge faible


    public MetierImpl(IDao dao) {
        this.dao = dao;
    }


    @Override
    public double calcul() {
        int data = dao.getData();
        double res = data * 12.5;
        return res;
    }

    public IDao getDao() {
        return dao;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
