package Simple.TheJail.ServiceImpl;

import org.apache.log4j.Logger;

import Simple.TheJail.App;
import Simple.TheJail.DaoImpl.UserDaoImpl;
import Simple.TheJail.Exception.GlobalException;
import Simple.TheJail.Service.AdminDashboard;

public class AdminDashboardImpl implements AdminDashboard{
	static Logger log=Logger.getLogger(UserDashboardImpl.class);

	@Override
	public void Dashboard()  {
		// TODO Auto-generated method stub
		log.info("\t\t---------------------------welcome to Admin Dashboard--------------------");
		
	}
	

}
