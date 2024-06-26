package metier;

import dao.IDao;
@Component

public class MetierImpl implements IMetier{
    @Autowired
    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
         double tmp= dao.getData();
         double res=tmp*540/Math.cos( tmp*Math.PI);
         return  res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
